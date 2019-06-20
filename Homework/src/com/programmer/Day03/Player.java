package com.programmer.Day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 玩家类
 * @author JKMaster
 *
 */
public class Player {
    private String name;
    //手中的牌
    private List<String> pokers = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPokers() {
		return pokers;
	}
	public void setPokers(List<String> pokers) {
		this.pokers = pokers;
	}
	public Player() {
		
	}
	public Player(String name, List<String> pokers) {
	
		this.name = name;
		this.pokers = pokers;
	}
	
	//玩家展示手里的牌
	public void showInfosPoker() {
		System.out.println(name+":"+pokers);
	}
    
    
} 
