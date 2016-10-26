package io.github.tjheslin1;

import org.assertj.core.api.WithAssertions;
import org.junit.Test;

public class BinaryReverserTest implements WithAssertions {

    private final BinaryReverser binaryReverser = new BinaryReverser();

    @Test
    public void reversesNumberTest() throws Exception {
        long expected = 11;

        long answer = binaryReverser.reverseBinaryNumber(13);
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void reversesAnotherNumberTest() throws Exception {
        long expected = 61;

        long answer = binaryReverser.reverseBinaryNumber(47);
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void bigNumberTest() throws Exception {
        long expected = 1071961719;

        long answer = binaryReverser.reverseBinaryNumber(999999999);
        assertThat(answer).isEqualTo(expected);
    }
}