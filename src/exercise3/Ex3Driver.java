package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yasiro01
 */
public class Ex3Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices - columns and rows must be the same size");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    int rows = 0;
    int cols = 0;
    for (int[] row: matrix) {
      for (int item: row) {
        ++cols;
        System.out.printf("%5d", item);
      }
      ++rows;
      System.out.printf("%n");
    }
    cols = cols / rows;
    System.out.printf("Matrix is %1d by %1d%n",rows,cols);
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException {
      File file = null;
      try{
          file = new File(filename);
      }  catch (Exception ex){
             Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Uh oh... write to file not founed");
      }
      PrintWriter write = new PrintWriter(file);
      write.print(matrix.length + " ");
      write.printf(matrix[0].length + "%n");
      for (int[] row: matrix) {
        for (int item: row) {
        write.printf("%-5d", item);
      }
     write.printf("%n");
    }
    write.close();
              
  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException {
      int rows = 0;
      int col = 0;
      
      try {
        File file = new File(filename);
        Scanner scn = new Scanner(file);
        boolean firstComplete = false;
        while (scn.hasNextLine()){
            String baseMatrix = scn.nextLine();
            String[] matList = baseMatrix.split("\\s+");
            if (!firstComplete){
                rows = Integer.parseInt(matList[0]);
                col = Integer.parseInt(matList[1]);
                
                firstComplete = true;
                }
           
            
        }  
      }  catch (Exception ex){
                Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "File not found");
                }     
        int [][] matrix = new int[rows][col];
        File file = new File(filename);
        Scanner scn = new Scanner(file);
        scn.nextLine();
        while (scn.hasNextLine()){
            for (int j=0;j<matrix.length;++j){            
                String baseMatrix = scn.nextLine();
                String[] matList = baseMatrix.split("\\s+");
                for (int i=0;i<matrix[0].length;++i){
                    matrix[j][i] = Integer.parseInt(matList[i]);
                    
            }
          }
        }
        
      return matrix;
      
              
    /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */
  
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
    System.out.println("Calculating...");
    int rows = matrix1.length;
    int cols = matrix2[0].length;
    int [][] newMatrix = new int[rows][cols];
    try{
        for(int i = 0; i<newMatrix.length;++i){
            for (int j=0; j<newMatrix[0].length;++j){
                int foo = 0;
                for (int k=0; k<matrix1[0].length;++k){
                    int bar = matrix1[i][k] * matrix2[k][j];
                    foo = foo + bar;
                }
                newMatrix[i][j] = foo;
                }
            }
    }
    catch (Exception ex){
         Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Something has gone terrible wrong.....");
    }
    return newMatrix;
}
}
