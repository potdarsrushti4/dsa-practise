import java.util.ArrayList;
import java.util.Scanner;
public class array_list{
    
    public static void main(String[] args) {
        // int[] arr=new int[4];
        Scanner in=new Scanner(System.in);
        // for (int i=0;i<4;i++){
        //     System.out.print("Enter element "+i+" : ");
        //     arr[i]=in.nextInt();
        // }

        // for(int i=0;i<4;i++)
        // {
        //     System.out.print(arr[i]);
        // }
        // System.out.print(Arrays.toString(arr));

        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter element "+i+" : ");
            list.add(in.nextInt());
        }

        System.out.print(list);

    }
}

