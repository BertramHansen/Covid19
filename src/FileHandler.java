import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("noegletal.csv");


    public ArrayList<Covid19Data> loadAllData() {
        ArrayList<Covid19Data> covidData = new ArrayList<>();
        Scanner sc = null;

        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException(fnfe);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Covid19Data dataComp = null;
        while (sc.hasNext()) {
            String linje = sc.nextLine();
            String[] atributes = linje.split(";");
            dataComp = new Covid19Data
                    (atributes[0],atributes[1],
                    Integer.parseInt(atributes[2]),
                    Integer.parseInt(atributes[3]),
                    Integer.parseInt(atributes[4]),
                    Integer.parseInt(atributes[5]), atributes[6]);

            covidData.add(dataComp);
        }
        sc.close();
        return covidData;
    }
}
