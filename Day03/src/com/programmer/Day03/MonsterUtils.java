package com.programmer.Day03;
/**
 * Ϊ�˻�ȡС����ʹ��
 * @author JKMaster
 *
 */
public class MonsterUtils {
    // ������ --> ��������Ժͷ������Ǿ�̬��
	// ���ܴ�������
	private MonsterUtils() {}
	/**
	 * ��ѡ���ŵ�С����
	 * @param ms �洢С���޵�����
	 * @return ����С����
	 */
	public static Monster selectMonster(Monster[] ms) {
		// ����һ��С���޶���
		Monster m;
		do {
			//�����ȡ�±�
			int index = (int)(Math.random()*ms.length);
			m = ms[index];
			
		}while(m.getHp() == 0);
		return m;
	}
	
	/**
	 * ��ѡ���ߵ�С����
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
