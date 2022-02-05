
public class Main {
	static int ters(int n){
	int tersHali = 0; 
    int bsmk;  
    int r,sum=0,temp,toplam;
    while(n>0){  
    	bsmk = n%10;
	      tersHali = (tersHali*10) + bsmk;
	      n = n/10;
    }
		    toplam=n+tersHali;
		    temp=toplam;    
		    while(toplam>0){    
			     r=toplam%10;  
			     sum=(sum*10)+r;    
			     toplam=toplam/10;    
		    }    
		    if(temp==sum)    
		     System.out.println("palindrome sayi ");    
		    else    
		     System.out.println("palindrome sayi değil"); 
		    
    return tersHali;
  }

	public static void main(String[] args) {
		for(int i=11; i<100;i++) {
			 System.out.print(i+ " Ters hali: "+ ters(i));
			 System.out.println(" ");
			 System.out.println(" ");
			 
		} 
	}

}
