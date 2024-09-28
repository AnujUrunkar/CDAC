// Question 1.
import java.util.List ;
import java.util.ArrayList ;
import java.util.LinkedHashMap ;
public class Question{

	public static boolean armStrong(int num){
	
		int length = String.valueOf(num).length();
		int result = helperArmStrong(num , length);
		if(num == result) return true ;
		
		return false ;

		
	}
	
	public static int helperArmStrong(int num , int power){
	
		if(num == 0){
			return 0 ;
		}
		
		int rem = (int)Math.pow(num % 10 , power) + helperArmStrong(num/10 , power);
		return rem ;
		
	}
	
	public static boolean primeNum(int num){
			
		if(num <= 0 ){
			return false ;
		}
		
		if(num == 1){
			return true ;
		}
		
		boolean res = helperprimeNum(num , 2);
		return res ;
	} 
	
	public static boolean helperprimeNum(int num , int i){
		
		if(i == num-1){
			
			return (num % i != 0) ;
		}
		
		boolean ans = (num % i != 0) && helperprimeNum(num , ++i); 
		return ans ;
		
	}
	
	public static int factorial(int num){
		
		if(num == 0){
			return 1 ;
		}
		return num * factorial(num-1);
		
	}
	
	public static List<Integer> fibonicaSeries(int num){
		
		List<Integer> fibSeries = new ArrayList<>();
		for(int i = 0 ; i < num ; i++){
			
			fibSeries.add(fibonica(i));
		}
		
		return fibSeries ;
		
	}
	
	public static int fibonica(int num){
		
		if(num < 2){
			return num;
		}	
		
		return fibonica(num-1) + fibonica(num-2);
	}
	
	// brute force method to calculate gcd of two numbers
	
	public static int gcdB(int num1, int num2){
			
		int small = num1 < num2 ? num1 : num2 ;
		
		for(int i = small ; i > 0 ; i--){
			
			if(num1 % i == 0 && num2 % i == 0){
				return i;
			}
		}
		
		return -1 ;
		
		
	}
	
	public static int gcdR(int a , int b){
		
		if( b == 0){
			return a ;
		}
		
		return gcdR(b , a % b);
		
	}
	
	public static int sqroot(int num){
		
		return (int)Math.sqrt(num);
	}
	
	// sdnkjnsd
	
	public static int sqRootBS(int num){
		
		int sq = helperSqRoot(num , 1 , num);
		
		if(Math.pow(sq , 2) <= num ){
			return sq ;
		}
		
		return sq-1;
		
	}
	
	public static int helperSqRoot(int target , int s , int e){
		
		if(s==e){
			return s;
		}
		
		int mid = (s + e)/2 ;
		
		if((int)Math.pow(mid , 2) == target){
			return mid ;
		}
		if((int)Math.pow(mid , 2) > target ){
			return helperSqRoot(target , 1 , mid-1 );
		}else{
			return helperSqRoot(target , mid+1 , e);
		}
		
		
	}
	
	public static List<Character> repeatedChar(String str){
		
		int arr[] = new int[26];
		List<Character> list = new ArrayList<>();
		String lower = str.toLowerCase() ;
		
		for(int i = 0 ; i < str.length() ; i++){
				
			
			char c= lower.charAt(i);
			int asci = c - 'a' ;
			arr[asci] = arr[asci] + 1 ; 
			//char[i];
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			
			if(arr[i] > 1){
				int c = 97 + i ;
				list.add((char)c);
			}
		}
		
		return list ;
	}
	
	//    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	
	public static Character firstNonrepeatedChar(String str){
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0 ; i < str.length() ; i++ ){
			
			Character c = str.charAt(i) ;
			if(map.get(c) != null){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
			
		}
		
		for(Character c : map.keySet()){
			
			if(map.get(c) == 1 ){
				return c ;
			}
		}
		
		return null ;
		
		
	}
	
	
	// Pallindrome of numbers using recurssion
	
	public static boolean isPallindrome(int num){
		
		int count = lengthNumber(num);
		
		int res = helperIsPallindrome(count , num);
		if(res == num) return true;
		
		return false;
		//System.out.println(count);
	}
	
	public static int lengthNumber(int num){
		
		int length = 0 ;
		int sampleNum = num ;
		while(sampleNum != 0){
			sampleNum = sampleNum / 10 ;
			length++;
		}
		return length ;
	}
	
	public static int helperIsPallindrome(int count , int num){
		
		if(num == 0){
			return 0 ;
		}
		return ((num % 10)*(int)Math.pow(10, count-1)) + helperIsPallindrome(count-1 , num / 10);
		
	}
	
	
	// Leap year
	
	
	public static boolean leap(int num){
		
		if(num % 4 == 0 ){
			
			if(num % 100 == 0){
				
				return num % 400 == 0 ;
				
			}else{
				
				return true;
			}
			
		}else{
			
			return false ;
		}
	}
	


	public static void main(String args[]){
	
		//boolean ans = armStrong(153) ;
		//System.out.println(ans);
		//boolean ans2 = primeNum(100001);
		//System.out.println(ans2);
		//int factorial = factorial(0);
		//System.out.println(factorial);
		
		//List<Integer> fibonicaSeries = fibonicaSeries(5);
		//System.out.println(fibonicaSeries);
		//int gcd = gcdB(17, 13);
		//System.out.println(gcd);
		//int gcdR = gcdR(24, 54);
		//System.out.println(gcdR);
		//int sqroot = sqRootBS(10000000);
		//System.out.println(sqroot);
		
		//List<Character> ans = repeatedChar("programming");
		//System.out.println(ans);
		//Character c = firstNonrepeatedChar("aabbcc");
		//System.out.println(c);
		
		//boolean ans = isPallindrome(12213);
		//System.out.println(ans);
		boolean ans =  leap(1900);
		System.out.println(ans);

		

	}
}