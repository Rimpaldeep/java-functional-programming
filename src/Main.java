import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new EnglishGreeting ();
        System.out.println (greeting.greeting ("Rimpal"));

       Capitilize capitilize = (str) -> str.toUpperCase ();
        System.out.println (capitilize.capitilize ("mehak"));

        // how to write lambda to print "Hello" three times
        Multiplier obj1 = (s, m) -> {
            String temp = "";
            for (int i = 0; i < m; i++) {
                temp = temp + " " + s;
            }
            return temp;
        };
        System.out.println (obj1.multiply ("Hello", 3));


        List<String> names = Arrays.asList ("Tony", "Adam", "Rimpal", "Vivek");
        //aslist will always give a list which is immutable;
        //to make it mutable do as:
        ArrayList<String> list = new ArrayList<> (names);

        list.forEach (System.out::println);
        //println takes one argument and returns nothing
        list.removeIf (new Utils ()::test4);
        System.out.println (list);


        Game game = (home,away) -> Math.random ()>0.5? home: away;
        Team team = game.playGame (new Team ("Blue Jays", "Canada"), new Team ("Yankees", "USA"));
        System.out.println (team);

        //Biconsumer accepts two inputs but return nothing
        BiConsumer<String, Integer> biConsumer = (a, b) -> {
            System.out.println (a);
            System.out.println (b);
        };
         //Function accepts "T" and returns "R"
        // in the below statement function is taking a string and returning an integer
        Function<String, Integer> function = Integer::parseInt;

        BiFunction<String, String, Integer> biFunction = String::compareTo;

        BiPredicate<Integer, Integer> biPredicate = (a,b) -> a.equals (b);
    }

    interface Capitilize {
        String capitilize (String str);
    }

    interface Multiplier {
        String multiply(String str, int multiplier);
    }
}