package file.productFileProcessor;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Create a file with strings

        System.out.print("Enter the folder path to create the file: ");
        String path = sc.nextLine();
        System.out.print("How many products? ");
        int amount = sc.nextInt();
        sc.nextLine();
        String[] products = new String[amount];
        System.out.println("Enter the product name, the price, and quantity (csv.): ");

        for (int i = 0; i < amount; i++) {
            products[i] = sc.nextLine();
        }

        File userFolder = new File(path);
        File newUserFile = new File(userFolder, "products.csv");
        userFolder.mkdirs();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newUserFile))) {
            for (int i = 0; i < products.length; i++) {
                bw.write(products[i]);
                bw.newLine();
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Transform the file into objects

        List<Product> productsObject = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(newUserFile))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String name = data[0];
                double price = Double.parseDouble(data[1]);
                Integer productAmount = Integer.parseInt(data[2]);

                productsObject.add(new Product(name, price, productAmount));

            }


        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Create a new folder with the summary

        File sourceFolder = new File(path);
        File outFolder = new File(sourceFolder, "out");
        File summary = new File(outFolder, "summary.csv");

        outFolder.mkdirs(); // Create a subfolder with the result

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(summary))) {
            for (Product p: productsObject) {
                bw.write(p.toString());
                bw.newLine();
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
