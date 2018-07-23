package sample;

public class copy{
	

		public static void main(String[] args)
		{
			String input="goobe is not a goobe"; 		//Input String
			char ch[] = input.toCharArray();
			
			int wrc=1,i;							//Variable for getting Repeated word count
			
			for(i=0;i<ch.length;i++)		//Outer loop for Comparison		
			{
				if(ch[i]!='0'){
				for(int j=i+1;j<ch.length;j++)	//Inner loop for Comparison
				{
					
				if(ch[i]==(ch[j]))	//Checking for both strings are equal
					{
						wrc=wrc+1;				//if equal increment the count
						ch[j]='0';			//Replace repeated words by zero
					}
				}
				
				System.out.println(ch[i]+"--"+wrc);	//Printing the word along with count
				wrc=1;
				
		     }
			}
				
		}

	}



