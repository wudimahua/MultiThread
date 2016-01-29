package jd.com;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.start();
		for(int i = 0; i < 60; ++i){
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

}
class Demo extends Thread{
	public void run() {
		for(int i = 0; i < 60; ++i){
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}