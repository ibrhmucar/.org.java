package MyHomeWorks;

public class Main {

    public static void main(String[] args) {

        CustomerManager c = new CustomerManager();
        c.baseShopCalculatorManager = new SuperMarketCalculatorManager();
        c.doShopping();





    }
}
