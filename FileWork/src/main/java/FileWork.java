import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class FileWork {

  public String[] readFromFile(String fileName) {
    //write your code here

    String[] arrayOfStrings;
    String readLine;
    StringBuilder stringBuilder = new StringBuilder();

    try {
      BufferedReader reader = new BufferedReader(new FileReader(fileName));
      while ((readLine = reader.readLine()) != null) {
        stringBuilder.append(readLine).append(" ");
      }
      reader.close();
    }catch (IOException e) {
      throw new RuntimeException("Wrong fileName", e);
    }

    readLine = stringBuilder.toString().toLowerCase();
    arrayOfStrings = readLine.split("\\W+");
    int counterForArray = 0;
    int counterForFinalArray = 0;
    for (String wordVsW : arrayOfStrings) {
      if (wordVsW.startsWith("w")){
        counterForArray++;
      }
    }

    String[] fileContent = new String[counterForArray];

    for (String wordVsW:arrayOfStrings) {
      if (wordVsW.startsWith("w")){
        fileContent[counterForFinalArray] = wordVsW;
        counterForFinalArray++;
      }
    }

    Arrays.sort(fileContent);
  return fileContent;
  }
}



