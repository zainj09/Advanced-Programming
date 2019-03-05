import java.util.*;
public class myNavigableSet {
    public static void main(String args[]) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        NavigableSet<Integer> reverseNs = ns.descendingSet();

        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);

        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("3 or  more:  " + threeOrMore);
        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("pollLast(): " + ns.pollLast());

        NavigableSet original = new TreeSet();
        original.add("1");
        original.add("2");
        original.add("3");

        SortedSet headset = original.headSet("3");

        NavigableSet headset1 = original.headSet("3", true);

        NavigableSet original1 = new TreeSet();
        original1.add("1");
        original1.add("2");
        original1.add("3");
        original1.add("4");
        original1.add("5");

        SortedSet subset  = original1.subSet("2", "4");

        NavigableSet subset1 = original1.subSet("2", true, "4", true);
    }
}
