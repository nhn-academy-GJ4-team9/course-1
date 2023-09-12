# 2장

## 객체 및 변수 사용

System.out.println("123");

System.out 은 호출 객체입니다.
println()은 호출된 메소드입니다.
"123" 메소드에 전달된 매개변수입니다.


String 클래스 메소드


String s="";
return값 | 메소드 |
|---|---|
String  | s.concat(String str); : s문자열에 str을 붙여서 반환 |
 int    | s.length() : s문자열의 길이를 반환 |
String  | s.substring(int beginIndex) : beginIndex부터 끝까지 문자열 반환 |
String  | s.substring(int beginIndex, int endIndex): beginIndex부터 endIndex-1까지 문자열 반환 |
String  | s.toLowerCase() : s의 모든 문자열 소문자로 변환 |
String  | s.toUpperCase() : s의 모든 문자열 대문자로 변환 |
String  | s.trim() : s문자열의 선행 후행 공백이 생략된 문자열 반환 |


변수 : 객체에 대한 참조를 저장하는데 사용할 수 있는 메모리 위치를 나타냄

변수의 특징
1. 이름 : 변수를 식별하는 것
2. 유형 : 변수가 저장할 수 있는 데이터 유형
3. 주소 : 각 변수에 연관된 메모리 위치
4. 값 : 프로그램 실행 중 특정 시점에 변수가 나타내는 데이터

*프로그램 실행 중에 변수의 이름, 유형, 주소는 변경할 수 없지만 값은 변경할 수 있다.

String line="123";
String은 변수의 유형
line은 변수의 이름
"123"은 String 유형의 값


String s = new String("hello");
System.out.print(s);

new는 미리 정의된 연산자
String(String s)는 String 클래스의 생성자

생성자 new String("hello")을 호출하면 "hello"라는 문자열을 나타내는 새 객체가 생성
그러면 객체에 대한 참조는 변수 s에 할당
s로 표시된 객체의 값이 인쇄

빈문자열
String s= new String();
s에는 빈문자열이 저장


객체의 접근성
```
String s1 = new String ("test1");
String s2 = new String ("test2");
s1 = s2;
```

첫번째 문에서 생성된 객체 "test1"에 대한 참조는 손실됨
손실된 객체가 사용하는 메모리를 복구하는 작업을 garbage collection(가비지 수집)이라고 함
이 작업은 JVM에 의해 자동으로 수행됨

```
String s1 = new String ("test");
String s2 = new String ("test");
String t1 = "test";
String t2 = "test";
```

s1과s1는 서로 다른 객체애 대한 참조이고
t1과t2는 동일 객체애 대한 참조

Immutable objects(불변 객체) : 상태를 변경할 수 없는 객체
ex)String 유형

Mutable objects(가변 객체) 
ex)StringBuffer

```
StringBuffer s = new StringBuffer // 문자가 없고 초기 용량이 16자인 문자열 버퍼 생성
StringBuffer s = new StringBuffer(String str) // 문자열 인수와 동일한 문자 시퀀스를 나타내는 문자열 버퍼 생성
s.append(String str) // 이 문자열 버퍼에 문자열 추가
s.insert(int offset, String str) // offset 인덱스에 str삽입
s.replace(int start,int end,String str) // start와 end사이에 있는 문자를 str로 바꾸기
s.toString() // 이 문자열 버퍼의 데이터를 나타내는 문자열로 변환하여 반환
```

```
public class SideEffect1 {
    public static void main (String[] args) {
        StringBuffer s = new StringBuffer("test");
        StringBuffer t;
        t = s;
        s.append("!");
        System.out.println(s.toString()); //같은 값인 test!가 나온다
        System.out.println(t.toString()); //이유는 동일한 객체를 참조하고 있기 때문이다.
    }
}
```


