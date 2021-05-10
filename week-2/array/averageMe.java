import java.util.*;
public class averageMe {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
	    long N = s.nextInt();
	    long sum = 0;
	    for(int i=0;i<N;i++){
		    sum+=s.nextInt();
	    }
	    System.out.println((int)Math.floor(sum/N));
        s.close();
    }
}
