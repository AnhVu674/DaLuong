package Da_luong;

public class Thread2 extends Thread {
	shareData shareData;

	public Thread2(Da_luong.shareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		for (int i = 0; i < shareData.addressList.length; i++) {
			synchronized (shareData) {
				shareData.notifyAll();
			try {
				shareData.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			} 
			
			System.out.println("Address: " + shareData.addressList[i]);
			synchronized (shareData) {
				shareData.notifyAll();
			}
		}
	}

}
