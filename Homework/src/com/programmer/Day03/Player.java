package com.programmer.Day03;

import java.util.ArrayList;
import java.util.List;

/**
 * �����
 * @author JKMaster
 *
 */
public class Player {
    private String name;
    //���е���
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
	
	//���չʾ�������
	public void showInfosPoker() {
		System.out.println(name+":"+pokers);
	}
    
    
} 
