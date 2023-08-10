package deque;

import org.junit.Test;

public class TestforAD {
    @Test
    public void test(){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addLast(5);
        ad.addLast(6);
        ad.addLast(7);
        ad.addLast(8);
        ad.addLast(7);
        ad.addLast(8);
        System.out.println(ad.get(5));
        System.out.println(ad.get(6));
        System.out.println(ad.get(1));
        System.out.println(ad.get(8));
        ad.addFirst(1);
        ad.addFirst(12);
        ad.addFirst(15);
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();
        ad.removeLast();



    }
}
