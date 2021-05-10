import java.util.Scanner;

public class sumProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int sum=0;
        int prod = 1;

        for(int i=1;i<=N;i++){
            if(i%2 ==0){
                sum+=scn.nextInt();
            }
            else{
                prod*=scn.nextInt();
            }
        }
        scn.close();
        System.out.print(sum+" "+prod);
    }
}
