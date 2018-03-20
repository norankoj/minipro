package com.javaex.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java.util.ArrayList;
import java.util.List;


public class ListA {

	public void list() throws IOException{
		
		List<Address>list = new ArrayList<Address>();
		Reader fr =new FileReader("phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str="";
		while (true) {
			str = br.readLine();
			if(str==null) { 
				break;
			}
			String[]s=str.split(",");
			Address a1 = new Address(s[0],s[1],s[2]);
			list.add(a1);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.print(i+1+"."+" ");
			System.out.println(list.get(i));
		}
		


	}

}
