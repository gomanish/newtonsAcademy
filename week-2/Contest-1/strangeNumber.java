import java.util.Scanner;

public class strangeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
	    int N = scn.nextInt();
        scn.close();
	    int strange=0;
		int sum=0;
		for(int i=0;i<N;i++){
			do{
				sum=0;
				int j=strange;
				while(j!=0){
					sum+=j%10;
					j=j/10;
				}
				strange++;
			}while(sum%9!=0);
		}
		System.out.println(strange-1);
    }
}
