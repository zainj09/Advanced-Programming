import java.util.*;

public class mySortedSet {
    public static void main(String[] args) {

        //as it is an interface so anonymous class is implemented as follows...

        SortedSet ss = new SortedSet() {
            @Override
            public Comparator comparator() {
                return null;
            }

            @Override
            public SortedSet subSet(Object fromElement, Object toElement) {
                return null;
            }

            @Override
            public SortedSet headSet(Object toElement) {
                return null;
            }

            @Override
            public SortedSet tailSet(Object fromElement) {
                return null;
            }

            @Override
            public Object first() {
                return null;
            }

            @Override
            public Object last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
}
