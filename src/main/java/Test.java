import java.io.FileWriter;
import java.io.IOException;

/**
 * DJ 2018/12/228:28
 */
public class Test {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("e:\\hello.txt");
            fileWriter.write("nihao" + System.getProperty("line.separator"));
            fileWriter.write("kssk");

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
