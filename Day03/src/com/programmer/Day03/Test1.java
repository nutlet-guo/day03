package com.programmer.Day03;

//实现
public class Test1 {
	public static void main(String[] args) {
       //1.创建出奥特曼
		Ultraman u = new Ultraman("小明", 700);
	  //2. 先创建小怪兽的名字
		String[] name = {"小白","小红","小黑","小黄"};
		//3.创建一个怪兽的数组
		Monster[] monsters = new Monster[4];
		//4.向数组中存储小怪兽
		for(int i = 0; i<monsters.length;i++) {
			Monster m = new Monster(name[i], 300);
			monsters[i] = m;
		}
		//5.设置回合数
		int round = 1;
		//核心逻辑  如何战斗
		//1.直接写一个死循环
//		while(true) {
//			//判断 小怪兽或奥特曼的hp即可
//		}
		//开始一个循环
		do {
			System.out.println("======== 第"+round+"回合 ========");
			//10% 必杀 30% 魔法 60% 普通
			//可以做一个随机数 --> 0~9 之间
			int p = (int)(Math.random()*10);
			//p --> 0,1,2,3,4,5
			if(p < 6) {
				//需要奥特曼攻击小怪兽 奥特曼是随机攻击
				//不能攻击已经死亡的小怪兽
				Monster m = MonsterUtils.selectMonster(monsters);
				//普通攻击
				u.Attack(m);
				System.out.println(u.getName()+"使用普通攻击"+m.getName());
			}else if(p < 9){ 
				//魔法攻击
				u.MagicAttack(monsters);
				System.out.println(u.getName()+"使用了魔法攻击");
				
			}else {
				//需要奥特曼攻击小怪兽 奥特曼是随机攻击
				//不能攻击已经死亡的小怪兽
				Monster m = MonsterUtils.selectMonster(monsters);
				//必杀攻击
				u.HugeAttack(m);
				System.out.println(u.getName()+"使用必杀攻击"+m.getName());
			}
			//小怪兽攻击
			for(Monster m:monsters) {
				if(m.getHp() > 0) {
					//攻击奥特曼
					m.Attack(u);
				}
			}
			System.out.println("小怪兽使用了普通攻击");
			System.out.println(u.getName()+"奥特曼的HP是:"+u.getHp());
			for(Monster m : monsters) {
				System.out.println(m.getName()+"小怪兽的HP是:"+m.getHp());
			}
			//开启下一个回合
			round +=1 ;
			
			
	     //有一方阵亡
		}while(u.getHp()>0 && MonsterUtils.aliveMonster(monsters));
		//一般条件是关系运算符
		//常见 > >= < <=
		//偶尔可见 == !=
		//关系和逻辑逻辑运算符共同组成
		
		//判断胜利
		if(u.getHp() > 0) {
			System.out.println("奥特曼胜利");
		}else {
			System.out.println("小怪兽胜利");
		}
		
		
		
		
		
		
		
		
	}
}
