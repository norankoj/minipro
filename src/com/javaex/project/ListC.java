package com.javaex.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListC {
	public void remove() throws IOException {
	List<Address>list = new ArrayList<Address>();
	Address a3 = new Address();
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
	
	Scanner sc = new Scanner (System.in);
	System.out.print(">번호 :");
	int num = Integer.valueOf(sc.nextLine());	
	 list.remove(num-1);
	sc.close();
	br.close();
	}
}
