public class Linear_search{
    public static void main(String[] args)
    {
        int flag=0;
        int key=10;
        int[] arr={45,64,32,50,21,65,2,55};

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.print("Element found at index : "+i);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("Element not found!!");
        }
    }
}