import java.util.HashSet;

import models.Book;

public class HashSetTest {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Book b1 = new Book(1, "Atomic Habits", 500);
        Book b2 = new Book(1, "Atomic Habits", 500);
        Book b3 = new Book(1, "Atomic Habits", 500);

        HashSet<Book> bookHashSet = new HashSet<Book>();

        bookHashSet.add(b1);
        bookHashSet.add(b2);
        bookHashSet.add(b3);


    for (Book book : bookHashSet) {

        System.out.println(book);
        
    }


    }
}
