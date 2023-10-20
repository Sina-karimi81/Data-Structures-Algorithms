import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        System.out.println(array);
        array.insert(40);
        System.out.println(array);
        array.removeAt(0);
        System.out.println(array);
        System.out.println(array.indexOf(30));
        array.insertAt(2 , 50);
        System.out.println(array);
        System.out.println(array.get(1));
        System.out.println(array.max());
        array.reverse();
        System.out.println(array);
        Array intersect = array.intersect(new int[]{10, 20});
        System.out.println(intersect);

    }

}
