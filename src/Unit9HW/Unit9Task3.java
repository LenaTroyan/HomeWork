package Unit9HW;

import java.io.*;

public class Unit9Task3 {


    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Unit9HW/File1.txt"))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Unit9HW/palindrome.txt"))) {
                String s;
                while ((s = br.readLine()) != null) {
                    String reversedString = new StringBuffer(s).reverse().toString();
                    if (reversedString.equals(s)) {
                        {
                            writer.write(reversedString);
                            writer.newLine();
                        }
                    }
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


