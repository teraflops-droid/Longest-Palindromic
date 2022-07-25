
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PalindromicTest {

    @Test
    public void testFindPalindromicWhenInputIsbabad() {
        String data = "babad";
        String result = Palindromic.findPalindromic(data);
        assertEquals("bab", result);
    }
    @Test
    public void testFindPalindromicWhenInputIscbbd() {
        String data = "cbbd";
        String result = Palindromic.findPalindromic(data);
        assertEquals("bb", result);
    }

    @Test
    public void testGetLongestString() {
        String[] input = {"geeksskeeg", "ee", "eeksskee", "eksske", "kssk", "ss", "ee"};
        List<String> data = Arrays.asList(input);
        String result = Palindromic.getLongestString(data);
        assertEquals("geeksskeeg", result);
    }
}
