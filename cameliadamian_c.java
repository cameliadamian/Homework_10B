import java.util.Scanner;
public class cameliadamian_c {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int y1=x,y2=x+4;
	if (x>=3) {
		y=y1;}
	else {
		y=y2;}
	System.out.println("x="+x+",y="+y);
	sc.close();
	}
	

}
