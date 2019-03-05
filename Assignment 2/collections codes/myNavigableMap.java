import java.util.*;
public class myNavigableMap {
    public static void main(String args[]) {
        NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);

        System.out.printf("Descending Set  : %s%n",
                nm.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n",
                nm.floorEntry("L"));
        System.out.printf("First Entry  : %s%n",
                nm.firstEntry());
        System.out.printf("Last Key : %s%n",
                nm.lastKey());
        System.out.printf("First Key : %s%n",
                nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n", nm.descendingMap());

        NavigableMap original1 = new TreeMap();
        original1.put("1", "1");
        original1.put("2", "2");
        original1.put("3", "3");


        Map.Entry higherEntry = original1.higherEntry("2");

        Map.Entry lowerEntry = original1.lowerEntry("2");


    }

}