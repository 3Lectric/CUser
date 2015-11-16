package me.jay;

import java.util.Scanner;

/**
 * Created by Jay on 11/16/2015.
 * Jay is responsible for this class
 */
public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your username:");

        String username = in.nextLine();
        System.out.println("Please enter your password:");
        String password = in.nextLine();

        //Check Creds
    }

    public void shell() {
        System.out.println(" ");
        System.out.println("Welcome to the CManager Alpha!");
        System.out.println("You can enter a command, or use help for a list of available commends");
        System.out.println(" ");
        Scanner in = new Scanner(System.in);

        String cmd = in.nextLine();

        if (cmd.equalsIgnoreCase("help")) {
            System.out.println("Available commands:");
            System.out.println("/help - Displays the help menu");
            System.out.println("/add - Adds a job to the current lsit");
            System.out.println("/remove - Removes a job");
            System.out.println("/list - Lists current ");
        }
    }


}
