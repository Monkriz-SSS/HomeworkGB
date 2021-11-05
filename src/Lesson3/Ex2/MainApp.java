package Lesson3.Ex2;

public class MainApp {

    public static void main(String[] args) {

        AdressBook adressBook = new AdressBook();
        adressBook.add("James","899975234");
        adressBook.add("James","89997508971");
        adressBook.add("Topalov","89994315");
        adressBook.add("James","89997534252346");
        adressBook.add("Brando","89997508974");
        adressBook.add("Jamest","8999234975");

        adressBook.get("James");
        adressBook.get("Brando");
    }

}
