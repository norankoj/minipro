package com.javaex.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sw {

	public static void main(String[] args) throws IOException {

		boolean run = true;
		Scanner sc = new Scanner (System.in);
		List<Address> list = new ArrayList<Address>();
		Reader fr =new FileReader("phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		 
		 while(run) {
			 System.out.println(" ");
			 System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			 System.out.println("----------------------------------");
			 System.out.print(">메뉴번호: ");
			 int code= sc.nextInt();
			
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
			 
		 switch(code) {
		 case 1:
		 System.out.println("<1.리스트>");
			
			
			for(int i=0;i<list.size();i++) {
				System.out.print(i+1+"."+" ");
				System.out.println(list.get(i));
			}
			
             br.close();
		 break;
		 
		 case 2:
			 System.out.println("<2.등록>");
				Address a2 = new Address();
				
				Writer fw = new FileWriter("PhoneDB.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				 System.out.print(">이름: ");
				 sc.nextLine();
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
			 System.out.println("[등록되었습니다.]");
			 break;
			 
		 case 3:
			 Writer fw = new FileWriter("PhoneDB.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
		 System.out.println("<3.삭제>");
		 System.out.print(">번호 :");
			int num =sc.nextInt();
			 list.remove((num-1));
			 for(int i=0;i<list.size();i++) {
				
					bw.write(list.get(i).getName()+",");
					bw.write(list.get(i).getName()+",");
					bw.write(list.get(i).getName()+",");
				}
		 break;
		 
		 case 4:
			 System.out.println("<4.검색>");
			 break;
			 
		 case 5:
			 System.out.println("<5.종료>");
			 run=false;
			 break;
			 
		 default:
			 System.out.println("[다시 입력해 주세요.]");
			 break;
		 
		 }
		 }
		 sc.close();
	}

}
