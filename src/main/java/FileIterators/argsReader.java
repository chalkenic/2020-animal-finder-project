package FileIterators;

import java.util.ArrayList;
import java.util.Scanner;

public class argsReader {
    private String arguments;

    public argsReader(String args) {
//        if (args.length != 0) {
//        this.arguments = args; }
//        else {
//            this.arguments = null;
//        }
        this.arguments = args.toLowerCase();
    }

    public String readArgument() {
        Scanner readArgs = new Scanner(System.in);
        String fileName = null;
        String[] userFileCheck;
        String[] userFileEntry = new ArrayList<String>().toArray(new String[0]);


            if (! arguments.contains(".csv")) {
                System.out.println("Please enter a .csv file for program to run: ");
                arguments = readArgs.nextLine();


            } else {
                userFileCheck = arguments.split(".csv");

            }
        return arguments;
    }
}

