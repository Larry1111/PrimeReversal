import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAndBinary {
	private static Long count = (long) 0;
	private static Long binary;
	private static ArrayList<Integer> listY = new ArrayList<Integer>();
	private static ArrayList<Long> listX = new ArrayList<Long>();
	public static Long reverseConvertBinary(int num)
	{
	    String binary = "";
	    while(num > 0){
	    	binary += num%6;//base
	    	num = num/6;//base
	    }
	    return Long.parseLong(binary);
	}
	
	public static int convertToDecimal(Long num)
	{
		 int decimal = 0;  
		 int n = 0;  
		 while(true){  
			 if(num == 0)
			 {  
		     break;  
		     } 
			 else
			 {  
		          Long temp = num%10;  
		          decimal += temp*Math.pow(6, n);//base  
		          num = num/10;  
		          n++;  
		     }  
		  }  
		  return decimal;  
	}  
	public static void checkPrime(int n)
	{
		int i,m=0,flag=0;      
		m=n/2;       
		for(i=2;i<=m;i++)
		{      
		   if(n%i==0)
		   {      
			   flag = 1;
//			   count++;
//			   listX.add(count);
//			   binary = reverseConvertBinary(n);
//			   listY.add(n-convertToDecimal(binary));
			   break;      
		   }
		}
		if(flag == 0)
		{
			count++;
			listX.add(count);
			binary = reverseConvertBinary(n);
			listY.add(n-convertToDecimal(binary)); 
		}
		         
	}
	public static void main(String args[])
	{
		for(int i=2; i<30000; i++)
		{
			checkPrime(i);
		}
		System.out.println(Arrays.toString(listX.toArray()));
		System.out.println(Arrays.toString(listY.toArray()));
	}
}
