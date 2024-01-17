package chap07_3;

public  class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) { // HttpServlet servlet = new LoginServlet(),new FileDownloadServlet 
		servlet.service();
		
		
	}
}
