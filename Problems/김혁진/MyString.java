//https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni02/node6.html

public class MyString {

    private String string;

    public MyString(String string) {
        this.string = string;
    }
    //문자열 연결
// 문자열 결합
    public String myConcat(String str1) {
        return this.string+str1;
    }

    // 문자열 길이
    public int myLength(String str) {
        int length = 0;
        char[] chars = str.toCharArray();
        for (char i : chars) {
            length++;
        }
        return length;
    }

    // 대문자 변환
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

