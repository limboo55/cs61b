package deque;

public class ArrayDeque <T> implements Deque<T>{
    private int size = 0;
    private int length;
    private int nextFirst = 0;
    private int nextLast = 0;
    private T[] array;

    public ArrayDeque(){
        array = (T[]) new Object [8];
        nextFirst = 3;
        nextLast = 4;
        length = 8;
    }
    public void resize(){
        if (size == length){
           T[] newarray = (T[]) new Object[length * 2];
           for(int i = 0;i < size;i ++){
                newarray[i] = this.get(i);
           }
            array = newarray ;
           length *= 2;
           nextFirst = length - 1;
           nextLast = size;
        }
        else if (length >=16 && size < length/4 ){
            T[] newarray = (T[]) new Object[length / 2];
            for(int i = 0;i < size;i ++){
                newarray[i] = this.get(i);
            }
            array = newarray ;
            length /= 2;
            nextFirst = length - 1;
            nextLast = size;


        }
    }
    @Override
    public void addFirst(T item){
        resize();
        array[nextFirst] = item;
        nextFirst = (nextFirst - 1 + length) % length;
        size ++;

    }
    @Override

    public void addLast(T item){
        resize();
        array[nextLast] = item;
        nextLast = (nextLast + 1) % length;
        size++;
    }
    @Override
    public boolean isEmpty(){
        return (size==0);
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void printDeque(){
        for(int i = 0;i < size;i++){
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }
    @Override
    public T removeFirst(){
        resize();
        if(size == 0) return null;
        T temp = array[(nextFirst + 1) % length];
        array[(nextFirst + 1) % length] = null;
        nextFirst = (nextFirst + 1) % length;
        size--;
        return temp;
    }
    @Override
    public T removeLast(){
        resize();
        if(size == 0) return null;
        T temp = array[(nextLast - 1 + length) % length];
        array[(nextLast - 1 + length) % length] = null;
        nextLast= (nextLast - 1 + length) % length;
        size--;
        return temp;
    }
    @Override
    public T get(int index){
        return (index < size)? array[(nextFirst + index + 1) % length]: null;
    }





}
