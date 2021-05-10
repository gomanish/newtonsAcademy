import java.util.Scanner;

public class pairedProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long arr[] = new long[N];
		for(int i=0; i<N;i++){
			arr[i] = scn.nextInt();
		}
		long prod=1;
		for(int i=0;i<N;i=i+2){
			prod = arr[i]*arr[i+1];
			System.out.print(prod+" ");
		}
        scn.close();
    }
}
