import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 리스트 클래스 데이터 타입을 ElementType 으로 할 수 있음
 *
 * @param <E>
 */
public class ListNode<E> {
    public E info;
    public ListNode next;


    /**
     * 첫번째 요소 삽입
     *
     * @param lis 새로운 요소 정보
     * @param s   다음 연결
     * @return
     */
    public static ListNode insertFirst(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;     //새 요소 정보
        p.next = lis;   //새 노드를 원래 리스트에 연결
        lis = p;        //리스트의 첫 노들르 새 노드로 업뎃
        return lis;
    }

    /**
     * 첫번째 요소 삭제
     * 첫번쨰 요소 다음에 오는 요소부터 시작하는 리스트 반환
     *
     * @param lis
     * @return
     */
    public static ListNode deleteFirst(ListNode lis) {
        if (lis != null) {
            lis = lis.next;
        }
        return lis;
    }

    /**
     * 요소 출력
     *
     * @param lis 링크드 리스트
     * @param ps 출력을 위한 프린트
     */
    public static void print(ListNode lis, PrintStream ps) {
        ListNode p = lis;
        while (p != null) {
            ps.print(p.info + " ");
            p = p.next;
        }
        ps.println();
    }

    /**
     * 요소 검색
     *
     * @param lis 링크드 리스트
     * @param s 검색할 요소
     * @return 검색한 값이 존재하면 true , 없으면 false
     */
    public static boolean search(ListNode lis, String s) {
        while (lis != null) {
            if (lis.info.equals(s)) {
                return true;
            }
            lis = lis.next;
        }
        return false;
    }

    /**
     * 요소 마지막에 삽입
     * @param lis 링크드 리스트
     * @param s 새로운 요소
     * @return 요소 삽입된 링크드 리스트
     */
    public static ListNode insertLast(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;

        if (lis == null) {
            return p;
        } else {
            ListNode last = lis;
            while (last.next != null) {
                last = last.next;
            }
            last.next = p;
            return lis;
        }
    }

    /**
     * 중간 요소 삭제
     * @param lis 링크드 리스트
     * @param s 삭제할 요소
     * @return 삭제된 리스트
     */
    public static ListNode delete(ListNode lis, String s) {
        ListNode p = new ListNode();    // 생성 노드 생성
        p.next = lis;
        lis = p;

        boolean found = false;
        while ((p.next != null) && !found) {
            if (p.next.info.equals(s)) {
                p.next = p.next.next;       // 원소 삭제
                found = true;               // 루프 탈출
            } else {
                p = p.next;
            }
        }

        return lis.next;                // 생성 노드 삭제
    }

    /**
     * 리스트의 길이를 구하는 메서드
     * @param lis 링크드 리스트
     */
    public static int length(ListNode lis) {
        ListNode p = lis;
        int length = 0;
        while (p != null) {
            p = p.next;
            length++;
        }
        return length;
    }

    //2. 주어진 원소 뒤에 새 원소를 삽입하는 메서드
    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode p = lis;
        while (p != null && !p.info.equals(given)) {
            p = p.next;
        }
        if (p != null) {
            ListNode newNode = new ListNode();
            newNode.info = s;
            newNode.next = p.next;
            p.next = newNode;
        }
        return lis;
    }

    //3. 첫 번째 일치하는 원소를 변경하는 메서드
    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null && !p.info.equals(old)) {
            p = p.next;
        }
        if (p != null) {
            p.info = ne;
        }
        return lis;
    }

    //4. 모든 일치하는 원소를 변경하는 메서드
    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null) {
            if (p.info.equals(old)) {
                p.info = ne;
            }
            p = p.next;
        }
        return lis;
    }

    //5. 주어진 원소 앞에 새 원소를 삽입하는 메서드
    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode p = lis;
        while (p != null && !p.next.info.equals(given)) {
                p = p.next;
        }
        if (p != null){
            ListNode newNode = new ListNode();
            newNode.info = s;
            newNode.next = p.next;
            p.next = newNode;
        }
        return lis;
    }

    // 6. 리스트를 복사하는 메서드
//    public static ListNode copy(ListNode lis){
//
//    }

    //7. 리스트를 뒤집는 메서드
    public static ListNode invert(ListNode lis){
        ListNode p = lis;
        ListNode n = lis;
        Stack<Object> stack = new Stack<>();

        while(p != null){
            stack.push(p.info);
            p = p.next;
        }

        while(n != null){
            n.info = stack.pop();
            n = n.next;
        }
        return lis;
    }

    //8. 리스트에서 중복된 원소를 삭제하는 메서드
    public static ListNode deleteDoubles(ListNode lis){
        ListNode p = lis;
        ArrayList<String> arrayList = new ArrayList<>();
        while(p != null){
            if(arrayList.contains(p.info)){
                delete(lis, (String) p.info);
            }
            else{
                arrayList.add((String) p.info);
            }
            p = p.next;
        }
        return lis;
    }


    //9. 한 리스트가 다른 리스트의 부분 리스트인지 확인하는 메서드
    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        ListNode p1 = lis1;
        ListNode p2 = lis2;

        while (p1 != null) {
            if (p1.info.equals(p2.info)) {
                ListNode newP1 = p1;
                ListNode newP2 = p2;
                while (true) {
                    if (newP2 == null) {
                        return true;
                    } else if (newP2.info.equals(newP1.info)) {
                        newP1 = newP1.next;
                        newP2 = newP2.next;
                    } else {
                        break;
                    }
                }
            }
            p1 = p1.next;
        }
    return false;
    }
    @Override
    public String toString() {
        return "ListNode{" +
                "info=" + info +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        ListNode e = new ListNode();
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = d;
        d.info = "C";
        d.next = e;
        e.info = "E";
        e.next = null;

        System.out.println("1. LikedList 길이 : " + length(a));

        //insertAfter(c,"D","B");

        //modify(a,"B","C");

        // modifyAll(a,"C","E");

        // insertBefore(a, "C", "E");

        //System.out.println(invert(a));

        length(a);
        print(a, ps);

        ps.close();
    }
}

