package javaapplication10;

/**
 *
 * @author diego
 */
public class Cars {
    private String brand;
    private String color;

    public Cars(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coches{" + "Marca=" + brand + ", Color=" + color + '}';
    }
    
    
}
