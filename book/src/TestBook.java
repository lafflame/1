public class TestBook {
    public static void main(String[] args){
        Book d1 = new Book(791, "Интерстеллар");
        Book d2 = new Book(228, "А зори здесь тихие");
        Book d3 = new Book(197,"Искусство 12 класс");
        System.out.println(d1);
        d1.Hours();
        d2.Hours();
        d3.Hours();
    }
}
