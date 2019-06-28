package com;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Employeedemo 
{
	public static void main(String[] args) throws Exception {
		String list ="input.csv";
		List<Employee> readList = readCsv(list);
		List<Employee> Sort =SortArr(readList);
	}
		public static List<Employee> readCsv(String list) {
			List<Employee> list1 = new ArrayList<>(); 
			Path Pathtofile = Paths.get(list);
			try {
				//BufferedReader br = Files.newBufferedReader(Pathtofile, StandardCharsets.US_ASCII);
				BufferedReader br = new BufferedReader(new FileReader(list));
				String line = br.readLine();
				while(line != null) {
					String[] a = line.split(",");
					Employee l = new Employee(a[0],a[1],a[2],a[3],a[4],a[5],a[6],a[7],a[8],a[9],a[10],a[11]);
					list1.add(l);
					line = br.readLine();
					String newStr = br.replace(/,/g, '-');

					console.log( newStr ); 
				}
				br.close();	
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return list1;
		}
		
}
