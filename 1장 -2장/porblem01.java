public class problem01 {
    public static void main(String[] args) {
        // 이름을 나타내는 String 객체 생성
        String name = "BIN";

        // 첫 번째 문자 출력
        char firstChar = name.charAt(0);
        System.out.println("첫 번째 문자: " + firstChar);

        // 마지막 문자 출력
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("마지막 문자: " + lastChar);
    }
}
