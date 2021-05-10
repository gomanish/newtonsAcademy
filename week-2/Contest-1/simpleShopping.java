import java.util.Scanner;

public class simpleShopping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
        scn.close();
		if(N<=200){
			System.out.print(200-N);
		} 
		else if(N<=400){
			System.out.print(400-N);
		}
		else
		{
    		System.out.print((100-N%100)%100);
		}
    }
}
