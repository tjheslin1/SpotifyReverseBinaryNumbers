package io.github.tjheslin1.util;

import java.util.Scanner;

public class KeyboardReader {

    private static Scanner scanner = new Scanner(System.in);

    public static long nextNumberFromKeyboard() {
        return scanner.nextLong();
    }
}
