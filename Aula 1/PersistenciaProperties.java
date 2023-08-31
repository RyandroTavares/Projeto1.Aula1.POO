import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PersistenciaProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("user", "Emanuel");
        properties.setProperty("password", "123456");

        try {
            FileOutputStream file = new FileOutputStream("config.properties");
            properties.store(file, "User config");
            file.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}