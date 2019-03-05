import java.util.*;
public class myArray {
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
       for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

       int b[]={33,3,4,5};

        int min=a[0];
        for(int i=1;i<a.length;i++)
            if(min>a[i])
                min=a[i];

        System.out.println(min);

        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int arr1[][] = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[4];
        arr1[2] = new int[2];

        int count = 0;
        for (int i=0; i<arr1.length; i++)
            for(int j=0; j<arr1[i].length; j++)
                arr1[i][j] = count++;

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
