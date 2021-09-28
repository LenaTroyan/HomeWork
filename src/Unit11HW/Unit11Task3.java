package Unit11HW;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Unit11Task3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Unit11HW/Text.txt"))) {
            String text1 = br.readLine();
            String[] words = text1.split(" ");
            try (BufferedReader br2 = new BufferedReader(new FileReader("src/Unit11HW/Black list.txt"))) {
                boolean result;
                int count = 0;
                int sentences=0;
                String blist = br2.readLine();
                String[] bwords = blist.split(" ");
                System.out.println(Arrays.toString(words));
                System.out.println(Arrays.toString(bwords));
                for (int i=0; i< bwords.length; i++){
                if (result=Arrays.asList(words).contains(bwords[i])){
                    count++;}
                }
                if (count>0){
                    System.out.println("Текст не прошел проверку на цензуру");
                } else {System.out.println("Текст прошел проверку на цензуру");}
                System.out.println("количество предложений " +count);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
