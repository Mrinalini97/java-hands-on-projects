package sample;
import java.util.Scanner;
public class wordDuplicate {
	
	public static void main(String[] str){
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int wrc =1;
		String arr[]  = s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i].equals(arr[j]))
				{
					wrc++;
					arr[j] = "0";
				}
			}
			if(arr[i]!="0")
				System.out.println(arr[i]+" has occured "+ wrc + " times.");
				wrc =1;
			
		}
	}

}
