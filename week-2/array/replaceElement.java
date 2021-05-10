import java.util.Scanner;

public class replaceElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=scn.nextInt();
        }
        scn.close();
        int pre=arr[0],curr=1;
        for(int i=0;i<N;i++)
        {
           if(i==0)
           {
               arr[i]=arr[i]*arr[i+1]; 
           }
           else if(i==N-1)
           {
               arr[i]=pre*arr[i];
           }
           else
           {
               curr = arr[i];
               arr[i]=pre*arr[i+1];
               pre = curr;
           }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
