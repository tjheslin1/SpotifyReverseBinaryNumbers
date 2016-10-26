package io.github.tjheslin1;

import static io.github.tjheslin1.BinaryReverser.reverseBinaryNumber;
import static io.github.tjheslin1.util.KeyboardReader.nextNumberFromKeyboard;

public class ReverseBinaryNumbers {

    public static void main(String[] args) {
        while (true) {
            long number = nextNumberFromKeyboard();

            long answer = reverseBinaryNumber(number);

            System.out.println("Output: " + answer);
        }
    }
}
