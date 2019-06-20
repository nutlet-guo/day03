package com.programmer.Day03;

import java.util.Comparator;
import java.util.TreeSet;

//集合
/* 什么是数据结构?
 * 数据结构是计算机存储和组织数据的一种方式
 * 常见数据结构:
 * 数组(线性),栈,链表,树,哈希表(hash),堆,队列,图
 * 集合就是为了方便程序员开发,所提供的一种数据结构实现
 * Java中的集合 
 * 分为两大类 Collection  / Map --> 都是接口
 * 三大集合是什么
 * Collection细化出两个集合
 * List(有序,且重复)  Set(无需,且不重复)  --> 接口
 * List Set Map  三大集合接口
 * 
 * List(列表):集合中对象是按照索引存储,允许元素重复
 * ArrayList:
 *  基于数组实现的,做查询和修改的时候速度是快,做增加和删除速度较慢
 *  在Java7之前ArrayList在创建对象的 一个元素都不存储即
 *  ArrayList list = new  ArrayList();
 *  在堆中开辟一个空间这个空间大小为10 
 *  从Java7之后有一个优化只是创建一个空集合
 *  ArrayList list = new  ArrayList();
 *  不会在堆中开辟10大小的空间 ,而是一个空数组
 *  当第一次调用add的时候,才会初始化空间
 *   集合的大小是自动扩容 ,原有数组的1.5倍+1 -->System类中Copy方法
 * LinkedList:
 *  主要实现:是双向链表,数组,队列(单向和双向)和栈
 *  API中有一个方法 pop 和 push
 *    伪代码  != 写汉字
 *    内部类
 *   class  LinkedList{
 *        Node first
 *        Node last
 *        int size //链表中 节点
 *       class Node{
 *          Node Prev 上一个
 *          Node next 下一个
 *          Object ele  数据
 *         }
 *     向链表中添加数据
 *       addFirst(){
 *         if(size == 0){
 *         	this.fisrt = node
 *         	this.last = node
 *         }else{
 *           //向前
 *           node.next = this.first
 *           this.first.prev = node
 *           this.first = node
 *           //向后
 *           this.last.next = node
 *           node.prev  = this.last
 *           this.last = node
 *           
 *         }
 *         size++
 *       }
 *   
 *   }
 *  LinkedList新增和删除较快,查询和更改慢
 *  ps: 100w一下没有任何性能区别
 *  
 *  Set集合 存储数据无需且不重复
 *  HashSet(BAT)
 * 使用的散列表(Hash)  哈希表 = 数组+链表
 * hash(key)%len = 获取存储的位置
 * 数组长度是16 存储一个12
 * 12%16 = 12
 * 若是第一次存储数据集当前下标中的链表没有这个数据
 * 就第一次存储,若第二次存相同数据,会和链表中数据进行比较
 * 即 equals == true 新数据就不存储 抛弃处理
 * 加载因子 0.75(默认)当数据达到这个加载因子的值时,会自动扩容
 * DAG --> 有向无环图(寻路算法最低的要求)
 *  HashSet set = new HashSet();底层实现是HashMap 所有的值都是
 *  存储在Key中
 * 
 *  TreeSet -->Java7之前是二叉树  Java7之后是红黑二叉树
 *  TreeSet是一个排重且排序的集合
 *    Comparator  /  Comparable  自定义排序
 *    TreeSet集合默认使用使用Comparable 创建TreeSet对象的时候即调用无参构造方法
 *    TreeSet使用有参和构造方法 使用的就是Comparator
 *
 *Map集合
 *Map集合是一个键值对 --> JSON
 *Key-Value  key是唯一且不能重复 value可以重复
 *HashMap  使用Hash表实现的一个Map
 *Hashtable 已经不再已使用了
 *Properties 资源文件
 *
 *集合是引用类型,并且集合支持泛型
 *若集合不是用泛型,那么集合可以存储任何数据
 *若集合使用泛型了,相当于限制集合中存储元素的数据类型
 *一般使用集合一定是使用泛型的,好处在于不用强制类型转换
 *不是用泛型的集合是Object类型 使用泛型集合是你所确定的类型
 */
public class CollectionDemo {
     public static void main(String[] args) {
		  TreeSet<Integer> set = new TreeSet<>();
		  set.add(1);
		  set.add(10);
		  set.add(3);
		  set.add(6);
		  set.add(2);
		  System.out.println(set);
		  //双色球
		  //红球 1-32  有6个   蓝球1-16 有1个
		  //红球和蓝球之间是可以重复的 红球之间不可以重复
		  TreeSet<Integer> set2 = new TreeSet<>();
		  
		  while(set2.size()!=6) {
			  set2.add((int)(Math.random()*32+1));
			  
		  }
		  
		  
		  
	}
}







