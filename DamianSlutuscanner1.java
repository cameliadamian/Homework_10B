import java.util.Scanner;
public class DamianSlutuscanner1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int h=sc.nextInt();
int m=sc.nextInt();
int p1=h+m;
System.out.println("Perioada in ore si minute:"+p1);
int p2=h*60+m;
System.out.println("Perioada doar in minute:"+p2);
sc.close();
}
}