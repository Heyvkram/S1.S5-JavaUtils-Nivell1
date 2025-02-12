import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String path = args[0];

        File route = new File(path);

        System.out.println(route.getAbsolutePath());

        String[] fileNames = route.list();

        Arrays.sort(fileNames);

        for( int i = 0; i < fileNames.length; i++){
            System.out.println(fileNames[i]);
        }
    }

}