package day46_collection_part1;

public class Product implements Comparable<Product>{

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

     @Override
        public int compareTo(Product anotherProduct) {
        if(this.price>anotherProduct.price){
            return 1;
        }else if(this.price==anotherProduct.price){
            return 0;
        }else{
            return -1;
        }
    }
}
