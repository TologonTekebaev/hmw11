/**
 * Created by Tologon on 3/8/23 at 20:52.
 */
public class Car {
    private String nameOfCar;
    private String madeOf;
    private double engineSize;
    private double price;
    private String color;

    public Car(){

    }

    public Car(String nameOfCar, String madeOf,
               double engineSize, double price, String color) {
        this.nameOfCar = nameOfCar;
        this.madeOf = madeOf;
        this.engineSize = engineSize;
        this.price = price;
        this.color = color;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
