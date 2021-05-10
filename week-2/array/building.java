import java.util.*;
public class building {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
		long count = 0;
		long max=0;
		for(long i=0;i<N;i++){
			long temp = scn.nextInt();
			if(max<temp){
				max=temp;
				count++;
			}
		}
		System.out.println(count);
        scn.close();
    }
}
