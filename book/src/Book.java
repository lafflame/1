import java.lang.*;
public class Book {
    private int Pages;
    private String BookTitle;
    public Book(int p, String n){
        Pages = p;
        BookTitle = n;
    }
    public Book(){
        BookTitle = "Собачье сердце";
        Pages = 208;
    }
    public void setPages(int Pages){
        this.Pages = Pages;
    }
    public void setBookTitle(String BookTitle){
        this.BookTitle = BookTitle;
    }
    public String getBookTitle(String BookTitle){
        return BookTitle;
    }
    public int getPages(int pages){
        return pages;
    }
    public String ToString(){
        return this.BookTitle + " – " + this.Pages + " – кол-во страниц.";
    }
    public void Hours(){
        System.out.println(Pages + " pages read in " + Pages/100 + " hours");
    }
}
