
public class TC02_JavaVAriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// To Store Single value
		int myNum =5;
		String website ="http://rahulshettyacademy.com";
		char letter ='c';
		double dec =2.99;
		boolean flag =true;
		
     System.out.println(myNum + "this is integer value.");	
     System.out.println(website);
     
  // To store multiple value by using array
     int [] arr =new int[3];
     arr[0] =1;
     arr[1] =5;
     arr[2] =8;
   
     
     int[] arr2 = {1,2,3};
     System.out.println(arr2[2]);
     
   //For Loop
 	for (int i=0 ; i<arr.length; i++)
 	{
 	System.out.println(arr[i]);

 }
     
// 	101540640612
 	  
    //For Loop
  	for (int i=0 ; i<arr.length; i++)
  	{
  	System.out.println(arr2[i]);

  }
  	
  	String[] name= {"shetty", "selenium", "Ruhi","work"};
  	
  	for (String s: name)
  	{
  		System.out.println(s);
  	}
	}
	
}
