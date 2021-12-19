package MyWorks;
import java.util.Scanner;
public class TimeAndMoneyMakerChanger {

	public static void main(String[] args) {
	
		
		
	 	/*System.out.println(7300/60);
		System.out.println(7300%60);
		System.out.println(121/60);
		System.out.println(121%60);*/
		
		int a=165000;
		int saniye = a%60;
		int dakika = a/60;
		int kalan_dakika= dakika%60;
		int saat = dakika/60;
		int kalan_saat=saat%24;
		int gun=saat/24;
		
		System.out.println(a +" saniye : "+   gun + " gün "+ kalan_saat + " saat, " + kalan_dakika + " dakika " + saniye + " saniyedir.");
		
		
		
		
		int b=98;				
		
		int quarters=b/25;
		int kalanquarters=b%25;
		int dimes=kalanquarters/10;
		int kalandimes=kalanquarters%10;
		int nickels=kalandimes/5;
		int kalannickels=kalandimes%5;
		int pennis=kalannickels/1;
		
		System.out.println(b +" cents equlas : " + quarters + " quarters, "+ dimes + " dimes, " + nickels + " nickels, " +  pennis + " pennies ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
