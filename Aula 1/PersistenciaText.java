import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaText {
    public static void main(String[] args) {
        String context = "Este é um exemplo de persistência de aquivo de texto!!";
        try {
            FileWriter file = new FileWriter("arquivo.txt");
            file.write(context);
            file.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}