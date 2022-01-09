import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WorkWithBytes {
  public void writeBytesToFile(String fileName, byte[] data) {
    //write your code here
    File file = new File(fileName);
    try {
      file.createNewFile();
    } catch (IOException e) {
      throw new RuntimeException("Can't create file", e);
    }
    for (int i = 0; i < data.length; i++) {
      try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
        bufferedWriter.write(data[i]);
      }catch (IOException e) {
        throw new RuntimeException("Can't open this file.", e);
      }
    }
  }
}
