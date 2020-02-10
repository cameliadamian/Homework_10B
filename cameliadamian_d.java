import java.util.Scanner;
public class cameliadamian_d {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int y1=x, y2=2*x;
		if(Math.abs(x)>5) {
			y=y1;}
		else {
			y=y2;}
		System.out.println("x="+x+",y="+y);
		sc.close();
	}
}
