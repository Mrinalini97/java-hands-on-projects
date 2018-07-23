package sample;

public class floydTriangle {
	public static void main(String[] args){
		int i=1,j,k;
		for(j=1;j<=3;j++){
			for(k=1;k<=j;k++){
				System.out.print(i+" ");
				i++;
			}
			System.out.println("");
		}
	}

}
