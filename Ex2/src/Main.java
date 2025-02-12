import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String path = args[0];

        File route = new File(path);

        folderContent(route);
    }

    public static void folderContent(File directory) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        File[] content = directory.listFiles();
        Arrays.sort(content, Comparator.comparing(File::getName));

        for (File f : content) {
            String lastModified = dateFormat.format(f.lastModified());

            if (f.isDirectory()) {
                System.out.println("D " + f.getName() + "  " + lastModified);
                folderContent(f);
            } else {
                System.out.println("F " + f.getName() + "  " + lastModified);
            }
        }
    }
}
