package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		int input=153;
		int calculated=0, remain=0, original=0;
		original=input;
		while(input>0)
		{
			remain=input%10;
			calculated=calculated+(remain*remain*remain);
			input=input/10;

		}
		System.out.println(calculated);
		if(original==calculated)
		{
			System.out.println("It is armstrong number");
		}
		else 
			System.out.println("not an Armstrong number");

	}

}
