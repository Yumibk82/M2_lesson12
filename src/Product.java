import java.util.ArrayList;
import java.util.Comparator;

public class Product {
    private Integer id;
    private String name;
    private Double price;

    public Product(){

    }
    public Product(int id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void sort(ArrayList<Product> products, Comparator<String> stringComparator) {
    }

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString(){
        return "Information of product "
                +id
                +name
                +price;
    }
}
