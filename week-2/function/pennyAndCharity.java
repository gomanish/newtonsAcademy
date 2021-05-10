import java.util.Scanner;

public class pennyAndCharity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        if(M<=N || M/N==1)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(M/N);
        }
        scn.close();
    }
}
