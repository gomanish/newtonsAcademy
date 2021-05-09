// Count multiples of N

import java.util.*;
public class fourth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int count = 0;
        for(int i=1; i<=100; i++){
            if(i%N==0){
                count++;
            }
        }
        System.out.print(count);
        scn.close();
    }
    
}
