import java.util.Arrays;

public class Main_Sbin02 {
    public static void main(String[] args) {
        // 두 집합을 나타내는 boolean 배열 생성
        boolean[] a = {true, false, true, false};
        boolean[] b = {true, true, false, false};

        // 교집합 연산
        boolean[] intersection = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            intersection[i] = a[i] && b[i];
        }

        // 합집합 연산
        boolean[] union = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            union[i] = a[i] || b[i];
        }

        // 차집합 연산
        boolean[] difference = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            difference[i] = a[i] && !b[i];
        }

        // 결과 출력
        System.out.println("Intersection: " + Arrays.toString(intersection));
        System.out.println("Union: " + Arrays.toString(union));
        System.out.println("Difference: " + Arrays.toString(difference));
    }
}

