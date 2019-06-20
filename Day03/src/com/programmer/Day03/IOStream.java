package com.programmer.Day03;

import java.io.Serializable;

//IO流
/*
 * 四大父类流
 * 字节输入输出流
 * InputStream  OutputStream
 * 字符输入输出流
 * Reader  Writer
 * 
 * 需要明确使用的是什么流? 字节还是字符
 * 若使用的是字节流 --> 流中的数据是字节,就会使用byte类型的数组
 * 若使用的是字符流 --> 流中的数据是字符,就会使用char类型的数组
 * 读数据 --> read    写数据 --> write
 * 流需要进行关闭 close  写数据的时候为了加块流的流速  flush
 * 
 * 操作的文件的流
 * 字节  FileInputStream和FileOutputStream
 * 字符 FileReader 和 FileWriter
 * 是当前四大父类流的子类
 * 
 * 流中最好用就是字节流,因为字节流可以读取任何数据,字节流存在一个弊端
 * ,字节流读取文件(文本文件)的时候,若文件中存在汉字,会出现乱码问题
 * Java中常用的字符串编码 GBK,UTF-8, ISO-8859-1(西文)
 * 
 * 你  --> 使用字节流读取汉字(1次1个字节) 好一点会出现乱码,最坏的结果就是?
 * 
 * 转换流(可以指定文件的编码集)  这两个转换流的父类是Reader和Writer
 * 字节转字符
 * InputStreamReader
 * 字符转字节
 * OutputSteamWriter
 * 
 * 为了加快流的读取和写入速度
 * 缓冲流
 * 字节 读取数据时默认缓冲区大小是 8192 --> 4096
 * BufferedInputStream 和 BufferedOutputStream
 * 字符
 * BufferedReader 和 BufferedWriter
 * 提供了两个新方法  
 * 读取数据的时候可以使用readLine  一次读取一行(返回值是字符串)
 * 它不读取换行符号
 * 写出数据的时候 newLine-->书写换行符
 * 
 * 对象流
 * ObjectInputStream 反序列化
 * ObjectOutputStream 序列化
 * 将数据写成二进制文件,方便在网络或本地进行传输使用
 * readObject() 读取数据  writerObject() 写数据 
 * TCP网络-->使用流使用一定是字节流
 * Serializable 是必须实现的,只有实现了这个接口才可以被序列化
 * 自定类
 * Scanner input = new Scnner(System.in)

 * NIO (new IO)流
 * Java4NIO  Java7NIO.2
 * Buffer 缓冲区 ByteBuffer 字节缓冲
 * Channel 管道
 * Netty 通信框架RPC --> NIO实现
 * Spark并行计算框架(基于内存) 内部通信机制使用就是Netty和 AKka
 * Paths  , Files 工具类  是File类的增强版本
 * Paths类 可以直接使用流  copyFile(XXX,使用什么流读,使用什么流写)
 * 
 * 
 * TCP/IP 和  UDP 网络编程
 * 线程(必须的) Thread Runnable
 * 如何保证在多线程并发访问的前提下保证数据安全
 * 会一个模型 即 生产者和消费者  Kafka
 * 
 * 反射,反射破一切 -->private(最高安全权限了)
 * 动态代理模式
 * 
 * EE --> HTML CSS JS JSP ... MySQL 框架 --> 分布式开发
 * 大数据 --> MySQL(Hive) --> Hadoop框架  和 Spark框架
 *   
 * 
 * 
 * 
 */
public class IOStream{

}
