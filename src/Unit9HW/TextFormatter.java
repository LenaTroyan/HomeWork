package Unit9HW;

public class TextFormatter {
    int checkSting(String line1) {
        int count = 0;
        if (line1.length() != 0) {
            count++;
            for (int i = 0; i < line1.length(); i++) {
                if (line1.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
    boolean palindrome(String line1) {
        String reversedString = new StringBuffer(line1).reverse().toString();
        if (reversedString.equals(line1)) {
            return true;
        } else {
            return false;
        }
    }
}