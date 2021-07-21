
public class AnthorThread extends Thread {
	
	public void run() {
		System.out.println(ThreadColor.ANSI_BLUE + "\n i am in " + currentThread().getName());
		int a,b,c;
		a=20;
		b=20;
		c=a+b;
		System.out.println(c);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(ThreadColor.ANSI_CYAN + "gaurav thread woke me up");
		}
		
		System.out.println(ThreadColor.ANSI_RED + "one second has passed and woke me up");
		
		
	}
//anthorThread is an new class 
}
