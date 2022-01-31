package hashingCode;

public class Multhithread {
	public static void main(String[] args) {
	int n = 8;
	for(int i=0; i<n ;i++) {
		
		MulthiThreadingDemo object = new MulthiThreadingDemo();
		object.start();
	}
}

	

}
