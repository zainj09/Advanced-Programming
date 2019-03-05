import java.util.*;

public class myVector{
    public static void main(String[] args) {

//vector with homogenous data
        Vector<Integer>v=new Vector<Integer>(7);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(3,9);

        System.out.println(v.capacity());
        System.out.println(v.size());

        Vector<Integer>v1=new Vector<Integer>();
        for(int i=0;i<5;i++){
            v1.add(i+5);
        }
        v.addAll(3,v1);
        System.out.println(v);

        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println(v.get(5));
        v.addElement(5);

        Object temp=v.clone();
        System.out.println("vector clone "+temp);

        if(v.contains(5)){
            System.out.println("yes");
        }

        v.setSize(12);
        System.out.println(v.firstElement());

        v.clear();
        System.out.println("vector v cleared "+v);

//vector with non homogenous data
        Vector v2=new Vector();
        v2.add('z');
        v2.add(9);
        System.out.println(v1);
    }

}
