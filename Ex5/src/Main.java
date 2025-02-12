
public class Main {
    public static void main(String[] args) {
        Worker newWorker = new Worker("Joan", 30);
        FileGenerator serializedWorker = new FileGenerator();

        serializedWorker.serializer(newWorker);
        serializedWorker.desSerializer();

    }
}