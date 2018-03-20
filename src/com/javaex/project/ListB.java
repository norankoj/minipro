package com.javaex.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListB {

	public void plus() throws IOException{
		
		List<Address>list = new ArrayList<Address>();
		Scanner sc =new Scanner (System.in);
		Address a2 = new Address();
		
		Writer fw = new FileWriter("PhoneDB.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		 System.out.print(">이름: ");
		 String n = sc.nextLine();
		 a2.setName(n);
		 bw.write(n+",");
	     System.out.print(">전화번호:");
	     String p = sc.nextLine();
	     a2.setPh(p);
	     bw.write(p+",");
		 System.out.print(">회사:");
         String c = sc.nextLine();
         a2.setCompany(c);
         bw.write(c);
		 list.add(a2);
		 for(Address a : list) {
				System.out.println(a);
			
			}
	
		bw.newLine();
		
		bw.close();
		
		
		

			
		
	}

}
