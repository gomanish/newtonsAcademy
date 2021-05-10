import java.util.Scanner;

public class isThisIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int arr[]=new int[N];
		for(int i=0; i<N; i++){
			arr[i] = scn.nextInt();
		}
        scn.close();
					  
		for(int i=0; i<=N-3; i++){
		    if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2]){
			    System.out.println("Yes");
			    return;
		    }
		}
		System.out.println("No");
    }
}
