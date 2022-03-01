package demo;

import java.util.Locale;
import java.util.Scanner;

public class EnigmaPrototype {



    Scanner in = new Scanner(System.in);

    void convertLetter() {
        String input = in.nextLine().toUpperCase(Locale.ROOT);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int sa = (int) c - 64;
            String kt = Integer.toString(sa);
            System.out.print(kt + " ");
        }
    }

    void numberToChar() {
        System.out.println();
        String inputNum = in.nextLine();

        for (int i = 0; i < inputNum.length(); i++) {
            char c = inputNum.charAt(i);
            int sa = (int) c + 16;
            String kt = Character.toString((char) sa);
            //int sa = Character.getNumericValue(c + 64);
            System.out.print(kt + " ");
        }
    }

    void test() {
        System.out.println();
    }

    void go() {
        convertLetter();
        numberToChar();
        test();
    }

    public static void main(String[] args) {
	new EnigmaPrototype().go();
    }
}
