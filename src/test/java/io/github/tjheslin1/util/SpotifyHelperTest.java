package io.github.tjheslin1.util;

import org.assertj.core.api.WithAssertions;
import org.junit.Test;

public class SpotifyHelperTest implements WithAssertions {

    @Test
    public void convertsAnotherNumberToBinaryString() throws Exception {
        String expected = "10111";

        assertThat(SpotifyHelper.convertNumberToBinaryString(23)).isEqualTo(expected);
    }

    @Test
    public void reversesBinaryString() throws Exception {
        String expected = "111000";

        assertThat(SpotifyHelper.reverseBinaryString("000111")).isEqualTo(expected);
    }

    @Test
    public void actuallyReversesAnyString() throws Exception {
        String expected = "samoht";

        assertThat(SpotifyHelper.reverseBinaryString("thomas")).isEqualTo(expected);
    }

    @Test
    public void convertsBinaryStringToNumber() throws Exception {
        long expected = 23;

        assertThat(SpotifyHelper.convertBinaryStringToNumber("10111")).isEqualTo(expected);
    }
}