package TasksLab1;

import java.util.ArrayList;
import java.util.Comparator;

public class task15 {
    public static void main(String[] args){
        Book book = new Book(1202,"Grim", "Bvm", 2700, 1995);
        Book book2 = new Book(908,"Dano", "Bon", 1205, 1986);
        Book book3 = new Book(1110,"Miro", "Von", 3760, 2003);
        Book book4 = new Book(566,"Foro", "Dan", 6443, 2013);
        Book book5 = new Book(853,"Polo", "Lan", 7964, 1998);

        ArrayList<Book> allBooks = new ArrayList<Book>();
        allBooks.add(book);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);

        titleComparator TComp = new titleComparator();
        titleAutorComparator TAComp = new titleAutorComparator();
        autorTitleComparator ATComp = new autorTitleComparator();
        autorTitlePriceComparator ATPComp = new autorTitlePriceComparator();

        allBooks.sort(TComp);
        System.out.println("Title sort");
        for (Book bk: allBooks) {
            System.out.println(bk.toString());
        }

        allBooks.sort(TAComp);
        System.out.println("Title-author sort");
        for (Book bk: allBooks) {
            System.out.println(bk.toString());
        }

        allBooks.sort(ATComp);
        System.out.println("Author-title sort");
        for (Book bk: allBooks) {
            System.out.println(bk.toString());
        }

        allBooks.sort(ATPComp);
        System.out.println("Author-title-price sort");
        for (Book bk: allBooks) {
            System.out.println(bk.toString());
        }
    }

    public static class Book {
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

        @Override
        public String toString(){
            return "Book id: "+isbn+". Your book is: "+title+", "+author+". "+edition+". Price: "+price+".";
        }
    }

    public static class titleComparator implements Comparator<Book> {
        public int compare(Book bk1, Book bk2){
            int res = String.CASE_INSENSITIVE_ORDER.compare(bk1.title, bk2.title);
            if (res == 0) {
                res = bk1.title.compareTo(bk2.title);
            }
            return res;
        }
    }
    public static class titleAutorComparator implements Comparator<Book> {
        public int compare(Book bk1, Book bk2){
            int res = String.CASE_INSENSITIVE_ORDER.compare(bk1.title, bk2.title);
            if (res == 0) {
                res = bk1.title.compareTo(bk2.title);
            }

            res = String.CASE_INSENSITIVE_ORDER.compare(bk1.author, bk2.author);
            if (res == 0) {
                res = bk1.author.compareTo(bk2.author);
            }
            return res;
        }
    }
    public static class autorTitleComparator implements Comparator<Book> {
        public int compare(Book bk1, Book bk2){
            int res = String.CASE_INSENSITIVE_ORDER.compare(bk1.author, bk2.author);
            if (res == 0) {
                res = bk1.author.compareTo(bk2.author);
            }

            res = String.CASE_INSENSITIVE_ORDER.compare(bk1.title, bk2.title);
            if (res == 0) {
                res = bk1.title.compareTo(bk2.title);
            }
            return res;
        }
    }
    public static class autorTitlePriceComparator implements Comparator<Book> {
        public int compare(Book bk1, Book bk2){
            int res = String.CASE_INSENSITIVE_ORDER.compare(bk1.author, bk2.author);
            if (res == 0) {
                res = bk1.author.compareTo(bk2.author);
            }

            res = String.CASE_INSENSITIVE_ORDER.compare(bk1.title, bk2.title);
            if (res == 0) {
                res = bk1.title.compareTo(bk2.title);
            }

            res = String.CASE_INSENSITIVE_ORDER.compare(Integer.toString(bk1.price), Integer.toString(bk2.price));
            if (res == 0) {
                res = Integer.toString(bk1.price).compareTo(Integer.toString(bk2.price));
            }
            return res;
        }
    }
    }

