package test;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;

public class TCPClient {
	
		public static void main(String[] args) throws Exception{
			Socket s = new Socket("127.0.0.1",8888);
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("hello server");
			dos.flush();
			dos.close();
			s.close();
		}
}
