package TasksLab1;

public class task14 {
    public static void main(String[] args){
        Book book = new Book("Grim", "Tim", 2700, 1995);
        Object secondBook = book.clone();
        System.out.println("clone - "+secondBook);
        System.out.println("toString - "+book.toString());
        System.out.println("hashCode - "+book.hashCode());
        System.out.println("equals - "+book.equals(book));
    }

    public static class Book {
        private String title;
        private String author;
        private int price;
        private int edition;

        public Book(String _title, String _autor, int _price, int _edition){
            title=_title;
            author=_autor;
            price=_price;
            edition=_edition;
        }

        @Override
        public String toString(){
            return "Your book is: "+title+", "+author+". "+edition+". Price: "+price+".";
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

        @Override
        public Object clone() {
          Book cloneBook = new Book(this.title, this.author, this.price, this.edition);
          return  cloneBook;
        }
    }
}
