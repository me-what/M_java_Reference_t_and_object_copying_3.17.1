public class Main {
    public static void main(String[] args) {
        try{
            Book book = new Book("War and Peace", "Leo Tolstoy");
            Book book2 = book.clone();
            book2.setAuthor("Ivan Turgenev");
            System.out.println(book.getAuthor()); // Leo Tolstoy
        }
        catch(CloneNotSupportedException ex){
            System.out.println("Cloneable not implemented");
        }
    }
}