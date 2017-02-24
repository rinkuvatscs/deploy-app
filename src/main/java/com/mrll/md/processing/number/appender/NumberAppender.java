package com.mrll.md.processing.number.appender;

public class NumberAppender {

    public static void main(String[] args) {

        NumberAppender numberAppender = new NumberAppender();
        for (int number = 1; number < 100; number++) {
            System.out.println(numberAppender.numberAppender(number));
        }

    }

    public String numberAppender(int number) {

        StringBuilder stringBuffer = new StringBuilder(String.valueOf(number));

        if ((number / 10) % 10 == 1) {
            return stringBuffer.append("th").toString();

        }
        switch (number % 10) {
        case 1:
            stringBuffer.append("st");
            break;
        case 2:
            stringBuffer.append("nd");
            break;
        case 3:
            stringBuffer.append("rd");
            break;
        default:
            stringBuffer.append("th");
        }

        return stringBuffer.toString();
    }

}
