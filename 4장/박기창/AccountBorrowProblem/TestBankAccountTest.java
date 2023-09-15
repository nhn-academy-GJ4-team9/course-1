import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * borrow 메서드 작성
 */
class TestBankAccountTest {
    @Test
    @DisplayName("첫 번째 값 테스트")
    void valueTest(){
        BankAccount ba = new BankAccount("Mario", "Rossi");
        BankAccount ba2 = new BankAccount("Mario2", "Rossi2");
        ba.deposit(1000);
        ba.withdraw(100);
        ba2.borrow(ba,100);
        Assertions.assertEquals(ba.getAccount(),800);
    }

}
