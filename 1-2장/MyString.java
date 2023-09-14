public class MyString {

    private String string;

    public MyString(String string) {
        this.string = string;
    }

    // 문자열 연결
    public String myConcat(String str) {
        return this.string + str;
    }

    // 문자열 길이
    public int myLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }

        return count;
    }

    // 대문자 변환
    public String myToUpperCase(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (97 <= ch && ch <= 122) {
                builder.append(ch - 26);
            }
            builder.append(ch);
        }

        return builder.toString();
    }

    // 소문자 변환
    public String myToLowerCase(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (65 <= ch && ch <= 90) {
                builder.append(ch + 26);
            }
            builder.append(ch);
        }

        return builder.toString();
    }

}
