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
        String string4 = "строка строка  Hello  итерация " +
                "0 итерация 1 итерация 2 итерация 3 итерация 4 " +
                "итерация 5 итерация 6 итерация 7 итерация 8 итерация 9";
        String string5 = "итерация";
        System.out.println("Колличество вхождений строки 5 в строку 6 = "
                + (string4.split(string5).length-1));
        // TODO для чего в этом примере использовать \0
        // TODO \0 -Этот символ означает null-char. То же самое, что null в качестве объекта
        // TODO, только для символа. Т.е. символ без значения.
        // TODO String symbol = "о";
        // TODO String text = "оооооо";
        // TODO System.out.println((text+"\0").split(symbol).length - 1);


        //Задание4
        System.out.println("Задание 4");
        String strPal = "а роза упала на лапу азора";
        strPal = strPal.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(strPal);
        sb.reverse();
        String palindrome = sb.toString();
        if (strPal.equalsIgnoreCase(palindrome)) {
            System.out.println("Строка палиндром");
        }
        else {
            System.out.println("Строка не палиндром");
        }


        //Задание5
        System.out.println("Задание 5");








    }
}
