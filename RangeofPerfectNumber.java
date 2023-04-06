import java.util.Scanner;
class RangeofPerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int start = sc.nextInt();

		System.out.print("Enter ending number : ");
		int end = sc.nextInt();

		for(int i=start; i<=end; i++)
		{
			if(checkPerfectNo(i))
			{
				System.out.print(i + " ");
			}
		}
	}

	public static boolean checkPerfectNo(int num)
	{
		int sum = 0;

		for(int i=1; i<num; i++)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}

		if(sum == num)
		{
			return true;
		}
		return false;
	}
}
