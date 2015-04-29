package com.test.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPBIOServer {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(1190);
			Socket sk = null;
			while((sk=ss.accept())!=null)
			{
				sk.getOutputStream().write("hello from server \n".getBytes("utf-8"));
				
				sk.getOutputStream().flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
