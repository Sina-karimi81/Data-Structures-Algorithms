import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String input = "green apple";
        System.out.println("getTheFirstNonRepeated(input) = " + getTheFirstNonRepeated(input));
        System.out.println("getTheFirstRepeated(input) = " + getTheFirstRepeated(input));
        String input2 = "aabbccdd";
        System.out.println("getTheFirstNonRepeated(input2) = " + getTheFirstNonRepeated(input2));
        System.out.println("getTheFirstRepeated(input2) = " + getTheFirstRepeated(input2));

        var hashTable = new HashTable();
        hashTable.put(3 , "Sina");
        hashTable.put(8 , "Ali");
        hashTable.put(1 , "Reza");
        hashTable.put(2 , "mmd");
        System.out.println("hashTable.get(8) = " + hashTable.get(8));
        hashTable.remove(3);
        System.out.println("Done");
    }

    public static String getTheFirstNonRepeated(String input) {
        var map = new HashMap<Character , Boolean>();

        for (var c: input.toCharArray()) {
            Boolean aBoolean = map.containsKey(c) ? map.put(c, false) : map.put(c, true);
        }

        for (var c: input.toCharArray()) {
            if (map.get(c)) {
                return String.valueOf(c);
            }
        }
        return String.valueOf(Character.MIN_VALUE);
    }

    public static String getTheFirstRepeated(String input) {
        var set = new HashSet<Character>();

        for (var c: input.toCharArray()) {
            if (set.contains(c)) {
                return String.valueOf(c);
            }
            set.add(c);
        }

        return String.valueOf(Character.MIN_VALUE);
    }
}
