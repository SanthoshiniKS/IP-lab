package package1;

public class Product {
String name;
        public double price;
String instock;

public Product() {
}

public Product(String name, double price,String instock) {
this.name = name;
this.price = price;
this.instock=instock;
}
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

public String getInstock() {
return instock;
}

public void setQuantity(String quantity) {
this.instock=instock;
}

}
