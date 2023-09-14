package org.example.problems;

/*
 * Parnets Child ChilChild는 각각의 서브클래스이다.
 * 최하위의 ChildChild의 인스턴스를 생성하면 자동으로 상위클래스들인 Child와 Parents 클래스 또한 생성된다.
 * 
 * 문제 1 : ChildChild의 생성시 Parnets의 출력을 막으려면 어떤 방법이 있을까?
 * - Hint : 기능 분리
 * 문제 2 : 상속관계를 받지않으면서 Parnets의 기능들을 사용하는 방법이 있을까?
 * - Hint : composition
 */
public class ParentsTest {
    public static void main(String[] args) {
        ChildCihld childCihld = new ChildCihld();
    }
}