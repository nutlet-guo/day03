package com.programmer.Day03;

public class Monster {
	private String name;
	private int hp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Monster() {
		
		
	}
	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	public void Attack(Ultraman u) {
		//��һ���˺�
		   int injury = (int)(Math.random()*10+10);
		//��ȡ��������Ѫ��
		   int hp = u.getHp();
		   hp -= injury;
		   //Ѫ��Ϊ0ʱ��ô��
		   if(hp>=0) {
			   u.setHp(hp);
		   }else {
			   u.setHp(0);
		   }
	}
	
	
	
	
}
