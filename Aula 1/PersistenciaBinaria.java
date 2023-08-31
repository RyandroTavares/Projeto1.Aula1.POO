import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistenciaBinaria {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Emanuel", 21);
        try {
            FileOutputStream file = new FileOutputStream("binario.bin");
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(pessoa);
            write.close();
            file.close();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}