package MyHomeWorks;

import java.util.Scanner;

public class CustomerManager {
    // Belirlenen sınıfa göre hesaplamalar yapmak istediğimiz için:
    BaseShopCalculatorManager baseShopCalculatorManager;

    Scanner scanner = new Scanner(System.in);
    void doShopping(){
        System.out.println("-------------------\n-> Ekmek Hesaplaması\n-------------------");
        System.out.print("-> Kaç Ekmek Alacaksınız: ");
        int x = scanner.nextInt();
        System.out.println("-> Ekmek Fiyatı: "+baseShopCalculatorManager.breadBuy(x)/x+" TL");
        System.out.println("-> Almış Olduğunuz "+ x +" Ekmek İçin Ödeyeceğiniz Fiyat: "+baseShopCalculatorManager.breadBuy(x)+" TL");
        System.out.println("-------------------");
    }



}