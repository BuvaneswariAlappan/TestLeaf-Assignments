package week1.day2;

public class ProgrsmForPrimeOrNot {
	 void checkPrime(int num){  
		  int i,remainder=0,flag=0;      
		  remainder=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
		   for(i=2;i<=remainder;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number"); }  
		  } 
		}  
		 public static void main(String args[]){    
			 ProgrsmForPrimeOrNot pnObj = new ProgrsmForPrimeOrNot();
			 pnObj.checkPrime(100);  
			 pnObj.checkPrime(19);  
			 pnObj.checkPrime(530);  
			 pnObj.checkPrime(13);  
			 pnObj.checkPrime(0);  
		}    

}
