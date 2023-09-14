import java.util.ArrayList;
import java.util.Arrays;


/**
 * 주어진 문자열에 "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 
 */
public class Main_gichang {
    public static void main(String[] args) {
        String[] result = solution("dxccxbbbxxaaaa");
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static String[] solution(String input) {
        String[] parts = input.split("x");

        ArrayList<String> list = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(part);
            }
        }

        String[] result = new String[list.size()];
        result = list.toArray(result);

        Arrays.sort(result);

        return result;
    }
}