package Java_Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class OutputToFiles {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("ections_out.txt"));
        out.println("This is a written txt.");
        out.println("The second line.");
    }
}
