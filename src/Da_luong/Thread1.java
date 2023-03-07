package Da_luong;

public class Thread1 extends Thread {
	shareData shareData;

	public Thread1(shareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		for (int i = 0; i < shareData.userList.length; i++) {
			System.out.println("User name: " + shareData.userList[i]);
		synchronized (shareData) {
			shareData.notifyAll();
			if (i < shareData.userList.length - 1) {
				try {
					shareData.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
}
