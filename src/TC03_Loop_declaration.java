
public class TC03_Loop_declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr2 = {1,2,5,8,122,55,88};
  for (int i=0; i<arr2.length; i++)
  {
	  if (arr2[i] % 2==0)
	  {
	System.out.println(arr2[i]);	
	break;
  }
		
	
  else {
	  System.out.println(arr2[i] + "not equal to data");
	  
	  
  }
  }
}}
