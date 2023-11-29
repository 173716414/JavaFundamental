package victor.day4;

/**
 * @Author：Victor_htq
 * @Package：victor.day4
 * @Project：JavaFaundamental
 * @name：fileStreamTest
 * @Date：2023/10/10 16:20
 * @Filename：fileStreamTest
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bWrite = { 11, 21, 3, 40, 5 };
            Path path = Paths.get("test.txt");
            OutputStream os = Files.newOutputStream(path);
            for (byte b : bWrite) {
                os.write(b); // writes the bytes
            }
            os.close();

            InputStream is = Files.newInputStream(path);
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}