package Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        array.add(5);
        System.out.println(array.isFull());
        array.add(5);
        System.out.println(array.size());
        System.out.println(array.remove());
        System.out.println(array.size());
        array.set(0,4);
        System.out.println(array.get(0));
        System.out.println(array.toString());


    }
}
