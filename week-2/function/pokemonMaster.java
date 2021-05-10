import java.util.Scanner;

public class pokemonMaster {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        scn.close();
        if(A>=B){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}
