package org.stage.xss.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {StringXssFilter.class})
class StringXssFilterTest{

    private static final String INVALID_1 = read("./src/test/resources/xss-invalid1.html");
    private static final String INVALID_2 = read("./src/test/resources/xss-invalid2.html");
    private static final String INVALID_3 = read("./src/test/resources/xss-invalid3.html");
    private static final String INVALID_4 = read("./src/test/resources/xss-invalid4.html");

    @Autowired
    private StringXssFilter stringXssFilter;

    private static String read(String filePath){
        Path path = Paths.get(filePath);
        StringBuilder sb = new StringBuilder();
        try{
            Files.readAllLines(path).forEach(sb::append);
        } catch (IOException ioe){
            throw new IllegalStateException("Cannot read file from path \"" + filePath + "\"");
        }
        return sb.toString();
    }

    @Test
    @DisplayName("String Xss 필터링 성공 테스트 - INVALID_1")
    void FILTERING_XSS_STRING_SUCCESS_TEST_INVALID_1(){
        // when
        String result = stringXssFilter.doFilter(INVALID_1, String.class);

        // then
        assertNotEquals(INVALID_1, result);
    }

    @Test
    @DisplayName("String Xss 필터링 성공 테스트 - INVALID_2")
    void FILTERING_XSS_STRING_SUCCESS_TEST_INVALID_2(){
        // when
        String result = stringXssFilter.doFilter(INVALID_2, String.class);

        // then
        assertNotEquals(INVALID_2, result);
    }

    @Test
    @DisplayName("String Xss 필터링 성공 테스트 - INVALID_3")
    void FILTERING_XSS_STRING_SUCCESS_TEST_INVALID_3(){
        // when
        String result = stringXssFilter.doFilter(INVALID_3, String.class);

        // then
        assertNotEquals(INVALID_3, result);
    }

    @Test
    @DisplayName("String Xss 필터링 성공 테스트 - INVALID_4")
    void FILTERING_XSS_STRING_SUCCESS_TEST_INVALID_4(){
        // given
        String expected = "&lt;SCRIPT&gt;alert(&quot;테스트!!!&quot;);&lt;/SCRIPT&gt;";

        // when
        String result = stringXssFilter.doFilter(INVALID_4, String.class);

        // then
        assertEquals(expected, result);
    }

}
