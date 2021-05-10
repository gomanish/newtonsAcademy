import java.util.Scanner;

public class divisorProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        scn.close();
        int count = 0;
        while(N!=1){
            int i=N-1;
            while(N%i!=0){
                i=i-1;
            }
            N=i;
            count++;
        }
        System.out.print(count);

    }
}
