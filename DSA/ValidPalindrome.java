import java.util.*;
public class ValidPalindrome{
	

		public  void main(String args []){
			
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
            int count=0;
            

            for(int i=2; i<=n; i++){
                if(n%i==0){
                    count++;
                    break;
                }
            } 
            if(count==1){
                System.out.println("prime number");
            }  else{

                System.out.println("not a prime number");
            }
           

					
			




		}

        
	}