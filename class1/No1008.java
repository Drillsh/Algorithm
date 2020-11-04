package class1;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;

import java.util.Scanner;

public class No1008 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print((double)num1/num2);
		
		sc.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		double num1 = Double.parseDouble(br.readLine());
//		double num2 = Double.parseDouble(br.readLine());
//		
//		bw.write(String.valueOf(num1/num2));
//		bw.flush();
//		bw.close();
//		
	}
}
