import java.util.Scanner;

public class sumMean {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int []arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scn.nextInt();
        }
        int sum = 0;   
        for(int i=0;i<N;i++){
            sum+= arr[i];
        }
        System.out.println(sum+" "+ (int)Math.floor(sum/N));
        scn.close();
    }
}
