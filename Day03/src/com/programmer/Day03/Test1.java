package com.programmer.Day03;

//ʵ��
public class Test1 {
	public static void main(String[] args) {
       //1.������������
		Ultraman u = new Ultraman("С��", 700);
	  //2. �ȴ���С���޵�����
		String[] name = {"С��","С��","С��","С��"};
		//3.����һ�����޵�����
		Monster[] monsters = new Monster[4];
		//4.�������д洢С����
		for(int i = 0; i<monsters.length;i++) {
			Monster m = new Monster(name[i], 300);
			monsters[i] = m;
		}
		//5.���ûغ���
		int round = 1;
		//�����߼�  ���ս��
		//1.ֱ��дһ����ѭ��
//		while(true) {
//			//�ж� С���޻��������hp����
//		}
		//��ʼһ��ѭ��
		do {
			System.out.println("======== ��"+round+"�غ� ========");
			//10% ��ɱ 30% ħ�� 60% ��ͨ
			//������һ������� --> 0~9 ֮��
			int p = (int)(Math.random()*10);
			//p --> 0,1,2,3,4,5
			if(p < 6) {
				//��Ҫ����������С���� ���������������
				//���ܹ����Ѿ�������С����
				Monster m = MonsterUtils.selectMonster(monsters);
				//��ͨ����
				u.Attack(m);
				System.out.println(u.getName()+"ʹ����ͨ����"+m.getName());
			}else if(p < 9){ 
				//ħ������
				u.MagicAttack(monsters);
				System.out.println(u.getName()+"ʹ����ħ������");
				
			}else {
				//��Ҫ����������С���� ���������������
				//���ܹ����Ѿ�������С����
				Monster m = MonsterUtils.selectMonster(monsters);
				//��ɱ����
				u.HugeAttack(m);
				System.out.println(u.getName()+"ʹ�ñ�ɱ����"+m.getName());
			}
			//С���޹���
			for(Monster m:monsters) {
				if(m.getHp() > 0) {
					//����������
					m.Attack(u);
				}
			}
			System.out.println("С����ʹ������ͨ����");
			System.out.println(u.getName()+"��������HP��:"+u.getHp());
			for(Monster m : monsters) {
				System.out.println(m.getName()+"С���޵�HP��:"+m.getHp());
			}
			//������һ���غ�
			round +=1 ;
			
			
	     //��һ������
		}while(u.getHp()>0 && MonsterUtils.aliveMonster(monsters));
		//һ�������ǹ�ϵ�����
		//���� > >= < <=
		//ż���ɼ� == !=
		//��ϵ���߼��߼��������ͬ���
		
		//�ж�ʤ��
		if(u.getHp() > 0) {
			System.out.println("������ʤ��");
		}else {
			System.out.println("С����ʤ��");
		}
		
		
		
		
		
		
		
		
	}
}
