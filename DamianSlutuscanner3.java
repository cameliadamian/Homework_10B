import java.util.Scanner;
public class DamianSlutuscanner3 {
	public static void main(String[] args) {
Scanner qwer = new Scanner(System.in);
System.out.println("Introduceti cantitatea de fructe uscate:");
double m=qwer.nextByte();
System.out.println("Introduceti procentajul de pierdere a mesei:");
double p=qwer.nextByte();
double x=(100*m)/p;
System.out.println("Cantitatea de fructe necesara:"+x);
qwer.close();
}
}