package com.introduction.unit11;

import java.util.List;

public class Ex11_1 {
    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c= new ListNode();
        a.info ="A";
        a.next = b;
        b.info ="B";
        b.next = c;
        c.info = "C";
        c.next = null;

        System.out.println(a);
        System.out.print("length : ");
        System.out.println(length(a));

        insertAfter(a,"B","D");
        System.out.println("insertafter");
        System.out.println( a);

        modify(a,"D","C");
        System.out.println("modiyfy");
        System.out.println( a);

        allModify(a,"C","A");
        System.out.println("allmodify");
        System.out.println( a);


        a = insertBefore(a,"A","C");
        System.out.println("insertbefore");
        System.out.println(a);
        a= insertBefore(a,"B","D");
        System.out.println(a);
        System.out.println("copy");
        b = copy(a);
        a = insertBefore(a,"B","D");
        System.out.println(a);
        System.out.println(b);
        System.out.println("invert");
        a = invert(a);
        System.out.println(a);
    }
    public static boolean search(ListNode lis, String s){
        while(lis != null){
            if(lis.info.equals(s))
                return true;
        }
        return false;
    }
    public static int length(ListNode lis){
        int length = 0;
        ListNode p = lis;
        while(p != null){
            length++;
            p = p.next;
        }
        return length;
    }
    // a b c
    // p   t
    // b와 c 연결 끊기 >> 사이에 given 추가 >> b에 given 잇기 >> given에 c 잇기
    public static ListNode insertAfter(ListNode lis, String s, String given){
        ListNode p = lis;
        while (p != null){
            if(p.info.equals(s)){
                ListNode t = new ListNode();
                t.info = given;
                t.next = p.next;
                p.next = t;
            }
                p = p.next;
        }
        return lis;
    }
    // a b (d) c
    // p    t교체
    public static ListNode modify(ListNode lis, String old, String ne){
        ListNode p = lis;
        if(p.info.equals(old)){
            ListNode t= new ListNode();
            t.info = ne;
            t.next = p.next;
            lis = t;
            return lis;
/**
 * 질문 사항 a =  modify , modify() 실행 오류
 */

        }
        while (p != null && p.next != null){
            if (p.next.info.equals(old)){
                ListNode t = new ListNode();
                t.info = ne;
                t.next = p.next.next;
                p.next =t;
                break;
            }
            p = p.next;
        }

        return lis;
    }
    public static ListNode allModify(ListNode lis, String old, String ne){
        ListNode p = lis;
        while (p != null && p.next != null){
            if (p.next.info.equals(old)){
                ListNode t = new ListNode();
                t.info = ne;
                t.next = p.next.next;
                p.next =t;
            }
            p = p.next;
        }

        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given){
        ListNode p = lis;

        if(p.info.equals(s)){
            ListNode t= new ListNode();
            t.info = given;
            t.next = p;
            return t;
        }
        while (p != null && p.next != null){
            if(p.next.info.equals(s)){
                ListNode t = new ListNode();
                t.info = given;
                t.next = p.next;
                p.next = t;
                p = t; // break 추가 하거나 현재 노드 주소
            }
            p = p.next;
        }

        return lis;
    }
    public static ListNode copy(ListNode lis){
        if(lis == null){
            return  null;
        }
        ListNode copy = new ListNode();
        copy.info = lis.info;
        copy.next = null;

        ListNode o = lis;
        ListNode c = copy;

        while(o.next!= null){
            c.next = new ListNode();
            c.next.info = o.next.info;
            c.next.next = null;
            o = o.next;
            c = c.next;
        }
        return  copy;
    }

    public static ListNode invert(ListNode lis){
        ListNode p = lis;
        ListNode invert = new ListNode();
        while (p != null){
            invert.info = p.info;
            invert.next = p;
            invert = p;
            p = p.next;
        }

        return  p;
    }






}
