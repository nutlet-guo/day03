package com.programmer.Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//游戏
public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("------------------JJ斗地主-----------------");
		System.out.println("正在洗牌....");
		Poker.setPoker();//存储所有牌
		Poker.flushPorker();//相当于洗牌
		Thread.sleep(1000);//线程休眠 1000毫秒相当于1秒
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个玩家的姓名:");
		String name1 = input.next();
		String name2 = input.next();
		String name3 = input.next();
		
		//创建存储玩家手里牌的集合 和存储剩余三张牌的集合
		List<String> p1List = new  ArrayList<>();
		List<String> p2List = new  ArrayList<>();
		List<String> p3List = new  ArrayList<>();
		List<String> p4List = new  ArrayList<>();
		System.out.println("进入发牌阶段.....");
		//发牌
		Poker.dealPoker(p1List, p2List, p3List, p4List);
		Thread.sleep(1000);
		
		//你完成..排序规则指定 可以使用Collections中sort方法
		//"2","3","4","5","6","7","8","9","10","J","Q","K","A","小王","大王"
		
		//将牌给玩家
		Player p1 = new Player(name1,p1List);
		Player p2 = new Player(name2,p2List);
		Player p3 = new Player(name3,p3List);
		System.out.println("展示玩家手里的牌:");
		p1.showInfosPoker();
		p2.showInfosPoker();
		p3.showInfosPoker();
		
		System.out.println("请输入要叫地主玩家的姓名:");
		String name4 = input.next();
		System.out.println("展示底牌:"+p4List);
		if(p1.getName().equals(name4)) {
			p1List.addAll(p4List);
			//再次排序
		}else if(p2.getName().equals(name4)) {
			p2List.addAll(p4List);
			//再次排序
		}else {
			p3List.addAll(p4List);
		}
		
		
		System.out.println("叫地主后玩家展示手里的牌:");
		p1.showInfosPoker();
		p2.showInfosPoker();
		p3.showInfosPoker();
		
		
	} 
	
	
	
	
	
	
	
	
	
}
