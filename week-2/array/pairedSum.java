//  Simple Paired Sum
import java.util.*;
public class pairedSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long arr[] = new long[N];
		for(int i =0;i<N;i++){
			arr[i] = scn.nextInt();
		}
		for(int i=0;i<N;i+=2){
			System.out.print(arr[i]+arr[i+1]+" ");
		}
		System.out.println();
        scn.close();
    }
}
