package com.programmer.Day03;
/**
 * 回合制游戏
   输出:
  ======== 第X回合 ========
   XXX凹凸曼 血量XXX  
   		 30%			60%				10%
   使用了 魔法攻击全体/普攻,XXX小怪兽/必杀,XXX小怪兽
   XXX小怪兽 血量XXX
   XXX小怪兽 血量XXX
   XXX小怪兽 血量XXX
   XXX小怪兽 血量XXX
   小怪兽使用了普攻
  
   凹凸曼血量为0,小怪兽胜利
   所有的小怪兽都死了,凹凸曼胜利

   凹凸曼 普攻和必杀不能攻击死了小怪兽 随机
          魔法无所谓 小怪兽的血量不能出现负数 0
   小怪兽 死了小怪兽不能攻击 0

 * @author JKMaster
 *
 */
public class Ultraman {
   private String name;
   private int hp;
   
   
   public Ultraman() {
	super();
	// TODO Auto-generated constructor stub
}


public Ultraman(String name, int hp) {
	super();
	this.name = name;
	this.hp = hp;
}


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


//普通攻击
   public void Attack(Monster m) {
	   //做一个伤害
	   int injury = (int)(Math.random()*10+20);
	   //获取小怪兽的血量
	   //获取奥特曼的血量
	   int hp = m.getHp();
	   hp -= injury;
	   //血量为0时怎么办
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
 
   }
//必杀攻击
   public void HugeAttack(Monster m) {
	   //做一个伤害
	   int injury = (int)(m.getHp()*0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
	   //获取小怪兽的血量
	   //获取奥特曼的血量
	   int hp = m.getHp();
	   hp -= injury;
	   //血量为0时怎么办
	   if(hp>=0) {
		   m.setHp(hp);
	   }else {
		   m.setHp(0);
	   }
	   
   }
   //魔法
   public void MagicAttack(Monster[] m) {
	   for(Monster ms :m) {//数组里面
		   int hp = ms.getHp();
		   hp-= 30;
		 //血量为0时怎么办
		   if(hp>=0) {
			   ms.setHp(hp);
		   }else {
			   ms.setHp(0);
		   }
	   }
	   
	   
   }
}
