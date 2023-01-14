import java.util.*;
public class RepeatedWordsCount {
   
    
	
	public static void main(String[] args) {
      String s = "I am learning learning java java java programming";
      HashMap<String,Integer> map = new HashMap<>();
      Integer count=1;
      String arr[]=s.split(" ");
      for(int i=0;i<arr.length;i++)
      {
    	  if(map.containsKey(arr[i]))
    	  {
    		  map.put(arr[i], map.get(arr[i])+1);
    	  }
    	  else {
    		  map.put(arr[i],1);
    	  }
      
    }
     for(String s1:map.keySet())
     {
    	 System.out.println("The count of words"+s1+"="+map.get(s1));
     }
      
      
}
}
