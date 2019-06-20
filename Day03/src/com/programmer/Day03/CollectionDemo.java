package com.programmer.Day03;

import java.util.Comparator;
import java.util.TreeSet;

//����
/* ʲô�����ݽṹ?
 * ���ݽṹ�Ǽ�����洢����֯���ݵ�һ�ַ�ʽ
 * �������ݽṹ:
 * ����(����),ջ,����,��,��ϣ��(hash),��,����,ͼ
 * ���Ͼ���Ϊ�˷������Ա����,���ṩ��һ�����ݽṹʵ��
 * Java�еļ��� 
 * ��Ϊ������ Collection  / Map --> ���ǽӿ�
 * ���󼯺���ʲô
 * Collectionϸ������������
 * List(����,���ظ�)  Set(����,�Ҳ��ظ�)  --> �ӿ�
 * List Set Map  ���󼯺Ͻӿ�
 * 
 * List(�б�):�����ж����ǰ��������洢,����Ԫ���ظ�
 * ArrayList:
 *  ��������ʵ�ֵ�,����ѯ���޸ĵ�ʱ���ٶ��ǿ�,�����Ӻ�ɾ���ٶȽ���
 *  ��Java7֮ǰArrayList�ڴ�������� һ��Ԫ�ض����洢��
 *  ArrayList list = new  ArrayList();
 *  �ڶ��п���һ���ռ�����ռ��СΪ10 
 *  ��Java7֮����һ���Ż�ֻ�Ǵ���һ���ռ���
 *  ArrayList list = new  ArrayList();
 *  �����ڶ��п���10��С�Ŀռ� ,����һ��������
 *  ����һ�ε���add��ʱ��,�Ż��ʼ���ռ�
 *   ���ϵĴ�С���Զ����� ,ԭ�������1.5��+1 -->System����Copy����
 * LinkedList:
 *  ��Ҫʵ��:��˫������,����,����(�����˫��)��ջ
 *  API����һ������ pop �� push
 *    α����  != д����
 *    �ڲ���
 *   class  LinkedList{
 *        Node first
 *        Node last
 *        int size //������ �ڵ�
 *       class Node{
 *          Node Prev ��һ��
 *          Node next ��һ��
 *          Object ele  ����
 *         }
 *     ���������������
 *       addFirst(){
 *         if(size == 0){
 *         	this.fisrt = node
 *         	this.last = node
 *         }else{
 *           //��ǰ
 *           node.next = this.first
 *           this.first.prev = node
 *           this.first = node
 *           //���
 *           this.last.next = node
 *           node.prev  = this.last
 *           this.last = node
 *           
 *         }
 *         size++
 *       }
 *   
 *   }
 *  LinkedList������ɾ���Ͽ�,��ѯ�͸�����
 *  ps: 100wһ��û���κ���������
 *  
 *  Set���� �洢���������Ҳ��ظ�
 *  HashSet(BAT)
 * ʹ�õ�ɢ�б�(Hash)  ��ϣ�� = ����+����
 * hash(key)%len = ��ȡ�洢��λ��
 * ���鳤����16 �洢һ��12
 * 12%16 = 12
 * ���ǵ�һ�δ洢���ݼ���ǰ�±��е�����û���������
 * �͵�һ�δ洢,���ڶ��δ���ͬ����,������������ݽ��бȽ�
 * �� equals == true �����ݾͲ��洢 ��������
 * �������� 0.75(Ĭ��)�����ݴﵽ����������ӵ�ֵʱ,���Զ�����
 * DAG --> �����޻�ͼ(Ѱ·�㷨��͵�Ҫ��)
 *  HashSet set = new HashSet();�ײ�ʵ����HashMap ���е�ֵ����
 *  �洢��Key��
 * 
 *  TreeSet -->Java7֮ǰ�Ƕ�����  Java7֮���Ǻ�ڶ�����
 *  TreeSet��һ������������ļ���
 *    Comparator  /  Comparable  �Զ�������
 *    TreeSet����Ĭ��ʹ��ʹ��Comparable ����TreeSet�����ʱ�򼴵����޲ι��췽��
 *    TreeSetʹ���вκ͹��췽�� ʹ�õľ���Comparator
 *
 *Map����
 *Map������һ����ֵ�� --> JSON
 *Key-Value  key��Ψһ�Ҳ����ظ� value�����ظ�
 *HashMap  ʹ��Hash��ʵ�ֵ�һ��Map
 *Hashtable �Ѿ�������ʹ����
 *Properties ��Դ�ļ�
 *
 *��������������,���Ҽ���֧�ַ���
 *�����ϲ����÷���,��ô���Ͽ��Դ洢�κ�����
 *������ʹ�÷�����,�൱�����Ƽ����д洢Ԫ�ص���������
 *һ��ʹ�ü���һ����ʹ�÷��͵�,�ô����ڲ���ǿ������ת��
 *�����÷��͵ļ�����Object���� ʹ�÷��ͼ���������ȷ��������
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
		  //˫ɫ��
		  //���� 1-32  ��6��   ����1-16 ��1��
		  //���������֮���ǿ����ظ��� ����֮�䲻�����ظ�
		  TreeSet<Integer> set2 = new TreeSet<>();
		  
		  while(set2.size()!=6) {
			  set2.add((int)(Math.random()*32+1));
			  
		  }
		  
		  
		  
	}
}







