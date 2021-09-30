package TasksLab1;

import java.util.TreeSet;

public class task14_2 {
    public static void main(String[] args){
        Book book = new Book(1202,"Grim", "Tim", 2700, 1995);
        Book book2 = new Book(908,"Dano", "Bon", 1205, 1986);
        Book book3 = new Book(1110,"Miro", "Von", 3760, 2003);
        TreeSet<Book> allBooks = new TreeSet<Book>();
        allBooks.add(book);
        allBooks.add(book2);
        allBooks.add(book3);

        for (Book bk: allBooks) {
            System.out.println(bk);
        }

        System.out.println("toString - "+book.toString());
        System.out.println("hashCode - "+book.hashCode());
        System.out.println("equals - "+book.equals(book));
    }

    public static class Book implements Comparable<Book> {
        private int isbn;
        private String title;
        private String author;
        private int price;
        private static int edition;

        public Book(int _isbn, String _title, String _autor, int _price, int _edition){
            isbn=_isbn;
            title=_title;
            author=_autor;
            price=_price;
            edition=_edition;
        }

        public int compareTo(Book bk){
            if (this.isbn == bk.isbn) return 0;
            else
                if (this.isbn < bk.isbn) return -1;
                else
                    return 1;
        }

        @Override
        public String toString(){
            return "Book id: "+isbn+". Your book is: "+title+", "+author+". "+edition+". Price: "+price+".";
        }

        @Override
        public int hashCode(){
            return (price+edition)/3;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            } else
                return false;
        }
    }
}
