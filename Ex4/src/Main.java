import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String path = args[0];
        String logPath = args[1];

        File route = new File(path);

        try {
            FileWriter writer = new FileWriter(logPath);
            folderContent(route, writer);
            System.out.println("Stored!");
            readFile(logPath);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void folderContent(File directory, FileWriter writer) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        File[] content = directory.listFiles();
        Arrays.sort(content, Comparator.comparing(File::getName));

        for (File f : content) {
            String lastModified = dateFormat.format(f.lastModified());

            String type = f.isDirectory() ? "D" : "F";
            writer.write(type + " " + f.getName() + "  " + lastModified + "\n");
            if (f.isDirectory()) {
                folderContent(f, writer);
            }
        }
    }

    public static void readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}