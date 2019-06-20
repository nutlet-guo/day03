package com.programmer.Day03;
/**
 * 为了获取小怪兽使用
 * @author JKMaster
 *
 */
public class MonsterUtils {
    // 工具类 --> 这里的属性和方法都是静态的
	// 不能创建对象
	private MonsterUtils() {}
	/**
	 * 挑选活着的小怪兽
	 * @param ms 存储小怪兽的数组
	 * @return 活着小怪兽
	 */
	public static Monster selectMonster(Monster[] ms) {
		// 声明一个小怪兽对象
		Monster m;
		do {
			//随机获取下标
			int index = (int)(Math.random()*ms.length);
			m = ms[index];
			
		}while(m.getHp() == 0);
		return m;
	}
	
	/**
	 * 挑选或者的小怪兽
	 * @param ms
	 * @return
	 */
	public static boolean aliveMonster(Monster[] ms) {
		for(Monster m : ms) {
			if(m.getHp() > 0) {
				return true;
			}
		}
	   return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
