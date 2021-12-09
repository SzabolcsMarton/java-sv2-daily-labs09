package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWordTest() {
        List<String> test = Arrays.asList("aaa", "h", "sssss", "k", "cc");
        List<String> result = new StringLists().shortestWord(test);

        assertEquals(2, result.size());
        assertEquals("k", result.get(1));

    }
}