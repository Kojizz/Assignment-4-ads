import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Hash table test
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(100000));
            Student student = new Student("Student" + i, 18 + rand.nextInt(10));
            table.put(key, student);
        }

        table.printBucketSizes();

        // BST test
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "Five");
        tree.put(3, "Three");
        tree.put(7, "Seven");
        tree.put(1, "One");

        System.out.println("In-order traversal:");
        for (var entry : tree) {
            System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue());
        }
    }
}
