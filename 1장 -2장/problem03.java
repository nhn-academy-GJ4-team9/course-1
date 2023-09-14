public class problem03 {

    private String string;

    public void MyString(String string) {
        this.string = string;
    }

    public String myConcat(String str) {
        // 1. 문자열 연결 구현
        str = "안녕";
        str = "하세요";

        String result = str.concat(str);
        System.out.println(str);
        return "";
    }

    public int myLength(String str) {
        // 2. 문자열 길이 구현
        str.length();
        return 0;
    }

    public String myToUpperCase(String str){
        // 3. 대문자 반환 구현
        str.toUpperCase();
        return "";
    }

    public String myToLowerCase(String str){
        // 4. 소문자 반환 구현
        str.toLowerCase();
        return "";
    }

}