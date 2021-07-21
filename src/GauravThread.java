import java.util.Scanner;

public class GauravThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println( ThreadColor.ANSI_GREEN + "\n i am in gaurav thread");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter an amount");
		double amount=sc.nextDouble();
		System.out.println("\n enter an balance amount for withdrawl");
		double balance=sc.nextDouble();
		double withdrawl=amount-balance;
		System.out.println("the withdrawal amount is" + withdrawl);
	
	}

}
