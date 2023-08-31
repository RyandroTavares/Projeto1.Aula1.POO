import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaCSV {
    public static void main(String[] args) {
        String data = "Emanuel";

        try {
            FileWriter file = new FileWriter("data.csv");
            file.write(data.toString());
            file.close();
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
