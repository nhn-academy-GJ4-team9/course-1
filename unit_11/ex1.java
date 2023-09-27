package org.example;

public class ex1 {

    public static int length(ListNode lis) {

        int count = 0;
        ListNode p = lis;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {


        ListNode p = lis;
        while (p != null) {
            if (p.info.equals(given)) {

                ListNode z = new ListNode();
                z.next = p.next;
                p.next = z;
                z.info = s;

            }
            p = p.next;
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null) {
            if (p.info.equals(old)) {
                p.info = ne;
                break;
            }
            p = p.next;
        }
        return lis;


    }

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


    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode p = lis;

        if (p.info.equals(given)) {
            ListNode z = new ListNode();
            z.next = lis;
            lis = z;
            z.info = s;
        }

        while (p != null && p.next != null) {
            if (p.next.info.equals(given)) {

                ListNode z = new ListNode();
                z.next = p.next;
                p.next = z;
                z.info = s;
            }
            p = p.next.next;
        }
        return lis;

    }

    public static ListNode insertLast(ListNode lis, String s) {
        ListNode p = new ListNode();      // note: p.next == null
        p.info = s;

        if (lis == null) {
            return p;                       // the list contains only the new node
        } else {
            ListNode last = lis;
            while (last.next != null)       // find last element
            {
                last = last.next;
            }
            last.next = p;
            return lis;
        }
    }

    public static ListNode copy(ListNode lis) {
        ListNode a = new ListNode();

        while (lis != null) {
            insertLast(a, lis.info);
            lis = lis.next;
        }
        a = a.next;
        return a;
    }

    public static ListNode insertFirst(ListNode lis, String s) {
        ListNode p = new ListNode();     // 1
        p.info = s;                      // 2
        p.next = lis;                    // 3
        lis = p;                         // 4
        return lis;
    }


    public static ListNode invert(ListNode lis) {
        ListNode a = new ListNode();

        a = a.next;
        while (lis != null) {
            a = insertFirst(a, lis.info);
            lis = lis.next;
        }

        return a;

    }


    public static ListNode deleteDoubles(ListNode lis) {


        ListNode answer = new ListNode();

        answer.info = lis.info;


        lis = answer;
        return lis;

    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {

        boolean result = false;
        ListNode p = lis1;
        ListNode pp = lis2;
        while (p != null) {
            if (p.info.equals(pp.info)) {
                int count = 0;
                while (pp != null && p != null) {
                    if (!p.info.equals(pp.info)) {
                        pp = lis2;
                        break;
                    } else {
                        count++;
                        if (count == length(lis2)) {
                            result = true;
                        }
                    }
                    p = p.next;
                    pp = pp.next;
                }
            }
            if (p != null) {
                p = p.next;
            }

        }

        if (result == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();
        a.info = "A";
        b.info = "B";
        c.info = "C";
        d.info = "D";
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        System.out.println(length(a));
        insertAfter(a, "zzz", "2");
        System.out.println(length(a));


        insertBefore(a, "zzz", "2");


        print(a);


        ListNode result3 = copy(a);

        print(result3);


        ListNode result4 = invert(a);
        print(result4);


        a = deleteDoubles(a);
        print(a);

        ListNode list2 = new ListNode();
        ListNode list3 = new ListNode();
        ListNode list4 = new ListNode();


        list2.info = "A";
        list3.info = "B";
        list4.info = "D";

        list2.next = list3;
        list3.next = list4;
        list4.next = null;


        System.out.println(searchSequence(a, list2));
    }

    public static void print(ListNode lis) {
        if (lis == null) {
            System.out.println();
        } else {
            System.out.print(lis.info + " ");
            print(lis.next);          // recursive call
        }
    }

}
