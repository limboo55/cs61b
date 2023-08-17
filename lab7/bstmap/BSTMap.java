package bstmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BSTMap <K extends Comparable<K>,V> implements Map61B<K,V>  {
    private node root;
    private int size;
    public BSTMap(){}

    @Override
    public void clear() {
        root = null;
        size =0;

    }

    @Override
    public boolean containsKey(K key) {
        node cur = root;
        while(cur !=null){
            int com =key.compareTo(cur.key);
            if (com == 0) {
                return true;}
            else if (com > 0) {
                cur = cur.right;
            }
            else{
                cur = cur.left;
            }

        }

        return false;
    }

    @Override
    public V get(K key) {
        node cur = root;
        while(cur !=null){
            int com =key.compareTo(cur.key);
            if(com == 0) {
                return cur.value;}
            else if (com < 0) {
                cur = cur.left;}
            else {
                cur = cur.right;}
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(K key, V value)  {
        size += 1;
        root = put(root,key,value);
    }



    private node put (node cur, K key,V value) {
        if (cur ==null){
            return new node(key, value);
        }
        int com = cur.key.compareTo(key);
        if (com == 0){
            return cur;
        } else if (com < 0) {
            cur.right = put(cur.right, key, value);}
        else{
            cur.left = put(cur.left, key, value);}
        return cur;
    }

    @Override
    public Set<K> keySet() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V remove(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<K> iterator() {
        throw new UnsupportedOperationException();
    }

    private class node {
        public K key;
        public V value;
        public node right;
        public node left;
        public node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
