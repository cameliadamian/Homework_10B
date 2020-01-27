import java.util.Scanner;
public class DamianSlutuscanner2 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int l=(int) Math.sqrt(a*a+b*b);
System.out.println("Ipotenuza:"+l);
sc.close();
	}
}
