package file.bookSectionFileProcessor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the section to create: ");
        int sectionNumber = sc.nextInt();

        BookSector bookSector = new BookSector(sectionNumber);

        System.out.print("Enter the number of books: ");
        int amount = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= amount; i++) {
            System.out.printf("Book #%d:\n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Status (available/loan): ");
            Status status = Status.valueOf(sc.nextLine().toUpperCase());

            Book book = new Book(name, author, status, id);
            bookSector.addBook(book);

        }
        System.out.println();
        System.out.print("Enter the folder for the registers: ");
        String path = sc.nextLine();

        File folder = new File(path);
        File registersFolder = new File(folder, "registers " + bookSector.getSection());
        File registers = new File(registersFolder, "registeredBooks.txt");

        if (registersFolder.mkdirs()) {
            System.out.println("Folder created");
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter(registers))) {
            br.write("Section " + bookSector.getSection());
            br.newLine();

            for (Book b: bookSector.getBookList()) {
                br.write(b.bookSpecs());
                br.newLine();

            }
        }catch (IOException e) {
            System.out.println(e.getMessage());

        }
        sc.close();
    }
}
