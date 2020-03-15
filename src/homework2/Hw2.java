package homework2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Hw2 {
    public static void main(String[] args) {
        //Задание1
        System.out.println("Задание 1");

        String string1 = "some";
        String string2 = "string";
        char[] strArr1 = string1.toCharArray();
        char[] strArr2 = string2.toCharArray();
        String stringNew1 = new String(strArr1,0,3);
        String stringNew2 = new String(strArr2,3,3);
        System.out.println("Ответ: " + stringNew1 + stringNew2);

        //Задание2
        System.out.println("Задание 2");

        String string3 = "Найдите самое длинное слово в предложении";
        String maxWord = null;
        int maxLength = 0;
        StringTokenizer st = new StringTokenizer(string3, " ");
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLength = word.length();
            if (maxLength == 0) {
                maxWord = word;
                maxLength = wordLength;
            } else if (wordLength > maxLength) {
                maxLength = wordLength;
                maxWord = word;
            }
        }
            System.out.println("Самое длинное слово = " + maxWord);

        //Задание3
        System.out.println("Задание 3");










    }
}
