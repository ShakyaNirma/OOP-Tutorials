package Tute_1;
import java.util.Scanner;

public class ex_1 {
	public static void main(String [] args) {
	int num;
	Scanner myScanner=new Scanner(System.in);
	
	System.out.println("enter number:");;
	num=myScanner.nextInt();
	if(num>0) {
		//int i=num;
		for(int i=num;i>0;i--) {
			int value=(i*(i-1));
			//System.out.println(i*(i-1));
			System.out.println(i+"!="+(i*(i-1)));
			
		}
	}
}
}
