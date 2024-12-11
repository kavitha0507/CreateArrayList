import java.util.ArrayList;
import java.util.List;

public class SearchingElement {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomoto");
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Beetroot");
        vegetables.add("Salad");
            //check if an ArrayList contains a given element
        System.out.println("Does vegetables array contain\"Potato\"? " + vegetables.contains("Potato"));
        //find the index i=of the first occurence of an element in an ArrayList
        System.out.println("indexOf\" Beetroot\" :" + vegetables.indexOf("Beetroot") );
        System.out.println("indexOf\" Salad\" :" + vegetables.indexOf("Salad") );
        //find the index i=of the first occurence of an element in an ArrayList
        System.out.println("lastIndexOf\" Potato\" :" + vegetables.lastIndexOf("Potato") );
        System.out.println("lastIndexOf\" Tomoto\" :" + vegetables.lastIndexOf("Tomoto") );
    }
}
