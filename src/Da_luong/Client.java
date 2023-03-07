package Da_luong;

public class Client {
public static void main(String[] args) {
	shareData shareData = new shareData();
	Thread1 t1 = new Thread1(shareData);
	Thread2 t2 = new Thread2(shareData);
	t2.start();
	t1.start();
}
}
