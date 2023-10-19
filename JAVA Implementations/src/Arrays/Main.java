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

        GenericDynamicArray<String> genericDynamicArray = new GenericDynamicArray<String>();
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        genericDynamicArray.add("hi");
        System.out.println(genericDynamicArray.isFull());
        genericDynamicArray.add("hi");
        System.out.println(genericDynamicArray.size());
        System.out.println(genericDynamicArray.remove());
        System.out.println(genericDynamicArray.size());
        genericDynamicArray.set(0,"hello");
        System.out.println(genericDynamicArray.get(0));
        System.out.println(genericDynamicArray.toString());
    }
}
