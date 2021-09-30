package TasksLab1;

public class task13 {
    public static void main(String[] args) {
        Book book = new Book("Grim", "Tim", 2700, 1995);
        ProgrammerBook pbook = new ProgrammerBook("Grim", "Tim", 2700, 1995,"English",3);
        System.out.println("toString - "+pbook.toString());
        System.out.println("hashCode - "+pbook.hashCode());
        System.out.println("equals - "+pbook.equals(book));

    }

    public static class Book {
        public String title;
        public String author;
        public int price;
        public static int edition;
        public Book(){

        }
        public Book(String _title, String _autor, int _price, int _edition) {
            title = _title;
            author = _autor;
            price = _price;
            edition = _edition;
        }


    }

    public static class ProgrammerBook extends Book{
        private String language;
        private int level;

        public ProgrammerBook(String _title, String _autor, int _price, int _edition, String _language, int _level) {
            title = _title;
            author = _autor;
            price = _price;
            edition = _edition;
            language=_language;
            level=_level;
        }

        @Override
        public String toString() {
            return "Your book is: " + title + ", " + author + ". " + edition + ". Price: " + price + ". Language: "+language+". "+level;
        }

        @Override
        public int hashCode() {
            return (price + edition + level) / 3;
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
