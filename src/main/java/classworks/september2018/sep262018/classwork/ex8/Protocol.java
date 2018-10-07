package classworks.september2018.sep262018.classwork.ex8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Protocol {

    private static final int waiting = 0;
    private static final int sentPrompt = 1;


    private int status = waiting;

    public String processInput(String theInput) {
        String theOutput = null;

        if (status == waiting) {
            theOutput = "Please enter what you would like to retrieve: 'customer' or 'product' ";
            status = sentPrompt;
        } else if (status == sentPrompt) {
            if (theInput.equalsIgnoreCase("product")) {
                File f = new File("product.txt");
                Scanner sc = null;
                try {
                    sc = new Scanner(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Protocol.class.getName()).log(Level.SEVERE, null, ex);
                }

                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    theOutput = "The current product entries are : " + line;
                }
                return theOutput;
            } else if (theInput.equalsIgnoreCase("customer")) {
                File f = new File("customer.txt");
                Scanner sc = null;
                try {
                    sc = new Scanner(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Protocol.class.getName()).log(Level.SEVERE, null, ex);
                }

                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    theOutput = "The current customer entries are : " + line;
                }
                return theOutput;

            } else if (theInput.equalsIgnoreCase("quit")) {
                return "quit";
            } else {
                return "quit";
            }
        }
        return theOutput;
    }
}