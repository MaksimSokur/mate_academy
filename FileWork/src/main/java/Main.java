import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       FileWork fileWork = new FileWork();
        System.out.println(Arrays.toString(fileWork.readFromFile("SomeText.txt")));

    }
}
