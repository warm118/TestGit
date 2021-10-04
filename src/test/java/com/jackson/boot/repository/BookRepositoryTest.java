package com.jackson.boot.repository;

import com.jackson.boot.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class BookRepositoryTest {



    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll(){
        List<Book> bookRepositoryAll = bookRepository.findAll();
        System.out.println(bookRepositoryAll);

    }

    @Test
    public void testHashMap(){
        Map<Integer,Integer> map = new HashMap();
        map.put(0,1);
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry entry = (Map.Entry)iterator.next();
//            Integer key = (Integer)entry.getKey();
//            Integer value = (Integer)entry.getValue();
//            System.out.println("key:"+key+",value:"+value);
//        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println("key："+entry.getKey()+",value:"+entry.getValue());

        }
        System.out.println(map);
    }

    @Test
    public void testMapPutAll(){
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        hashMap1.put(0,1);
        hashMap1.put(1,1);

        hashMap2.put(3,2);
        hashMap2.put(2,2);
        hashMap2.put(4,1);
        hashMap2.put(1,1);


        hashMap1.putAll(hashMap2);
        System.out.println(hashMap1);
    }

    @Test
    public void testArrayList(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0;i<list.size();i++){
            System.out.println(i+":"+list.get(i));
        }

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    class MyThread1 extends Thread{
        public void run(){
            System.out.println("MyThread1.run");
        }
    }
    class MyThread2 extends Thread{
        public void run(){
            System.out.println("MyThread2.run");
        }
    }
    @Test
    public void testTread1(){
        MyThread1 threadTest1 = new MyThread1();
        MyThread2 threadTest2 = new MyThread2();

        threadTest1.start();
        threadTest2.start();
    }
}