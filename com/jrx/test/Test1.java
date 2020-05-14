package com.jrx.test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        /**
         * Collection 集合核心接口  Collection接口是所有集合接口的基类，提供了集合接口的通用操作
         */
        Collection<Object> clo1 = new Collection<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        /**
         * 底层数据结构是数组，查询快，增删慢
         * 线程不安全，效率高，可以存储重复元素
         */
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(2);

        List arraylist2 = new ArrayList();

        arraylist2.add(arrayList);


        System.out.println(arrayList.toString());
        System.out.println(arraylist2.toString());


        arrayList.remove(2);
        System.out.println(arrayList.toString());
        System.out.println(arraylist2.toString());

        arrayList.set(1,11);

        System.out.println(arrayList.toString());
        System.out.println(arraylist2.toString());




        System.out.println("----------------------------");


        /**
         * 底层数据结构是链表，查询慢，增删快
         * 线程不安全，效率高，可以存储重复元素
         */
        List linkedList1 = new LinkedList();
        ((LinkedList) linkedList1).addFirst(1);
        ((LinkedList) linkedList1).addLast(2);
        System.out.println(linkedList1);
        linkedList1.remove(1);
        System.out.println(linkedList1);
        int a = (Integer)linkedList1.get(0);
        System.out.println(a);

        System.out.println("------------------------");
        List vector = new Vector();
        ((Vector) vector).addElement(11);
        System.out.println(vector);

    }
}
