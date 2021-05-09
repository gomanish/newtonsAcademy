//Average marks
import java.util.*;


public class second {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float sum = 0;
        int count = 0;
        int N = s.nextInt();
        while(N>0)
        {
            sum +=s.nextFloat();
            count ++;
            N--;
        }
        System.out.println((int)sum/count);
        s.close();
    }
}
