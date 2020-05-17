package com.jrx.test;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * LinkedHashSet集合同样是根据元素的hashCode值来决定元素的存储位置，但是它同时使用链表维护元素的次序。
 * 这样使得元素看起 来像是以插入顺序保存的，当遍历该集合时候，LinkedHashSet将会以元素的添加顺序访问集合的元素。
 */
public class LinkHashSet01 {
    public static void main(String[] args) {
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("A");
        s1.add("C");
        s1.add("B");
        s1.add("D");
        System.out.println("LinkedHashSet: " + s1);
        /*删除某一元素*/
        s1.remove("B");
        System.out.println("LinkedHashSet: " + s1);

        /*删除全部元素*/
        s1.clear();
        System.out.println("LinkedHashSet: " + s1);

    }
}
