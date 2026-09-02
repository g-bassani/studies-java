package collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<PrintJob> printJobQueue = new LinkedList<PrintJob>();

        System.out.print("Jobs amount: ");
        int amount = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= amount; i++) {
            System.out.printf("Print #%d:\n", i);
            System.out.print("Document name: ");
            String documentName = sc.nextLine();

            printJobQueue.offer(new PrintJob(documentName));
        }

        try {
            for (int i = 1; i <= amount; i++) {
                System.out.println();
                System.out.println("Next job to print: " + printJobQueue.peek());
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Printing: " + printJobQueue.peek());

                printJobQueue.poll();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Queue is now empty");
        sc.close();
    }
}
