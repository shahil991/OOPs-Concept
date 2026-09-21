package Question;

public class Alpha {
    public static void main(String[] args) {
        char ch = '3';

        System.out.println(isAlpha(ch));
    }

    public static String isAlpha(char ch) {
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            return "Alphabet";
        } else if(ch >= '0' && ch <= 9) {
            return "Digit";
        } else {
            return "Special character";
        }
    }
}
