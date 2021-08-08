package week1.day1;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=5;int fnum=0; int snum=1;
		int i; int sum = 0;
		System.out.println("fibonacci number is" + range);
		System.out.println(fnum);
		System.out.println(snum);
		for(i=2;i<range;i++)
		{
			sum=fnum+snum;
			System.out.println(sum);
			fnum=snum;
			snum=sum;
			
		}

	}

}
