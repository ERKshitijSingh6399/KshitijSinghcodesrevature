package mycode;
/*
 * wait tells the calling thread to give up the monitor and go to sleep until some
 * other thread enters the same monitor and calls notify or notifyall
 * 
 * notify wakes up a thread that called wait on the same object
 * 
 * notifyall wakes up all the threads that called wait on the same object. one of the thread will be granted access
 * */
class Resource {
	int n;
	boolean valueset=false;
	synchronized int get() {
		while(!valueset)
		{
			try {wait();
			}catch(InterruptedException e)
				{System.out.println("Interrupted Exception caught");}
		}
		System.out.println("Got: "+n);
		valueset=false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while(valueset)
		{
			try {wait();
			}catch(InterruptedException e)
				{System.out.println("Interrupted Exception caught");}
		}
		this.n=n;
		valueset=true;
		System.out.println("Put: "+n);
		notify();
	}
}//end of class q

class Producer implements Runnable{
	Resource r;
	Producer(Resource r)
	{
		this.r=r;
		new Thread(this, "Producer").start();
	}
	public void run() {
		int i=0;
		while(i<10) {r.put(i++);}
	}
}//end of producer
	
class Consumer implements Runnable{
	Resource r;
	Consumer(Resource r)
	{
		this.r=r;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		while(true) {r.get();}
	}
}//end of consumer

public class ProducerConsumerWaitNotify {

public static void main(String[] args) {
	Resource r = new Resource();
	new Producer(r);
	new Consumer(r);
}//end of main

}//end of public class
