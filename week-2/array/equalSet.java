import java.util.Scanner;
public class equalSet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long sum = (n*(n+1))/2;
        if(sum%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        scn.close();
    }
}
