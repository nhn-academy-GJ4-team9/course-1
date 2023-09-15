public class Main_KMC01 {
    /**
     * 문제: README 참조
     * 예시: README 참조
     *
     * @param input, 사용자의 입력
     * @return 주어진 규칙을 활용하여 해독한 원본 문자열 (String)
     */
    public static String solution(String input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                int convertCharNum = input.charAt(i) - 3;
                if (convertCharNum < 'A') {
                    convertCharNum += 26;
                }
                builder.append((char)convertCharNum);
            }
            else{
                builder.append(input.charAt(i));
            }
        }
        return builder.toString();
    }
}