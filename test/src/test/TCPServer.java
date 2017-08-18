package test;
import java.io.DataInputStream;
import java.net.*;


public class TCPServer {
	
		public static void main(String[] args) throws Exception {
			
			ServerSocket ss = new ServerSocket(8888);
			while(true){
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
			}
	}
}
