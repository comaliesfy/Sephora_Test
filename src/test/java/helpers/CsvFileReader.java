package helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CsvFileReader {
    public static String userMail= getLoginData().get(0);
    public static String userPassword = getLoginData().get(1);

    public static ArrayList<String> getLoginData() {
        String path = "src/test/java/resource/userdata.csv";
        String line;
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                list.add(values[0]);
                list.add(values[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

  }
