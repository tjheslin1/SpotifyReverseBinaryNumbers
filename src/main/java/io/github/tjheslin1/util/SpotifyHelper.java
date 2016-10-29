package io.github.tjheslin1.util;

public class SpotifyHelper {

    public static String convertNumberToBinaryString(long number) {
        return Long.toBinaryString(number);
    }

    public static String reverseBinaryString(String binaryString) {
        return new StringBuilder(binaryString).reverse().toString();
    }

    public static long convertBinaryStringToNumber(String binaryString) {
        return Long.parseLong(binaryString, 2);
    }
}
