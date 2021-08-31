package Unit9HW;

import java.io.*;

public class Unit9Task4 {
    public static void main(String[] args) {
        TextFormatter text = new TextFormatter();
        try (BufferedReader br = new BufferedReader(new FileReader("src/Unit9HW/Task4_1.txt"))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Unit9HW/Task4_2.txt"))) {
                String s;
                while ((s = br.readLine()) != null) {
                    text.checkSting(s);
                    text.palindrome(s);
                    if ( text.checkSting(s)>= 3 && text.checkSting(s) <= 5) {
                        { writer.write(s);
                            writer.newLine();
                        }
                    } else if (text.palindrome(s) == true) {
                        writer.write(s);
                        writer.newLine();
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}