package com.xia.map;

public class LRULinkedHashMapTest {
  public static void main(String args[]){
    LRULinkedHashMap<String,String> lruCache = new LRULinkedHashMap<>();

    lruCache.put("1","test1");
    lruCache.put("2","test2");
    lruCache.put("3","test3");
    lruCache.put("4","test4");
    lruCache.put("5","test5");
    System.out.println("初始化-------------------");
    lruCache.forEach((k,v)->System.out.println(v));


    //访问1
    lruCache.get("1");
    System.out.println("访问后-------------------");
    lruCache.forEach((k,v)->System.out.println(v));


    //追加6
    lruCache.put("6","test6");
    System.out.println("追加后-------------------");
    lruCache.forEach((k,v)->System.out.println(v));
  }
}
