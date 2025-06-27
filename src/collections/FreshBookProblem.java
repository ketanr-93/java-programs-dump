package collections;
import java.util.*;

public class FreshBookProblem {

    public static void main(String[] args)
    {
        ArrayList<String> booklist = new ArrayList<>();
        booklist.add("Daring Greatly");
        booklist.add("The Lean Startup");
        booklist.add("The Innovator's Dilemma");
        booklist.add("Rework");
        booklist.add("Remote");
        booklist.add("The Phoenix Project");
        booklist.add("The Unicorn Project");
        booklist.add("The Five Dysfunctions of a Team");
        booklist.add("The Goal");
        booklist.add("The Lean Manager");
        booklist.add("Remote");
        booklist.add("The Phoenix Project");
        booklist.add("The Unicorn Project");
        booklist.add("The Lean Startup");
        booklist.add("The Lean Manager");
        booklist.add("Harry Potter");
        booklist.add("Batman Begins");
        booklist.add("The Dark Knight");
        booklist.add("The Dark Knight Rises");
//        System.out.println("Number of books: " + booklist.size());
//
//        Set<String> distinctBooks = new HashSet<>(booklist);
//        System.out.println("Number of distinct books: " + distinctBooks.size());
//        System.out.println("Distinct books: " + distinctBooks);

        Map<String,ArrayList<String>> bookWithGenre = new HashMap<>();
        ArrayList<String> businessBooks = new ArrayList<>();
        businessBooks.add("Daring Greatly");
        businessBooks.add("The Lean Startup");
        businessBooks.add("The Innovator's Dilemma");
        businessBooks.add("Rework");
        businessBooks.add("Remote");
        businessBooks.add("The Phoenix Project");
        businessBooks.add("The Unicorn Project");
        businessBooks.add("The Five Dysfunctions of a Team");
        businessBooks.add("The Goal");
        businessBooks.add("The Lean Manager");

        ArrayList<String> fictionBooks = new ArrayList<>();
        fictionBooks.add("Harry Potter");
        fictionBooks.add("Batman Begins");
        fictionBooks.add("The Dark Knight");
        fictionBooks.add("The Dark Knight Rises");

        bookWithGenre.put("Business", businessBooks);
        bookWithGenre.put("Fiction", fictionBooks);

        for(Map.Entry entry:bookWithGenre.entrySet())
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }



    }
}
