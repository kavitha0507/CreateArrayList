import java.util.ArrayList;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");
        fruits.add("Pineapple");
        fruits.add("Watermelon");
        System.out.println("Initial List:"+fruits);
        fruits.remove("Apple");
        System.out.println("After removing Apple:"+fruits);


    }
}
