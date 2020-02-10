import java.util.Scanner;
public class cameliadamian_b {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int y1=x+3, y2=x-3;
		if(x>5) {
			y=y1;}
		else {
			y=y2;}
		System.out.println("x="+x+",y="+y);
		sc.close();
		}
	}


