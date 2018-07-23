package sample;
import java.util.Scanner;

public class oddTriangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter no. of rows");
		int row=sc.nextInt();
		int i,j,k,l;
	    for(i=1;i<=row;i++){
		j = (2*i)-1;
		k=j;
			for(l=0;l<row-i;l++){
				System.out.print("  ");
			}
			while(k!=0)
			{
				System.out.print(j+" ");
				k--;
 			}
			System.out.println("\n");
		
	}
	    sc.close();
		}
	}


