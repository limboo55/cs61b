package deque;

public class LinkedListDeque <T> implements Deque<T>{
    public class Node {
        public T value;
        public Node next;
        public Node pre;
        public Node(T _value,Node pre_Node,Node next_Node)
        {
            this.value = _value;
            this.next = next_Node;
            this.pre = pre_Node;

        }

    }
    private int size = 0;
    private Node head = new Node(null,null,null);
    private Node last = new Node(null,null,null);

    public LinkedListDeque() {
        head.next = last;
        last.pre =head;
    }
    @Override
    public void addFirst(T item){
        Node Newnode = new Node(item,head,head.next);
        head.next.pre = Newnode;
        head.next = Newnode;
        size ++;
    }
    @Override
    public void addLast(T item){
        Node newNode = new Node(item,last.pre,last);
        last.pre.next = newNode;
        last.pre = newNode;
        size ++;
    }
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void printDeque(){
        for(Node index = head.next;index != last;index = index.next){
            System.out.print(index.value + " ");
        }
        System.out.println();
    }
    @Override
    public T removeFirst(){
        if (size == 0) return null;
        T temp = head.next.value;
        head.next = head.next.next;
        head.next.pre = head;
        size --;
        return temp;
    }
    @Override
    public T removeLast(){
        if (size == 0) return null;
        T temp = last.pre.value;
        last.pre = last.pre.pre;
        last.pre.next = last;
        size --;
        return temp;
    }
    @Override
    public T get(int index){
        if (index >= size || index<0) return null;
        Node cur = head.next;
        for(int i = 0;i<index;i++) {
            cur =cur.next;
        }
        return cur.value;
    }



}
