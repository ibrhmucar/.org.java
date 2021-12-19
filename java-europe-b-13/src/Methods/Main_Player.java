package Methods;



import java.util.Scanner;

public class Main_Player {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("En yakın sayıyı bulma oyununa hoş geldiniz...");
		int keep =(int)( Math.random()*100);
		System.out.println("Oyunu kaç kişi oynamak istiyorsunuz");
		
		player [] oyuncular ;
		int input = scan.nextInt();
		
		oyuncular = player.createPlayer(input);
		
		for(int i=0 ; i<input ; i++) {
			System.out.println();
			System.out.println("Lütfen "+(i+1)+" numaralı oyuncu için isim giriniz: ");
			String a = scan.next();
			oyuncular[i].name = a;
			System.out.println("Lütfen "+(i+1)+" numaralı oyuncu 0-100 arası bir sayı tahmin edin: ");
			int b =scan.nextInt();
			oyuncular[i].num = b;
		}
		
		System.out.println("Girilen sayılar kontrol ediliyor.....");
		 try{ 
		       Thread.sleep(1000); 
		       }catch(InterruptedException e){} 
		
		 int index = player.closest(oyuncular,keep);
		System.out.println();
		 System.out.println("Makinamızın tahmin ettiği sayı: "+ keep);
		System.out.println("En yakın tahminde bulunan kişi: "+ oyuncular[index].name);
		
		
		
		
	

	
	}
}

