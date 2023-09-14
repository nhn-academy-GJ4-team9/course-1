public class Main_KMC01 {
    public static void main(String[] args) {
        try {
            int sum = 0;
            int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
                System.out.println(sum);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        
    }
}