import java.util.Scanner;

public class JavaPrograms {
	
	//sum of numbers from 1 to 5
	void sumOfFirstFiveNumbers(){
		
		int count =0;
		for(int i =1;i<=5;i++){
			
			count=count+i;
			
		}
		System.out.println("Sum of first 5 numbers: "+count);
	}
	
	//sum of 5 numbers entered through keyboard
	void SumOfGivenFiveNumbers(){
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int length = scanner.nextInt();	
		//System.out.println(length);
		
		int arr[] = new int[5];
		System.out.println("Enter any 5 numbers: ");

		for(int i = 0;i<length;i++){
			
			arr[i] = scanner.nextInt();
			//System.out.println(arr[i]);
			count=count+arr[i];
		}
	
		System.out.println("Sum of given 5 numbers: "+count);
		
		
	}	
	
	//factorial of a number 
	void factorial(int num){
		
		int count = 1;
		
		for(int i=num;i>0;i--){
			
			count = count*i;
		}
		System.out.println("Factorial of "+num+" is: "+count);
	}
	
	//smallest and largest number between 5 numbers entered
	void smallestAndBiggestNumber(){
		 
		 int arr[] = {100,1,7,9,75}; 
		 
		 for(int i=0;i<arr.length;i++){
			 int count = 0;
			 for(int j=0;j<arr.length;j++){
				 
				 if(arr[i]<=arr[j]){
					 //System.out.println(arr[i]+","+arr[j]);
					 count=count+1;
					 if(count==5){
						 System.out.println("Smallest Number is: "+arr[i]);
					 }
				 }
				 else{
					 break;
				 }
			 }
		 }
		 int max = arr[0];
		 for(int i=1;i<5;i++){
			 
			 if(arr[i]>max){
				 
				 max=arr[i];
			 }
		 }
		 System.out.println("Biggest Number is: "+max);
	}
	
	//print all even numbers in a range 1 to 10
	void printEvenNumbers(int num){
		
		for(int i=1;i<=num;i++){
			
			if(i%2==0){
				
				System.out.println(i+" is even number");
			}
		}
	}
	
	//print all odd number in a lower and upper range entered 
	void printOddNumbers(int lowerRange, int upperRange){
		
		for(int i=lowerRange;i<=upperRange;i++){
			
			if(i%2!=0){
				System.out.println(i+ " is Odd Number");
			}
		}
	}
	
	//check whether a number is Prime or not
	void checkPrimeNumber(int num){
		int flag=0;
		int factors=num/2;
		if(num==0 || num==1){
			System.out.println(num+" is not a Prime Number");
		}else{
		for(int i=2;i<=factors;i++){
			if(num%i==0){
				flag=flag+1;
				System.out.println(num+" is not a Prime Number");
				break;
			}
			
			}
		if(flag==0){
			System.out.println(num+" is a Prime Number");
		}
		}
	}
	
	//print all prime numbers in a range 11 to 30
	void checkPrimeNumbersInRange(int lowerValue, int upperValue){
			
		
		for(int j=lowerValue;j<=upperValue;j++){
			int factors=j/2;
			int flag=0;	
		for(int i=2;i<=factors;i++){
			if(j%i==0){
				flag=flag+1;
				//System.out.println(j+" is not a Prime Number");
				break;
			}
			
			}
		if(flag==0){
			System.out.println(j+" is a Prime Number");
		}
		}
		}
	
	//print all prime numbers in a range 11 to 30
	void reverseNumber(int num){
		int reverse = 0;
		
		while(num>0){
		int i = num%10;
		
		reverse = reverse * 10;
        reverse = reverse + i;
		num = num/10;
		
		}
		
		System.out.println(reverse);
		
	}
	
	//print sum of all digits in a number 
	void sumOfDigitsInNum(int num){
		 int sum=0;
		 while(num>0){
			 
			 int i=num%10;
			 sum = sum+i;
			 num=num/10;
		 }
		 System.out.println("Sum of digits in number is: "+sum);
	}
	
	//check the number is perfect or not
	void perfectNum(int num){
		
		int factors = num/2;
		int sum=0;
		
		for(int i=1;i<=factors;i++){
			
			if(num%i==0){
				
				sum=sum+i;
			}
		}
		if (sum==num){
			
			System.out.println(num+" is a Perfect Number");
		}else{
			System.out.println(num+" is not a Perfect Number");
		}
	}
	
	//program to find whether a number is strong or not
	void strongNum(int num){
		int sum=0;
		int fact;
		int temp=num;
		while(temp>0){
			
			fact=1;
			int digit = temp%10;
			for(int i=digit;i>0;i--){
				
				fact= fact*i;
			}
			
			sum=sum+fact;
			temp=temp/10;
		}
		
		if(num==sum){
			
			System.out.println(num+" is Strong Number");
		}else{
			System.out.println(num+" is not a Strong Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaPrograms javaProg = new JavaPrograms();
		
		
	}

}
