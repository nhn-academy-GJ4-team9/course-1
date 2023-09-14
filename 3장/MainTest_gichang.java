package org.example.problems;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest_gichang {
    @Test
    @DisplayName("첫번째 테스트")
    void firstTest(){
        String input="axbxcxdx";
        String[] result={"a","b","c","d"};

        Assertions.assertEquals(Arrays.toString(result),Arrays.toString(Main_gichang.solution(input)));
    }

    @Test
    @DisplayName("두번째 테스트")
    void secondTest(){
        String input="dxccxbbbxaaaa";
        String[] result={"aaaa","bbb","cc","d"};
        Assertions.assertEquals(Arrays.toString(result),Arrays.toString(Main_gichang.solution(input)));
    }

    @Test
    @DisplayName("세번째 테스트")
    void thirdTest(){
        String input="dxccxbbbxxaaaa";
        String[] result={"aaaa","bbb","cc","d"};
        Assertions.assertEquals(Arrays.toString(result),Arrays.toString(Main_gichang.solution(input)));
    }

}