import java.util.*;
import java.io.*;

public class Main
 {
public static void main(String[] args)
 {
  Trees test = new Trees();
  File file = new File("info.txt");
  int wordCount = 0;
  try 
  {
   Scanner input = new Scanner(file);
   while(input.hasNext())
   {
    test.insert(input.next());
    wordCount++;
   }
   input.close();
  }
  catch(FileNotFoundException e)
  {
   e.printStackTrace();
  }
  System.out.println("Search for \"to\"");
  System.out.println(test.search("to"));
  System.out.println("Search for \"suspiciousness\"");
  System.out.println(test.search("suspiciousness"));
  System.out.println("Search for \"back\"");
  System.out.println(test.search("back"));
   test.print();
 }
 }