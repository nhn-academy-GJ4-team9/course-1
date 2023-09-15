# 3장 문제

## 문제

    - 다음 코드가 정상적으로 동작하기 위해서 필요한 조치를 기술하시오.

```java
public class Main {
    public static void main(String[] args) {
        try {
            int sum = 0;
            int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }

        System.out.println(sum);
    }
}
```

## 답안

- 이 밑에 답안 작성
  - [답변] System.out.println(sum); 을 try block의 지역 변수 범위 안에 넣어준다.

## 주제
    
    - 지역 변수의 범위 
