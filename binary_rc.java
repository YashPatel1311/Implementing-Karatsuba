import java.util.*;
class binary_rc
{
    public static int binary_search(int arr[],int key){
        return binary_search(arr,key,0,arr.length-1);
    }
    private static int binary_search(int arr[],int key,int low,int high){
        if (low > high){
            return -1;
        }
        else{
            int mid = (high+low)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                return binary_search(arr,key,low,mid-1) ;
            else 
                return binary_search(arr,key,mid+1,high) ;
        }
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--> Enter size of array : ");
        int size = sc.nextInt();

        System.out.println("-----> Enter list of number : ");
        int[] arr = new int[size];

        for(int i=0; i < size; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("-------> Enter a number which you want to search : ");
        int key = sc.nextInt();

        int index = binary_search(arr,key);

        if (index == -1)
        {
            System.out.println(+key+" is NOT FOUND in array !!");
        }
        else {
            System.out.println(key+ " is at index of "+index);
        }

    }
}
