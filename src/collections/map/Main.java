package collections.map;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Path file: ");
        String path = sc.nextLine();
        File file = new File(path, "candidates.csv");
        System.out.print("Enter the number of records: ");
        int numberCandidates = sc.nextInt();
        sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (int i = 1; i <= numberCandidates; i++) {
                System.out.print("Candidate name: ");
                String name = sc.nextLine();
                System.out.print("Votes for the record: ");
                int votes = sc.nextInt();
                sc.nextLine();


                bw.write(name + "," + votes);
                bw.newLine();
            }

        }catch (IOException e) {
            System.out.print(e.getMessage());
        }


        Map<String, Integer> candidates = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                // Map verification to avoid duplicates

                if (candidates.containsKey(name)) {
                    candidates.put(name, candidates.get(name) + votes);
                }else {
                    candidates.put(name, votes);
                }


                line = br.readLine();
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String key : candidates.keySet()) {
            System.out.println("Candidate: " + key + " | Total votes: " + candidates.get(key));
        }

        sc.close();
    }
}