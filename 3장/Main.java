public class Main {
    public static void main(String[] args) {
        int sum = 0;

        try {
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

// 지역변수의 범위에 맞게 sum 지역변수를 이동하여 해결
