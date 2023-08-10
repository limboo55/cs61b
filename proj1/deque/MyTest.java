package deque;

import org.junit.Test;

public class MyTest {
    @Test
    public void testforaddfirst()
    {
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        lld.addFirst(5);
        lld.addFirst(6);
        lld.addFirst(7);
        lld.addFirst(8);


    }
    @Test
    public void testforaddlast()
    {
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        lld.addLast(5);
        lld.addLast(6);
        lld.addLast(7);
        lld.addLast(8);
    }
    @Test
    public void testforprint()
    {
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        lld.addLast(5);
        lld.addLast(6);
        lld.addLast(7);
        lld.addLast(8);
        lld.printDeque();
    }
    @Test
    public void testforremovefirst()
    {
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        lld.addLast(5);
        lld.addLast(6);
        lld.addLast(7);
        lld.addLast(8);
        lld.removeFirst();
    }
    @Test
    public void testforremoveLast()
    {
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        lld.addLast(5);
        lld.addLast(6);
        lld.addLast(7);
        lld.addLast(8);
        lld.removeLast();
    }

}
