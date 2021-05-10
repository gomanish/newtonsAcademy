import java.util.Scanner;

public class rotationPolicy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int count =0;
        boolean arr[] = {false,true,false,false,false,true};
        while(A<=B){
            if(arr[(A-1)%6]){
                count++;
            }
            A++;
        }
        System.out.print(count);
        scn.close();
    }
}
