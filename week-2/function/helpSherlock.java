import java.util.Scanner;

/**
 * helpSherlock
 */
public class helpSherlock {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        boolean temp = true;
        if(N%M==0){
            System.out.print("1");
            temp = false;
        }
        if(temp==true){
            System.out.print("0");
        }
        scn.close();
    }
}