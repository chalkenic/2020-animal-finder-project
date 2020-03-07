package FileIterators;

import Animals.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextWriter {

    public TextWriter() {
    }


    public void writeNewLine(String entry) {
        TextPath data = new TextPath();
        String strPath = data.getPath().toString();

        try {
            PrintWriter fileWriter = new PrintWriter(new FileWriter(strPath, true));
            fileWriter.println("");
            fileWriter.write(entry);

            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }
    }

    public void writeChars(String entry) {

        try {
            TextPath data = new TextPath();
            String strPath = data.getPath().toString();

            PrintWriter fileWriter = new PrintWriter(new FileWriter(strPath, true));
            fileWriter.write(" " + entry);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeConditionResult(String type, String query, List<Animal> results) {
        TextWriter result = new TextWriter();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        result.writeNewLine("User search: " +  type + "; User Query: " + query +
                "; date searched " + dateFormat.format(date) + "; Results: ");

        for(Animal row: results) result.writeChars(row.getNoun() + ", ");
    }

    public void writeAllResult(String type, ArrayList query, List<Animal> results) {
        TextWriter result = new TextWriter();


        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        result.writeNewLine("User search: " +  type + "; User Query: " + query +
                "; date searched " + dateFormat.format(date) + "; Results: ");

        for(Animal row: results) result.writeChars(row.getNoun() + ", ");
    }
}

