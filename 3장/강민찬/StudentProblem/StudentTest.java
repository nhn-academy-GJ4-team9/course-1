import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StudentTest {

    private static Stream<Arguments> testCase() {
        return Stream.of(
                Arguments.of("철수", "000000-000000", "CS"));
    }

    @ParameterizedTest
    @MethodSource("testCase")
    @DisplayName("Student 객체 생성: 정상")
    void getStudentConstructionTest(String name, String number, String major) {
        Student student = new Student(name, number, major);

        Assertions.assertInstanceOf(Student.class, student);
    }

    @Test
    @DisplayName("Student 객체 생성: 에러")
    void  getStudentConstructionTestWithError() {
        Assertions.assertThrows(NullPointerException.class, () -> new Student(null, null, null));
    }

    /**
     * 문제1: toString()을 예시처럼 출력하시오. 테스트 코드 수정 금지
     * 예시: {name} {number} {major}, (중괄호로 묶인 부븐에 매개변수의 값을 출력.)
     *
     * @param name String, 학생의 이름
     * @param number String, 학생의 주민등록번호
     * @param major String, 학생의 전공
     */
    @ParameterizedTest
    @MethodSource("testCase")
    @DisplayName("toString() 출력이 정상적으로 이루어지는지 확인")
    void getStudentToStringTest(String name, String number, String major) {
        Student student = new Student(name, number, major);
        String actual = name + " " + number + " " + major;

        Assertions.assertEquals(student.toString(), actual);
    }
}