import java.lang.*;
public class Ball {
    private int size;
    private String brand;
    public Ball(int s, String b){
        size = s;
        brand = b;
    }
    public Ball(){
        size = 5;
        brand = "Abobus";
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getSize(int size){
        return size;
    }
    public String getBrand(String brand){
        return brand;
    }
    public String ToString(){
        return this.size + " – size of a Ball" + this.brand + " – brand of a Ball";
    }
    public void Info(){
        System.out.println(size + " – size, " + brand + " – Brand");
    }
}
