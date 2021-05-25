import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;


public class App {
  public static void main(String[] args) throws Exception {

    Scanner input = null;
    PrintStream output = null;

    ArrayList<String> temp = new ArrayList<String>();
    String current;
    int count = 0;

    String inFileName = "src/files/input/in3a.txt";
    String outFileName = "src/files/output/out3a.txt";
    boolean filesOk = false; // Indicates if the files are accessable. // other variables such as arrays, should also be declared here.
    boolean isMatrixLine = true;


    try {
      input = new Scanner(new File(inFileName)); 
      output = new PrintStream(new File(outFileName)); 
      filesOk = true;
    } catch (FileNotFoundException e) {
      System.out.println("Can't open file - " + e);
    }
    if (filesOk) {
      while(input.hasNextLine()) {
        current = input.nextLine();
        //System.out.println("LINE " + count + ": " + current);
        
        count++;
        String arrNAme = "arr" + Integer.toString(count);

        System.out.println(current.replaceAll("\\s+", ""));
        if(isMatrixLine) {
          String matrixValueString = current.replaceAll("\\s+", "");
          int [][] tempArr;
          isMatrixLine = false;
        }


        if(current.length() == 0) {
          System.out.println("BLANK LINE");
          isMatrixLine = true;
          continue;
        } else {
          temp.add(current);
          // System.out.println(current);
          for(int i = 0; i <= current.split(" ").length; i++) {
            System.out.println(x);
          }

        }

      }
    }

    // System.out.println(temp);
    String matrixKeys = temp.get(0).replaceAll("\\s+", "");
    // System.out.println(matrixKeys.charAt(0));

    
  } // End of main.
}
