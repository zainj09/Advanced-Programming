import java.util.*;


public class myHashSet {
    public static void main(String[] args) {

        HashSet<Integer> h= new HashSet<Integer>();

        HashSet<Integer> h1= new HashSet<Integer>(5);

        HashSet<Integer> h2= new HashSet<Integer>(5,0.85f);

        HashSet<String> popularCities = new HashSet<>();

        h.add(11);
        h.add(21);
        h.add(13);
        h.add(40);
        System.out.println(h.size());
        h.spliterator();

        System.out.println("Is popularCities set empty? : " + popularCities.isEmpty());

        popularCities.add("London");
        popularCities.add("New York");
        popularCities.add("Paris");
        popularCities.add("Dubai");

        System.out.println(popularCities.hashCode());

        System.out.println("Number of cities in the HashSet " + popularCities.size());

        if(popularCities.contains("Paris")) {
            System.out.println("Paris" + " is in the popular cities set.");
        } else {
            System.out.println("Paris" + " is not in the popular cities set.");
        }

        System.out.println(h);
        System.out.println(popularCities);
    }
}