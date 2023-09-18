package org.example;

public class E7 {
    /*
    s = 65L; 컴파일 오류를 발생. 명시적 형변환 없이 long 값을 short 변수에 할당할 수 없습니다.
    f = i+100; 오류를 발생시키지 않습니다. int는 float 변수에 할당될 수 있습니다.
    i = 2*b + l; 컴파일 오류를 발생. long을 int로 암시적 형변환하는 것은 허용되지 않습니다. 따라서 명시적 형변환을 사용해야 합니다: i = (int)(2*b + l);
    b1 = s; 오류를 발생. short 값을 boolean 변수에 할당할 수 없습니다.
    b2 = s >= 57; 오류를 발생시키지 않습니다. 오른쪽 표현식은 boolean 값을 반환하므로 boolean 변수에 할당할 수 있습니다.
    c = b; 오류를 발생. 명시적 형변환 없이 byte 값을 char 변수에 할당할 수 없습니다.
    c = 'b'; 오류를 발생시키지 않습니다. 'b’는 char 리터럴이므로 char 변수에 할당할 수 있습니다.
     */
}