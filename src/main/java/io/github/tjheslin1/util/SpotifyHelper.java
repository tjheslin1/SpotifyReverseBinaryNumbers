package io.github.tjheslin1.util;

class SpotifyHelper {

    static String convertNumberToBinaryString(long number) {
        return Long.toBinaryString(number);
    }

    static String reverseBinaryString(String binaryString) {
        return new StringBuilder(binaryString).reverse().toString();
    }

    static long convertBinaryStringToNumber(String binaryString) {
        return Long.parseLong(binaryString, 2);
    }
}
