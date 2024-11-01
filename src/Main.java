import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> datasæt = fh.loadAllData();

        for(Covid19Data data : datasæt){
            System.out.println(data);
        }
    }
}