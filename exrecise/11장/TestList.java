package org.example;

import java.lang.annotation.ElementType;
    class ListNode{
        public String info;
        public ListNode next;
}
    public class TestList {

        public static void main(String[] args) {

        }

        //lis의 길이를 반환
        public static int length(ListNode lis) {
            int count = 0;
            while (lis != null) {
                count++;
                lis = lis.next;
            }
            return count;
        }

        //주어진 요소 뒤에 새 요소 s를 삽입하여 lis를수정하여 얻은 목록을 반환하고 , 그렇지 않으면 수정되지 않은 lis를 반환
        public static ListNode insertAfter(ListNode lis, String s, String been) {
            ListNode newNode = new ListNode();
            ListNode current = lis;
            while (current != null) {
                if (current.info.equals(been)) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
            return lis;
        }

        //old 의 첫 번째 발생을 ne 로 변경하여 lis를수정하여 얻은 목록을 반환
        public static ListNode modify(ListNode lis, String old, String ne) {
            ListNode current = lis;
            while (current != null) {
                if (current.info.equals(old)) {
                    current.info = ne;
                    break;
                }
                current = current.next;
            }
            return lis;
        }

        // old 의 모든 항목을 ne 로 변경하여 lis를수정하여 얻은 목록을 반환
        public static ListNode modifyAll(ListNode lis, String old, String ne) {
            ListNode current = lis;
            while (current != null) {
                if (current.info.equals(old)) {
                    current.info = ne;
                }
                current = current.next;
            }
            return lis;
        }
        public static ListNode copy (ListNode lis) {
            ListNode current = lis;
            while (current != null) {

            }
            return current;
        }
    }

        
//        public static ListNode create3NodesABC() {
//            ListNode a = new ListNode();
//            ListNode b = new ListNode();
//            ListNode c = new ListNode();
//            a.info = "A";
//            a.next = b;
//            b.info = "B";
//            b.next = c;
//            c.info = "C";
//            c.next = null;
//            return a;
//        }
//
//    public static ListNode insertFirst(ListNode lis, String s) {
//        ListNode p = new ListNode();
//        p.info = s;
//        p.next = lis;
//        lis = p;
//        return lis;
//    }
//
//    public static ListNode deleteFirst(ListNode lis) {
//        if (lis != null)
//            lis = lis.next;
//        return lis;
//    }
//
//    public static void print(ListNode lis, PrintStream ps) {
//        ListNode p = lis;
//        while (p != null) {
//            ps.print(p.info + " ");
//            p = p.next;
//        }
//        ps.println();
//    }
//
//    public static void print(ListNode lis, PrintStream ps) {
//        while (lis != null) {
//            ps.print(lis.info + " ");
//            lis = lis.next;
//        }
//        ps.println();
//    }
//
//    public static boolean search(ListNode lis, String s) {
//        while (lis != null) {
//            if (lis.info.equals(s)) return true;
//            lis = lis.next;
//        }
//        return false;
//    }
//
//    public static ListNode insertLast(ListNode lis, String s) {
//        ListNode p = new ListNode();
//        p.info = s;
//
//        if (lis == null)
//            return p;
//        else {
//            ListNode last = lis;
//            while (last.next != null)
//                last = last.next;
//            last.next = p;
//            return lis;
//        }
//    }

//    public static ListNode read(BufferedReader br) throws IOException {
//
//        ListNode lis = new ListNode();
//        ListNode p = lis;
//
//        String s = br.readLine();
//        while (s != null) {
//            p.next = new ListNode();
//            p = p.next;
//            p.info = s;
//            s = br.readLine();
//        }
//
//        lis = lis.next;
//        return lis;
//    }
//}
