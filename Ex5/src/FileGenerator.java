import java.io.*;

public class FileGenerator {

    public void serializer(Worker worker) {

        try (ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream("worker.ser"))) {
            outputFile.writeObject(worker);
            System.out.println("Generated: worker.ser");
        } catch (IOException e) {
            System.err.println("Serialization ERROR " + e.getMessage());
        }
    }

    public void desSerializer() {

        try (ObjectInputStream imputFile = new ObjectInputStream(new FileInputStream("worker.ser"))) {
            Worker desSerialzedWorker = (Worker) imputFile.readObject();
            System.out.println("DesSerialized Worker " + desSerialzedWorker);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("DesSerialization ERROR " + e.getMessage());
        }
    }
}
