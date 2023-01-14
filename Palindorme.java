
public class Palindorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="abba";
      String c="";
      int length=s.length();
      for(int i=length-1;i>=0;i--)
      {
    	  c=c+s.charAt(i);
    	  
      }
      if(s.equals(c))
      {
    	  System.out.println(s+" "+ "Its a palindrome");
      }
      else
      {
    	  System.out.println(s+" " +"Not a palindorme");
      }
      
	}

}
