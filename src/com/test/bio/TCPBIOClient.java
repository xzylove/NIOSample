package com.test.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPBIOClient {
	
	public void testBaidu()
	{
		try {
			Socket sok = new Socket("localhost",1190);
			BufferedReader br  = new BufferedReader( new InputStreamReader(sok.getInputStream()));
			
			PrintWriter out = new PrintWriter(sok.getOutputStream(),true);
			out.println("hello");
			
			
			String temp = br.readLine();
			
		
			
			
				System.out.println(temp);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[])
	{
		
		TCPBIOClient tl = new TCPBIOClient();
		tl.testBaidu();
		
	}

}
