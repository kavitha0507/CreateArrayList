import java.util.ArrayList;
import java.util.Iterator;

public class IterateOverArrayList {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Fantasy");
        movies.add("Drama");
        movies.add("ComedyShow");
        movies.add("Family");
        movies.add("Science Fiction");
        movies.add("Action");
        System.out.println("/n===Iterate using an iterator()===");
        Iterator<String> moviesIterator = movies.iterator();
        while (moviesIterator.hasNext()) {
            String movie = moviesIterator.next();
            System.out.println(movie);

        }

    }
}
