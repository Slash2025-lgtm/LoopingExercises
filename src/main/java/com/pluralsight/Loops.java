package com.pluralsight;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What type of loop?\n[1] While Loop\n[2] Do Loop\n[3] For Loop");
        int selected = keyboard.nextInt();

        if (selected == 1) {
            whileLoop();
        } else if (selected == 2) {
            doLoop();
        } else if (selected == 3) {
            forLoop();
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i < 6) {
            System.out.println("I LOVE JAVA x" + i);
            i++;
        }
    }

    public static void doLoop() {
        int i = 1;
        do {
            System.out.println("I LOVE JAVA x" + i);
            i++;
        } while (i < 6);
    }

    public static void forLoop() throws InterruptedException {
        System.out.println("Intitiating 'for' Loop");
        System.out.println("Starting Countdown...");
        int i = 0;

        for (i = 10; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("Launching in " + i);

            if (i == 1) {
                System.out.println("Launch");
            }
        }
    }
}
