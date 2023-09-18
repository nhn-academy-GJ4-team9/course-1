package gichang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * 아래 assert문에서 true값이 나오도록
 * BankAccount문에 Object클래스에서
 * equals()함수와 hashcode()함수를 name과 surname이 같으면 true값을 반환하도록 오버라이딩하시오
 */

class TestBankAccountTest {
    @Test
    @DisplayName("첫번째 테스트")
    void firstTest() {
        BankAccount one = new BankAccount("park", "gichang");
        BankAccount two = new BankAccount("park", "gichang");
        Assertions.assertTrue(one.equals(two));
    }

    @Test
    @DisplayName("두번째 테스트")
    void secondeTest() {
        BankAccount one = new BankAccount("park", "gichang");
        BankAccount two = new BankAccount("jun", "gichang");
        Assertions.assertFalse(one.equals(two));
    }

}
