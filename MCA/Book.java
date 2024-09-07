class BooksDetails{
    int price;
    String title;
    BooksDetails(int val1,String val2){
        this.price=val1;
        this.title=val2;
    }
    public void getPrice(){
        System.out.println("Price="+price);
    }
    public void getTitle(){
        System.out.println("Book="+title);
    }
}
class Book extends BooksDetails {
    Book(int val1,String val2){
        super(val1, val2);
    }
    public static void main(String args[]){
        Book b=new Book(300,"Physics");
        b.getTitle();
        b.getPrice();
    }
}