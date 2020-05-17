package com.jrx.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Queue01 {
    public static void main(String[] args) throws java.lang.Exception {
//        new Queue01().method1();
        new Queue01().method2();

    }


//    有界队列
    public void method1()throws java.lang.Exception{
        //长度是需要定义的 基于数组的阻塞队列实现
        ArrayBlockingQueue<String> arrayQueue = new ArrayBlockingQueue<String>(5);  //初始化一定要有长度
        arrayQueue.add("a");
        arrayQueue.put("b");  //add和put方法其实是一样效果的
        arrayQueue.add("c");
        arrayQueue.add("d");
        arrayQueue.add("e");
        //offer  offer方法可以设置添加的延迟时间并且返回true/false表示添加成功还是失败。
        boolean flag = arrayQueue.offer("f", 2, TimeUnit.SECONDS);  //TimeUnit里面有时分秒等等，意思是多少时间后添加
        System.out.println(flag);  //会返回false，因为长度为5，f是添加的第六个，所以会添加失败

        arrayQueue.offer("ll");
        System.out.println(arrayQueue.toString());
    }


//无界队列
/*
LinkedBlockingQueue是无界队列，它的初始化可以不定义长度，
也是可以定义长度的，当初始化定义长度时，超长添加也是像ArrayBlockingQueue一样，
add方法会报错，put方法会不停止线程，offer方法会返回false。
 */
    public void method2()throws java.lang.Exception {

        LinkedBlockingQueue<String> linkQueue = new LinkedBlockingQueue<String>();
        linkQueue.add("a");
        linkQueue.put("b");
        linkQueue.add("c");
        linkQueue.offer("f");
        boolean flag = linkQueue.offer("f", 2, TimeUnit.SECONDS);
        List<String> list = new ArrayList<>();
        linkQueue.drainTo(list, 3);  //将队列的第一到第三个数据流失到list中，流失后的数据将不在队列里
        System.out.println("被drainTo的列表的长度"+list.size());
        System.out.println("被drainTo的列表的数据：");
        for(String str : list){
            System.out.println(str);
        }
        System.out.println("drainTo方法后队列的数据：");
        Iterator<String> ite = linkQueue.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

    }

}
