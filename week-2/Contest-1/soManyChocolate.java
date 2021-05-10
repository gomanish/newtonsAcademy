import java.util.Scanner;

/**
 * soManyChocolate
 */
public class soManyChocolate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int sum = 0;
        for(int i=0;i<N;i++)
        {
            sum += scn.nextInt();
        }
        scn.close();
        System.out.print(sum);
    }
}