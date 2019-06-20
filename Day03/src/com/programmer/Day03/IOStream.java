package com.programmer.Day03;

import java.io.Serializable;

//IO��
/*
 * �Ĵ�����
 * �ֽ����������
 * InputStream  OutputStream
 * �ַ����������
 * Reader  Writer
 * 
 * ��Ҫ��ȷʹ�õ���ʲô��? �ֽڻ����ַ�
 * ��ʹ�õ����ֽ��� --> ���е��������ֽ�,�ͻ�ʹ��byte���͵�����
 * ��ʹ�õ����ַ��� --> ���е��������ַ�,�ͻ�ʹ��char���͵�����
 * ������ --> read    д���� --> write
 * ����Ҫ���йر� close  д���ݵ�ʱ��Ϊ�˼ӿ���������  flush
 * 
 * �������ļ�����
 * �ֽ�  FileInputStream��FileOutputStream
 * �ַ� FileReader �� FileWriter
 * �ǵ�ǰ�Ĵ�����������
 * 
 * ��������þ����ֽ���,��Ϊ�ֽ������Զ�ȡ�κ�����,�ֽ�������һ���׶�
 * ,�ֽ�����ȡ�ļ�(�ı��ļ�)��ʱ��,���ļ��д��ں���,�������������
 * Java�г��õ��ַ������� GBK,UTF-8, ISO-8859-1(����)
 * 
 * ��  --> ʹ���ֽ�����ȡ����(1��1���ֽ�) ��һ����������,��Ľ������?
 * 
 * ת����(����ָ���ļ��ı��뼯)  ������ת�����ĸ�����Reader��Writer
 * �ֽ�ת�ַ�
 * InputStreamReader
 * �ַ�ת�ֽ�
 * OutputSteamWriter
 * 
 * Ϊ�˼ӿ����Ķ�ȡ��д���ٶ�
 * ������
 * �ֽ� ��ȡ����ʱĬ�ϻ�������С�� 8192 --> 4096
 * BufferedInputStream �� BufferedOutputStream
 * �ַ�
 * BufferedReader �� BufferedWriter
 * �ṩ�������·���  
 * ��ȡ���ݵ�ʱ�����ʹ��readLine  һ�ζ�ȡһ��(����ֵ���ַ���)
 * ������ȡ���з���
 * д�����ݵ�ʱ�� newLine-->��д���з�
 * 
 * ������
 * ObjectInputStream �����л�
 * ObjectOutputStream ���л�
 * ������д�ɶ������ļ�,����������򱾵ؽ��д���ʹ��
 * readObject() ��ȡ����  writerObject() д���� 
 * TCP����-->ʹ����ʹ��һ�����ֽ���
 * Serializable �Ǳ���ʵ�ֵ�,ֻ��ʵ��������ӿڲſ��Ա����л�
 * �Զ���
 * Scanner input = new Scnner(System.in)

 * NIO (new IO)��
 * Java4NIO  Java7NIO.2
 * Buffer ������ ByteBuffer �ֽڻ���
 * Channel �ܵ�
 * Netty ͨ�ſ��RPC --> NIOʵ��
 * Spark���м�����(�����ڴ�) �ڲ�ͨ�Ż���ʹ�þ���Netty�� AKka
 * Paths  , Files ������  ��File�����ǿ�汾
 * Paths�� ����ֱ��ʹ����  copyFile(XXX,ʹ��ʲô����,ʹ��ʲô��д)
 * 
 * 
 * TCP/IP ��  UDP ������
 * �߳�(�����) Thread Runnable
 * ��α�֤�ڶ��̲߳������ʵ�ǰ���±�֤���ݰ�ȫ
 * ��һ��ģ�� �� �����ߺ�������  Kafka
 * 
 * ����,������һ�� -->private(��߰�ȫȨ����)
 * ��̬����ģʽ
 * 
 * EE --> HTML CSS JS JSP ... MySQL ��� --> �ֲ�ʽ����
 * ������ --> MySQL(Hive) --> Hadoop���  �� Spark���
 *   
 * 
 * 
 * 
 */
public class IOStream{

}
