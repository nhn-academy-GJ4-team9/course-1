import org.example.Person;
import org.example.Student;

/*
/*
문제 :  Student는 Person의 subclass이다.
       Person 타입 pp는 Student s를 참조했지만 getFaculty 메소드를 사용할 수 없다.
       해당 기능을 사용할 수 있도록 수정해주세요.

       또한 Person ps는 s를 똑같이 참조했지만 overriding된 Student의 printdata를 사용 할 수 있다.
       어째서 해당 결과가 나오는가?
 */
public class TestStudent {
    public static void main(String[] args) {
        Person p = new Person("Daniele", "Roma");
        Student s = new Student("Jacop", "Roma", "Engineering");
        Person pp = s;
        Student ss = (Student) pp;
        // System.out.println(pp.getFaculty());
        System.out.println(ss.getFaculty());
        System.out.println();

        p.printData();
        s.printData();
        Person ps = s;
        ps.printData();
        // 타입이 Person 타입이더라도 정의된 Instance가 Student이기 때문에
        // 해당 메서드를 호출하면 Overriding된 Student의 메서드가 출력된다.
    }
}