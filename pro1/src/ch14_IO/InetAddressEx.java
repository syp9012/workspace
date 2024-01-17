package ch14_IO;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*네트워크
-네트워크: 여러 컴퓨터들을 통신 회선으로 연결한 것
-LAN: 가정, 회사, 건물, 특정 영역에 존재하는 컴퓨터를 연결한 것 
-WAN: LAN을 연결한 것 = 인터넷
 
*서버와 클라이언트
-서버: 서비스를 제공하는 프로그램을 
-클라이언트: 서비스를 요청하는 프로그램
-먼저 클라이언트가 서비스를 요청하고, 서버는 처리 결과를 응답으로 제공

*IP 주소
-IP 주소: 네트워크 어댑터(LAN 카드)마다 할당되는 컴퓨터의 고유한 주소
-ipconfig(윈도우), ifconfig(맥OS ) 명령어로 네트워크 어댑터에 어떤 IP 주소가 부여되어 있는지 확인
-프로그램은 DNS를 이용해서 컴퓨터의 IP 주소를 검색

*Port 번호
-운영체제가 관리하는 서버 프로그램의 연결 번호. 서버 시작 시 특정 Port 번호에 바인딩

*TCP
-TCP는 연결형 프로토콜로, 상대방이 연결된 상태에서 데이터를 주고 받는 전송용 프로토콜
-클라이언트가 연결 요청을 하고 서버가 연결을 수락하면 통신 회선이 고정되고, 
 데이터는 고정 회선을 통해 전달. 
 TCP는 보낸 데이터가 순서대로 전달되며 손실이 발생하지 않음
-ServerSocket은 클라이언트의 연결을 수락하는 서버 쪽 클래스이고, Socket은 클라이언트에
 
*UDP
-발신자가 일방적으로 수신자에게 데이터를 보내는 방식. 
 TCP처럼 연결 요청 및 수락 과정이 없기 때문에 TCP보다 데이터 전송 속도가 상대적으로 빠름
-데이터 전달의 신뢰성보다 속도가 중요하다면 UDP를 사용하고, 데이터 전달의 신뢰성이 중요하다면 TCP를 사용
-DatagramSocket은 발신점과 수신점에 해당하고 DatagramPacket은 주고받는 데이터에 해당
 
*InetAddress
-자바는 IP 주소를 java.net 패키지의 InetAddress로 표현
-로컬 컴퓨터의 InetAddress를 얻으려면 InetAddress.getLocalHost() 메소드를 호출
-getByName ( ) 메소드는 DNS에서 도메인 이름으로 등록된 단 하나의 IP 주소를 가져오고, 
-getAllByName() 메소드는 등록된 모든 IP 주소를 배열로 가져옴
-InetAddress 객체에서 IP 주소를 얻으려면 getHostAddress () 메소드를 호출

*/
public class InetAddressEx {

	
	public InetAddressEx() {
		InetAddress inet = null; 
		try {
			inet = InetAddress.getLocalHost();
			InetAddress[] inetAddrs = InetAddress.getAllByName("www.daum.net");
			String ip = inet.getHostAddress(); //ip 조회
			String name =inet.getHostName();  //장치의 이름
			
			System.out.println("getHostAddress()ip ="+ip);
			System.out.println("getHostName()name ="+name);
			System.out.println("------------------\n");
			
			System.out.println(inetAddrs);
			
			for(InetAddress remote : inetAddrs) {
				System.out.println("daum ip 주소" + remote.getHostAddress());
			}
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new InetAddressEx();
		
		
		
		
	}

}
