import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println("Contenido del directorio guardado");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
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
}
