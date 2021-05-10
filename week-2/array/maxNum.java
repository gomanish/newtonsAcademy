import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class maxNum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
			//int N = scn.nextInt();
			int N = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] strArr = str.split(" ");
			long arr[] = new long[N];
			for(int i=0; i<N; i++){
				//arr[i] = scn.nextLong();
				arr[i] = Integer.parseInt(strArr[i]);
			}
			long max1 = 0, max2 = 0, max3 = 0;
			int idx =0;
			//1st maximum
			for(int i=0; i<N; i++){
				if(max1 < arr[i]){
					max1 = arr[i];
					idx = i;
				}
			}
			arr[idx] = 0;
			//2nd maximum
			for(int i=0; i<N; i++){
				if(max2 < arr[i]){
					max2 = arr[i];
					idx = i;
				}
			}
			arr[idx] = 0;
			//3rd maximum
			for(int i=0; i<N; i++){
				if(max3 < arr[i]){
					max3 = arr[i];
				}
			}
			System.out.println(max1 +" " + max2 +" " + max3);
		}

    }
    
}
