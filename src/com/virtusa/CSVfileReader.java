package com.virtusa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVfileReader {

	static int count =0;
	public static void main(String[] args) {
		BufferedReader br;
		String st="";
		List l  = new ArrayList();
		try {
			 br =new BufferedReader(new FileReader("C:\\test1\\TestProject\\src\\Csvfile.csv"));
			 System.out.println("hi");
			try {
				while(br.readLine()!=null && !br.readLine().isEmpty()){
				 st = br.readLine();
				l= splitString(st,l);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println(l.size());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List splitString(String st,List l){
		
		int s =0;
		int e =0;
		count++;
		System.out.println("insdie split method"+count);
		
		for(int i = st.indexOf(",");i!=-1; i=st.indexOf(",")+1){
			e = i;
		   l.add(st.substring(s, e));	
	        s = i;
		}
		return l;
	}
}
