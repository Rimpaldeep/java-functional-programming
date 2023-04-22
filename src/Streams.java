import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        IntStream stream = IntStream.range (0,10);
 //     stream.forEach (i -> System.out.println (i));
 //     stream.map (i -> i*2).forEach (i-> System.out.println (i));
 //     stream.filter (i -> i >=6).forEach (i -> System.out.println (i));

        Collection <Collection <String>> student = new ArrayList<> ();

        Collection<String> names = new ArrayList<> ();
        names.add ("Rimpal");
        names.add ("Manpreet");
        names.add ("Rimpal");
        System.out.println (names);
//        names.stream ().map (i -> i.toUpperCase ()).forEach (i -> System.out.println (i));

//        List<String> collect = names.stream ().map (i -> i.toUpperCase ()).collect (Collectors.toList ());
//        System.out.println (collect);

//        Set<String> collect = names.stream ().map (i -> i.toUpperCase ()).collect (Collectors.toSet ());
//        System.out.println (collect);

//        String collect = names.stream ().map (i -> i.toUpperCase ()).collect (Collectors.joining (" - "));
//        System.out.println (collect);

//        Map<Character, String> collect = names.stream ().map (i -> i.toUpperCase ()).collect (Collectors.toMap (s -> s.charAt (0), s -> s,
//                (k1,k2) -> k2));
//        System.out.println (collect);

        Collection <String> address = new ArrayList<> ();
        address.add ("Brampton");
        address.add ("Toronto");
        address.add ("Mississauga");

        student.add (names);
        student.add (address);

        student.stream ().flatMap (i -> i.stream ()).forEach (i -> System.out.println (i));

//        boolean b = address.stream ().map (i -> i.toUpperCase ()).allMatch (i -> i.startsWith ("B"));
//        System.out.println (b);

        boolean b = address.stream ().map (i -> i.toUpperCase ()).anyMatch (i -> i.startsWith ("B"));
        System.out.println (b);

        Optional<String> first = address.stream ().map (i -> i.toUpperCase ()).findFirst ();
        System.out.println (first);


    }
}
