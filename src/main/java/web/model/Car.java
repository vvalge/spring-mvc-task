package web.model;

public class Car {
    private String owner;
    private String brand;
    private int year;

    public Car(String owner, String brand, int year) {
        this.owner = owner;
        this.brand = brand;
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car:" +
                "owner='" + owner + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
