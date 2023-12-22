import java.lang.*;
public class Dog {
    private String name;
    private int age;
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(){
        name = "Puppey";
        age = 0;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(int age){
        return age;
    }
    public String toString(){
        return this.name+", age"+this.age;
    }
    public void intoHuman(){
        System.out.println(name+"'s age in human years is " + age*7 + " years");
    }
}
