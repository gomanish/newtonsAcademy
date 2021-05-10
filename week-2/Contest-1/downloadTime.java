import java.util.Scanner;

public class downloadTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int fileSize = scn.nextInt();
		int downloadSpeed = scn.nextInt();
        scn.close();
		System.out.print((fileSize*8)/downloadSpeed);
    }
}
