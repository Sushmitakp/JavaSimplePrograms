  public class DuplicateCharacters
  {
	  
	public static void main(String[] args) {
	  String s="Great responsibility";
	  int count=0;
	  
	  char ch[]=s.toCharArray();
	  for(int i=0;i<ch.length;i++)
	  {
		  count=1;
		  for(int j=i+1;j<ch.length;j++)
		  {
			  if(ch[i]==ch[j]&& ch[i]!=' ')
			  {
				  count++;
			  
			  ch[j]='0';
		  }
		  }
	  
	   if(ch[i]!='0' && count >1)
	   {
		   System.out.println(ch[i]);
	   }
	    
	  }
	}
	}
	
	
	
   	



