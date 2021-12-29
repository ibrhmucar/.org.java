package day43_polymorphism;

public class AppleStore {
    public static void main(String[] args) {

        AppleDevice mac = new Mac();
        mac.use();

        Mac myMac = new Mac();
        myMac.code();
        myMac.use();


        AppleDevice watch = new AppleWatch();
        watch.use();


    }
}
