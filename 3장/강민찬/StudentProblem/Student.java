// 문제: toString() 출력을 동일하게 만들기
public class Student extends Person {
    private String major;

    public Student(String name, String registrationNumber, String major) {
        super(name, registrationNumber);
        this.major = major;
        preCondition();
    }

    private void preCondition() {
        if (super.getName() == null || super.getRegistrationNumber() == null || this.major == null) {
            throw new NullPointerException("객체의 요소가 초기화 되지 않았습니다.");
        }
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getMajor();
    }
}
