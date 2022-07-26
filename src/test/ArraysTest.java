package test;

import main.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"Birdy", "O", "Amay", " "})
    void all_unique_true(String str){
        assertTrue(Arrays.all_unique(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna", " hi ", "  "})
    void all_unique_false(String str){
        assertFalse(Arrays.all_unique(str));
    }

}