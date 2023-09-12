//https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni02/node6.html

public class MyString {

    private String string;

    public MyString(String string) {
        this.string = string;
    }

    public String myConcat(String str) {
        return this.string + str;
    }

    public int myLength(String str) {
        // 2. 문자열 길이 구현
        int length = 0;
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            length++;
        }
        return length;
    }

    public String myToUpperCase(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            }
            result.append(ch);
        }
        return result.toString();
    }

    // 소문자 변환
    public String myToLowerCase(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            result.append(ch);
        }
        return result.toString();
    }

}
