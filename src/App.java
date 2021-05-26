import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;
import java.time.temporal.Temporal;


public class App {
  public static void main(String[] args) throws Exception {

    Scanner input = null;
    PrintStream output = null;

    ArrayList<Integer> masterList = new ArrayList<Integer>();
    String current;

    String inFileName = "src/files/input/in3a.txt";
    String outFileName = "src/files/output/out3a.txt";
    boolean filesOk = false; // Indicates if the files are accessable. // other variables such as arrays, should also be declared here.
    boolean isMatrixLine = true;
    String matrixValueString = "";
    int[][] tempArr;
    int x = 0;
    int y = 0;


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

        if(current.length() == 0) {
            isMatrixLine = true;
            System.out.println("NEXT");
            continue;
        }
        

        if(isMatrixLine) {
          matrixValueString = current.replaceAll("\\s+", "");
          x = Character.getNumericValue(matrixValueString.charAt(0));
          y = Character.getNumericValue(matrixValueString.charAt(1));
          isMatrixLine = false;
        } else {
          String[] currentArr = current.split(" ");
          ArrayList<Integer> tempList = new ArrayList<Integer>();
          int[] arr1 = new int[currentArr.length];
          int spaceCount = 0;

          for(int i = 0; i < currentArr.length; i++) {

            if(currentArr[i] != "") {
              int tempConvert = Integer.parseInt(currentArr[i]);
              tempList.add(tempConvert);
              arr1[i] = tempConvert;
            } else {
              spaceCount++;
            }
          }

          // System.out.println(tempList);
          int[] arr2 = new int[arr1.length - spaceCount];

          System.out.println("SPACES: " + spaceCount);
          System.out.println(Arrays.toString(arr1));
        }
      }
    }

    // System.out.println(temp);
    // String matrixKeys = temp.get(0).replaceAll("\\s+", "");
    // System.out.println(matrixKeys.charAt(0));

    
  } // End of main.
}
