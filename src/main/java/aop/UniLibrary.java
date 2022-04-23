package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take book from UniLibrary");
        System.out.println("--------------------");
    }

    public void getMagazine() {
        System.out.println("We take magazine from UniLibrary");
        System.out.println("--------------------");
    }

    public String returnBook() {
        int a = 1/0;
        System.out.println("We give away book to the UniLibrary");
        return "Peace and War";
    }

    public void returnMagazine() {
        System.out.println("We give away magazine to the UniLibrary");
        System.out.println("--------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("We add book to the UniLibrary");
        System.out.println("--------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine to the UniLibrary");
        System.out.println("--------------------");
    }
}
