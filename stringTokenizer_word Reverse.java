package sample;

import java.util.StringTokenizer;
import java.util.Scanner;

class Token{
	
	static void createToken(String str){
		StringTokenizer st = new StringTokenizer(str," ");
		
		while(st.hasMoreTokens()){
			//int size =  st.nextToken().length();
			int i;
			//System.out.println(st);
			char ch[] = st.nextToken().toCharArray();
						int size = ch.length;
			for(i=size-1;i>=0;i--){
				System.out.print(ch[i]);
			}
			System.out.print(" ");
			
		}
	}
	
}
public class stringTokenizer {
	public static void main(String[] str){
		Scanner in = new Scanner(System.in);
		Token t = new Token();
		System.out.println("enter string");
		String s1 = in.nextLine();
		t.createToken(s1);
		in.close();
		
	}

}
