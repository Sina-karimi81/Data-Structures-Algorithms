
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTable {

    LinkedList<Entry>[] hashTable = null;

    public HashTable () {
        hashTable = new LinkedList[5];
    }

    public void put(int key , String value) {
        var index = hashFunction(key);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<Entry>();;
        }

        var bucket = hashTable[index];
        for (var entry : bucket) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }

        bucket.addLast(new Entry(key , value));
    }

    public String get(int key) {
        int index = hashFunction(key);
        if (hashTable[index] == null) {
            throw new NoSuchElementException();
        }

        for (Entry entry : hashTable[index]) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(int key) {
        int index = hashFunction(key);
        if (hashTable[index] == null) {
            throw new NoSuchElementException();
        }

        for (Entry entry : hashTable[index]) {
            if (entry.getKey() == key) {
                hashTable[index].remove(entry);
                return;
            }
        }

        throw new NoSuchElementException();
    }

    private int hashFunction(int key) {
        return key % hashTable.length;
    }
}
