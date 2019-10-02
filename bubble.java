import java.util.*;
import java.io.*;
class Bubblesort
{
    void bubblesort(int arr[])
    {
        int temp;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");      
        }

    }
}
class Bubble
{
    public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int []arr=new int[5];
       for(int k=0;k<arr.length;k++)
       {
           arr[k]=sc.nextInt();
       }
       Bubblesort ob=new Bubblesort();
       ob.bubblesort(arr);
       ob.print(arr);
   }
}
