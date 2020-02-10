import java.util.Scanner;
public class cameliadamian_ifstatement1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		double x=sc.nextInt();
		double y=sc.nextInt();
		double y1=Math.pow(x,2),y2=x+1;
		if(x<-5) {
			y=y1;}
		else if(x>=2) {
			y=y2;}
	
		System.out.println("x="+x+",y="+y);
		sc.close();
	}
}
