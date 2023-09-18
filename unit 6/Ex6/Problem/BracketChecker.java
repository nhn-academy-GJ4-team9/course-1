package hyunjoong.org.example.unit6;
/**
 *
 주어진 문자열에서 괄호가 맞는지 확인하기.
 괄호에는 소괄호 (), 중괄호 {}, 대괄호 []이 포함된다.

 문자열을 입력받아 해당 문자열 내의 괄호가 올바르게 균형잡혀 있으면 true, 그렇지 않으면 false를 반환한다.
 함수명: isBalanced
 입력: String s
 출력: boolean
 예시:

 "([])" → true
 "([)]" → false
 "{[()]}" → true
 "{[}]" → false

 */


public class BracketChecker {
    public boolean isBalanced(String s) {
        boolean result = true;
        for(int i = 0; i < s.length()/2 ; i++){
            switch (s.charAt(i)){
                case '(':
                    if(s.charAt(s.length()-i-1)== ')'){
                        result = true;
                        break;
                    } else{
                        result = false;
                        break;
                }
                case '{':
                    if(s.charAt(s.length()-i-1)== '}'){
                        result = true;
                        break;
                    } else {
                        result = false;
                        break;
                    }
                case '[':
                    if(s.charAt(s.length()-i-1)== ']'){
                        result = true;
                        break;
                    } else{
                        result = false;
                        break;
                    }


            }
        }
            // i번째에서 ( 만나면 s -i-1에서 )가 있어야한다.



        return result;
    }
     
}
