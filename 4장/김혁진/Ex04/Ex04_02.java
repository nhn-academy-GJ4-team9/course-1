/**
 * Exercise 04.2 Write a predicate:
 */
public class Ex04_02 {

    /**
     * x값과 y값을 더해서 오버플로우 발생 여부를 true,false 로 반환.
     *
     * @param x
     * @param y
     * @return
     */
    public static boolean sumOverflow(byte x, byte y) {
        short xShort = x;
        short yShort = y;
        short sum = (short) (xShort + yShort);
        return sum < -128 || sum > 127;
    }

    /**
     * overflow 발생 여부 출력.
     */
    public static void main(String[] args) {
        System.out.println(sumOverflow((byte) 50, (byte) 50));
        System.out.println(sumOverflow((byte) 100, (byte) 50));
    }
}
