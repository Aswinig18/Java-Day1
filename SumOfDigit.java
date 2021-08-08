package week1.day1;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345;
		int sum = 0,remain=0; 
		while(num>0)
		{
            remain=num%10;
            sum=sum+remain;
            num=num/10;
			
		   	}
		
		System.out.println(sum);
	}

}
