package FileIterators;

import Animals.Animal;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TextReader {

    private List<Animal> animalList;
    private TextPath data = new TextPath();
    private String strPath = data.getPath().toString();
    private Scanner readText = null;
    private int result;
    private DecimalFormat df = new DecimalFormat("#.##");

    public TextReader(List<Animal> animalList) {this.animalList = animalList; }



    public void readTextFull() {
        double textRowCount = 0;
        TreeMap<String, Integer> animalCounter = new TreeMap<String, Integer>();
        animalCounter.put("Bird", 0);
        animalCounter.put("Mammal", 0);
        animalCounter.put("Fish", 0);
        animalCounter.put("Reptile", 0);

        try { readText = new Scanner(new File(strPath)); }
        catch (FileNotFoundException noFile) { System.out.println("File not found."); }

        if (readText != null) {
            while (readText.hasNextLine()) {
                    String textRow = readText.nextLine();
                     System.out.println(textRow);
                    textRowCount++;
            }
        }if (readText != null) { readText.close(); }
    }

    public int readTextByEntry() {
        double queryCount = 0;
        double textRowCount = 0;
        String plural;
        String searchChoice;
        try {readText = new Scanner(new File(strPath)); }
        catch (FileNotFoundException noFile) { System.out.println("File not found.");
        return 1;}

        if (readText != null) {
            System.out.println("Please enter your search criteria: ");
            Scanner readEntry = new Scanner(System.in);
            searchChoice = readEntry.nextLine();

            while(readText.hasNextLine()) {
                String textRow = readText.nextLine();
                textRowCount++;
                if (textRow.contains(searchChoice)) {
                    queryCount++;

                }
            } if (queryCount > 1) {
                plural = "times";
            } else {
                plural = "time";
            }
            System.out.println("Your query \"" + searchChoice + "\" appears as a search result " + queryCount + " " + plural +
                    "; an average of " + df.format((queryCount/textRowCount)*100) + "% of all queries made!");
        } return 1;

    }

    public int readTextByAnimals() {
        double totalCount = 0;
        TreeMap<String, Integer> animalData = new TreeMap<String, Integer>();

        try {
            readText = new Scanner(new File(strPath));
        } catch (FileNotFoundException noFile) {
            System.out.println("File not found.");
            return result = 0;
        }


        if (readText != null) {


            while (readText.hasNextLine()) {

                String textRow = readText.nextLine().toLowerCase();

                for (Animal row : animalList) {

                    String animal = row.getNoun();

                    if (textRow.contains(animal.toLowerCase())) {

                        if (animalData.containsKey(animal)) {
                            int incAnimal = animalData.get(animal);
                            animalData.put(animal, incAnimal + 1);
                        } else {
                            animalData.putIfAbsent(animal, 1);
                        }
                        totalCount++;
                    }
                }
            }
            if (readText != null) {
                readText.close();
            }

            System.out.println("\nTotal unique animals found: " + animalData.size());
            System.out.println("Total entries: " + (int) totalCount);
            double testNum = 0;
            for (Map.Entry animal : animalData.entrySet()) {
                double appCount = (int) animal.getValue();
                String plural;

                if (appCount > 1) {
                    plural = "times";
                } else {
                    plural = "time";
                }
                //code adapted from Mkyong.com - Display double in 2 decimal place; available at:
                //https://mkyong.com/java/java-display-double-in-2-decimal-points/
                //Accessed 04.03.2020.



                testNum = testNum + ((appCount / totalCount));

                System.out.println("\"" + animal.getKey() + "\" appears as result " + (int) appCount + " " + plural + "; " +
                        "dataset average: " + df.format((appCount / totalCount) * 100) + "%");

            }
            System.out.println("Total data number: " + (int) testNum * 100 + "%");
            result = 2;
        } return result;
    }
}



//    File file = new File(sys)

