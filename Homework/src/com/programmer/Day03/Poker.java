package com.programmer.Day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 扑克牌
 * @author JKMaster
 *
 */
public class Poker {
    //1.创建牌的点数和花色
	private static final String[] color = {"♥","♦","♠","♣"};
	private static final String[] num = 
		{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	//特殊 大小王
	private static final String[] king = 
		{"大王","小王"};
	
	//存储所有牌的集合
	private static List<String> list = new ArrayList<>();
	
	//存牌
	public static void setPoker() {
		for(int i = 0; i<color.length;i++) {
			for(int j = 0;j<num.length;j++) {
				list.add(color[i]+num[j]);
			}
			if(i<king.length) {
				list.add(king[i]);
			}
			
		}
		
	}
	//洗牌了
	public static void flushPorker() {
		Collections.shuffle(list);
	}
	
	//发牌
	/**
	 * 发牌程序
	 * @param p1List 玩家1
	 * @param p2List 玩家2
	 * @param p3List 玩家3
	 * @param p4List 最后3张牌
	 */
	public static void dealPoker(List<String> p1List,List<String> p2List,List<String> p3List,List<String> p4List) {
		  //遍历存储牌的集合 获取下标 
		for(int i = 0 ;i<list.size();i++) {
			   if(i < list.size()-3) {
				   //三个人发牌  
				   //扑克牌是54张 -3 张 = 51张  /3个人 = 17张
				   if(i%3 == 0) {
					   p1List.add(list.get(i));
				   }else if(i%2 == 0) {
					   p2List.add(list.get(i));
				   }else{
					   p3List.add(list.get(i));
				   }
				   
			   }else {//保存三张牌
				   p4List.add(list.get(i));
			   }
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
