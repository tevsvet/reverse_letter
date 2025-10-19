package com.pack.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilTest {

    @ParameterizedTest(name = "\"{0}\" → \"{1}\"")
    @CsvSource({
            //input,            expected output
            "xyz,               zyx",
            "a1b2c,             c1b2a",
            "ab_cd,             dc_ba",
            "'Hello, World!',   'dlroW, olleH!'",
            "'',                ''",
            "null,              ''"
    })
    void testReverseLetter(String input, String expected) {
        /* null из CsvSource передается как строка "null",
           поэтому явно преобразовываем ее в реальный null. */
        String reversedString = StringUtil.reverseLetter(
                "null".equals(input) ? null : input
        );
        assertEquals(expected, reversedString);
    }
}