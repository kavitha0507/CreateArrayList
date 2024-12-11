import java.util.ArrayList;
import java.util.List;

public class CreatingArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //creating an ArrayList from another collection:
        List<String> letters = new ArrayList<>(list);
        List<String> vowls = new ArrayList<>();
        vowls.add("a");
        vowls.add("e");
        vowls.add("i");
        vowls.add("o");
        vowls.add("u");

        letters.addAll(vowls);
        System.out.println(letters);

    }

}
