import java.util.*;
public class myList {
    public static void main(String args[]) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");
        System.out.println(listStrings);

        List<Number> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(new Integer(123));
        linkedNumbers.add(new Float(3.1415));
        linkedNumbers.add(new Double(299.988));
        linkedNumbers.add(new Long(67000));

        listStrings.add(1, "Four");
        String element = listStrings.get(1);
        Number number = linkedNumbers.get(3);

        LinkedList<Number> numbers = new LinkedList<Number>();
        Number first = numbers.getFirst();
        Number last = numbers.getLast();

        listStrings.set(2, "Hi");

        listStrings.remove(2);

        listStrings.remove("Two");

        if (listStrings.remove("Ten")) {
            System.out.println("Removed");
        } else {
            System.out.println("There is no such element");
        }

        listStrings.clear();

        Iterator<String> iterator = listStrings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<Number> iterator1 = linkedNumbers.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        listStrings.forEach(s -> System.out.println(s));


        if (listStrings.contains("Hello")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        int firstIndex = linkedNumbers.indexOf(1234);
        int lastIndex = listStrings.indexOf("Hello");
    }
}
