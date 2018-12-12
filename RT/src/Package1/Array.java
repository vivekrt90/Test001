package Package1;
import java.util.Scanner;
public class Array {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Array size");
		int a=input.nextInt();
		int [] arr= new int[a];
		System.out.println("Enter Array values");
		for(int i=0; i<a; i++)
		{arr[i]=input.nextInt();
		}
		System.out.println("Enter reversed array");
        for(int i=(arr.length-1); i>=0; --i){

            System.out.print(arr[i]+ " ");
        }
	}
}

