package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.*;

import javax.net.ssl.HttpsURLConnection;

public class test1 {

		public static void main(String[] args) throws Exception{
			/*
			 * if else ���̿���ֻѡ��
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
				evaluate ="�ɼ����Ϸ���";
			}else if(score<60){
				evaluate ="�ɼ����ϸ񣬼���Ŭ��!";
			}else if(score >=65 && score <85){
				evaluate ="�ɼ�����������һ��¥!";
			}else if(score>90 && score<=100){
				evaluate ="����Ǵ�˵�е�ѧ��!";
			}
			System.out.println("�ɼ�Ϊ:"+score+"����Ϊ:"+evaluate);
			*/
			URL url = new URL("https://www.baidu.com");
			HttpsURLConnection conn =(HttpsURLConnection)url.openConnection();
			/*��ȡurlʱ��
			long date =conn.getDate();
			if(date ==0){
				System.out.println("�޷���ȡ��Ϣ");
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
			System.out.println("Э��:"+url.getProtocol());
			System.out.println("�ļ���:"+url.getFile());
			System.out.println("����:"+url.getHost());
			System.out.println("·��:"+url.getPath());
			System.out.println("�˿ں�:"+url.getPort());
			System.out.println("Ĭ�϶˿ں�:"+url.getDefaultPort());
		}
		
}
