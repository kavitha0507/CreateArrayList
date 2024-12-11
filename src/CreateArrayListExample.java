import java.util.ArrayList;

//ArraysList Methods Example:
public class CreateArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        //adding new elements to the Array list:
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");
        animals.add("Pig");
        System.out.println(animals);
        //Adding an element at a particular index
        animals.add(0, "Tiger");
        System.out.println(animals);


    }
}