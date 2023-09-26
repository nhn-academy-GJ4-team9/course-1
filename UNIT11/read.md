# UNIT 11
## 동적 배열 및 연결리스트

- 배열의 한계


    배열은 변경 불가
    요소의 수와 상관없이 크기에 비례하는 메모리양 차지
    새 값을 삽입하거나 제거할때 비효율


- 동적메모리 관리


    동적메모리란?
    필요할 때마다 메모리 자원을 할당하고 더 이상 필요하지 않을 때마다 해제



- 연결리스트

    
    비어있지 않는 리스트는 첫 번째 노드에 대한 참조로 표시
    빈 목록은 null로 표시


```java
public class ListNode {
  public ElementType info; //노드 안에 있는 값
  public ListNode next;    //다음 노드 주소
}
```

![image](img/1.png)