import java.util.*;

public class GetAuthorByBook {
    public static String getAuthorNameByBookTitle(Map<Author, List<Book>> authorBooks, String bookTitle) {
        //write your code here
        for (Map.Entry<Author, List<Book>> mapEntry : authorBooks.entrySet()) {
            for (int i = 0; i < authorBooks.size(); i++) {
                if (mapEntry.getValue().get(i).getTitle().equals(bookTitle)) {
                    return mapEntry.getKey().getName();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setTitle("Voina i mir");
        Book secondBook = new Book();
        secondBook.setTitle("Igra pristolov");
        Book thirdBook = new Book();
        thirdBook.setTitle("Vedmak");
        Book fourthBook = new Book();
        fourthBook.setTitle("Warhammer");

        List<Book> bookList = new ArrayList<>();
        bookList.add(firstBook);
        bookList.add(secondBook);
        bookList.add(thirdBook);
        bookList.add(fourthBook);

        Author artur = new Author();
        artur.setName("Arthur");
        Author jack = new Author();
        jack.setName("Jack");
        Author martin = new Author();
        martin.setName("Martin");
        Author kris = new Author();
        artur.setName("Kriss");

        Map<Author, List<Book>> newMap = new HashMap<>();
        newMap.put(artur, bookList);

        System.out.println(getAuthorNameByBookTitle(newMap, firstBook.getTitle()));

    }
}
