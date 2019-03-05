import java.util.*;

public class myArrayList {
    public static void main(String[] args) {

        int n = 5;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n);

        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.remove(3);

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
//same methods as vector

    }
}
