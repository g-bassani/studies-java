package file.wordCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int wordCount = 0;
        System.out.print("Path: ");
        String path = sc.nextLine();
        File file = new File(path);
        System.out.print("Word: ");
        String word = sc.nextLine().toLowerCase();


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("[\\p{Punct}\\s]+");

                for (String w: data) {
                    if (w.toLowerCase().equals(word)) {
                        wordCount += 1;

                    }
                }
            }

        }catch (IOException e) {
            System.out.print(e.getMessage());
        }

        if (wordCount == 0) {
            System.out.println("Word not present");

        }else {
            System.out.print("The word " + word + " appears " + wordCount + " times");
        }

        sc.close();
    }
}
