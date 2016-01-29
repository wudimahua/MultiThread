package com.jerry.thread;

/**
 * 鍒涘缓绾跨▼鐨勪袱绉嶄紶缁熸柟寮�
 * @author JERRYWANG
 */
public class TraditionalThread {

	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
		});
		thread2.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
				}
			}
 		}.start();
 		
 		new Thread(
 			new Runnable() {
 				public void run() {
 					while(true) {
 						try {
 							Thread.sleep(500);
 						} catch (InterruptedException e) {
 							e.printStackTrace();
 						}
 						System.out.println(Thread.currentThread().getName());
 					}
 				}
 			}
 		).start();
	}
}
