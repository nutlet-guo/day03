package com.programmer.Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��Ϸ
public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("------------------JJ������-----------------");
		System.out.println("����ϴ��....");
		Poker.setPoker();//�洢������
		Poker.flushPorker();//�൱��ϴ��
		Thread.sleep(1000);//�߳����� 1000�����൱��1��
		
		Scanner input = new Scanner(System.in);
		System.out.println("������������ҵ�����:");
		String name1 = input.next();
		String name2 = input.next();
		String name3 = input.next();
		
		//�����洢��������Ƶļ��� �ʹ洢ʣ�������Ƶļ���
		List<String> p1List = new  ArrayList<>();
		List<String> p2List = new  ArrayList<>();
		List<String> p3List = new  ArrayList<>();
		List<String> p4List = new  ArrayList<>();
		System.out.println("���뷢�ƽ׶�.....");
		//����
		Poker.dealPoker(p1List, p2List, p3List, p4List);
		Thread.sleep(1000);
		
		//�����..�������ָ�� ����ʹ��Collections��sort����
		//"2","3","4","5","6","7","8","9","10","J","Q","K","A","С��","����"
		
		//���Ƹ����
		Player p1 = new Player(name1,p1List);
		Player p2 = new Player(name2,p2List);
		Player p3 = new Player(name3,p3List);
		System.out.println("չʾ����������:");
		p1.showInfosPoker();
		p2.showInfosPoker();
		p3.showInfosPoker();
		
		System.out.println("������Ҫ�е�����ҵ�����:");
		String name4 = input.next();
		System.out.println("չʾ����:"+p4List);
		if(p1.getName().equals(name4)) {
			p1List.addAll(p4List);
			//�ٴ�����
		}else if(p2.getName().equals(name4)) {
			p2List.addAll(p4List);
			//�ٴ�����
		}else {
			p3List.addAll(p4List);
		}
		
		
		System.out.println("�е��������չʾ�������:");
		p1.showInfosPoker();
		p2.showInfosPoker();
		p3.showInfosPoker();
		
		
	} 
	
	
	
	
	
	
	
	
	
}
