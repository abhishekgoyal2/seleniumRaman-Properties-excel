package testcase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestfileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file =new File("D:\\udemy prac\\raman_read.txt");
		file.createNewFile();
		/*
		FileWriter fw= new FileWriter("D:\\udemy prac\\raman_read.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("Please write inside this file");
		bw.newLine();
		bw.write("this is second line");
		bw.append(" " + "i");
		bw.flush();
		*/
		
		FileReader fr =new FileReader("D:\\udemy prac\\raman_read.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String i ="";
//		System.out.println(br.readLine());
//
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		while ((i=br.readLine())!=null)
		{
			System.out.println(i);
		}
	}

}
