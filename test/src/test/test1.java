package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.*;

import javax.net.ssl.HttpsURLConnection;

public class test1 {

		public static void main(String[] args) throws Exception{
			/*
			 * if else 流程控制只选择
			int a=0;
			int b=0;
			if(a>b){
				System.out.println("a>b");
			}else{
				System.out.println("a<=b");
			}
		*/
	/*		int score =65;
			String evaluate =null;
			if(score <0 || score >100){
				evaluate ="成绩不合法！";
			}else if(score<60){
				evaluate ="成绩不合格，继续努力!";
			}else if(score >=65 && score <85){
				evaluate ="成绩优良，更上一层楼!";
			}else if(score>90 && score<=100){
				evaluate ="你就是传说中的学霸!";
			}
			System.out.println("成绩为:"+score+"评价为:"+evaluate);
			*/
			URL url = new URL("https://www.baidu.com");
			HttpsURLConnection conn =(HttpsURLConnection)url.openConnection();
			/*获取url时间
			long date =conn.getDate();
			if(date ==0){
				System.out.println("无法获取信息");
			}else{
				System.out.println("Date:"+new Date(date));
			}
			*/
			Map header =conn.getHeaderFields();
			Set<String> keys = header.keySet();
			for(String key :keys){
				String value =conn.getHeaderField(key);
				System.out.println("Key:"+value);
			}
			System.out.println(conn.getLastModified());
			System.out.println("URL:"+url.toString());
			System.out.println("协议:"+url.getProtocol());
			System.out.println("文件名:"+url.getFile());
			System.out.println("主机:"+url.getHost());
			System.out.println("路径:"+url.getPath());
			System.out.println("端口号:"+url.getPort());
			System.out.println("默认端口号:"+url.getDefaultPort());
		}
		
}
