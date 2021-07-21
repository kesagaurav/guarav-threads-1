

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( ThreadColor.ANSI_PURPLE+"\n hi hello from main thread");
		Thread anthorThread=new AnthorThread();
		anthorThread.setName("=== gaurav thread =====");
		anthorThread.start(); // this is an runnable state
		Thread t=new GauravThread();
		t.start();
		Thread myr=new Thread(new MyRunnable());
		myr.start();// where myr belongs to the myRunnable which implements the runnable class
		CountDown t2=new CountDown();
		CountDownThread t3=new CountDownThread(t2);
		t3.setName("Thread 1");
		CountDown t4=new CountDown();
		CountDownThread t5=new CountDownThread(t4);
		t3.setName("Thread 1");
		t5.setName("Thread 2");
		Gaurav2 t6=new Gaurav2();
		t6.setFname("surya1");
		t6.setMname("deepa");
		t6.setName("gaurav");
		G3 t7=new G3(t6);
		System.out.println(t6);
		t7.start();
		t3.start();
		t5.start();
		
		// this is for mother_thread
		Mother m=new Mother();
		m.setName("deepa");
		m.setColor("white");
		m.setDesingation("housewife");
		m.setWeight(100);
		System.out.println(m);
		MotherThread m1=new MotherThread(m);
		m1.start();
		
		
		// this is for the father thread
		Father f=new Father();
		f.setName("surya_prakaash");
		f.setBusinness("ifb point warangal");
		f.setAmount(100000);
		f.setG1(t6);
		f.setM(m);
		System.out.println(f);
		FatherThread f1=new FatherThread(f);
		f1.start();
		
		

		
	}

}


class CountDown {
	public void doCountDown() {
		String color;
		switch(Thread.currentThread().getName()) {
		case  "Thread 1":
			color=ThreadColor.ANSI_BLUE;
			break;
		case "Thread 2":
		color=ThreadColor.ANSI_PURPLE;
			break;
			default:
				color=ThreadColor.ANSI_GREEN;
		}
		for(int i=10;i>0;i--) {
			System.out.println(color + Thread.currentThread().getName() + ":i =" + i);
		}
	}
}

 class CountDownThread extends Thread{
	private CountDown thread;
	public CountDownThread(CountDown countdown) {
		this.thread = countdown;
	}
	
	public void run() {
		thread.doCountDown();
	}
}