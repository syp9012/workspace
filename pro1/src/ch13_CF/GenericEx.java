package ch13_CF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* Generic 
 * 데이터타입을 컴파일시에 미리 지정
 * 타입변환을 하는 불필요한 과정(코드)를 줄일수 있다.
 * 타입 안정성 보장  - 문제가 발생할 확률을 줄인다.
 * 
 * 다양한 타입의 Object가 저장될 수 있는 컬렉션
 * 데이터를 꺼낼 때 마다 데이터타입을 매번 확인하고 변환해야 한다.
 * Generic을 이용하면, 이미 어떤 타입의 데이터가 저장되어 있는지 알수 있다.
 * 변수명<데이터타입>
 * 클래스 참조변수명;
 * 상위클래스 참조변수명;
 * 인터페이스 참조변수명; // List, Set, Map
 * 참조변수명<데이터타입>
 * List    참조변수명;
 * Set     참조변수명;
 * Map     참조변수명;
 * 
 * List<String>   Set<Integer>
 * String 변수 = null;
 * 변수 = "값1"
 * 
 * Map인터페이스의 entrySet() Returns a Set view of the mappingscontained this 
 *이 Map에 포함된 매핑의 Set보기를 반환합니다.
 *Map의값음 반드시 key를 알아야만 꺼낼수있다.
 *
 *또한 Map은 항상 2개(key,value)가 있어야 저장된다.
 *
 * Set은 오직 한(value)개만 저장된다.
 * key와 value를 하나로 묶어야만 Set 에 저장된다.
 * 하나로 묶은 클래스가 존재하고 그 클래스안에 키와 밸류를 은닉화.entrySet()
 * entrySet
 *
 * 
*/
public class GenericEx {

	public static void main(String[] args) {
		List<String> telList = new ArrayList<String>();
		telList.add("111-1111");
		telList.add("111-1112");
		telList.add("111-1113");
		//telList.add(1234); 타입안정성 보장

		
		//제네릭으로 미리 타입을 알려주면 실행문에서 강제형변환할필요가없다,
		for(String tel : telList) { //타입변환을 하는 불필요한 가정을 줄일수 있다.
			System.out.println(tel.charAt(7));
		}
				
		
//		String mother = "111-1111";
//		String father = "111-1112";
//		String sister = "111-1113";
		
		Map<String, String> map = new HashMap(); 
		//가족
		map.put("엄마", "111-1111");
		map.put("아빠", "111-1112");
		map.put("큰누나", "111-1114");
		map.put("작은누나", "111-1114");
		
		String tel = map.get("작은누나");
		System.out.println(tel);
		
		//축구동아리
		map.put("축구1", "222-1111");
		map.put("축구2", "222-1112");
		map.put("축구3", "222-1114");
		
		//자바스터디
		map.put("스터디1", "333-1111");
		map.put("스터디2", "333-1112");
		map.put("스터디3", "333-1114");
		
		//entrySet()
		//전화연락처
		//Set 
		//Map.Entry
		Set<Map.Entry<String, String>> et = map.entrySet();
		
		//et.add("가족")
		//et.add("축구동아리")
		//et.add("자바스터디")
		
		// 묶여서 보이지 않음.
		List<String> nameList = new ArrayList<String>();
		nameList.add("홍길동");
		nameList.add("이순신");
		nameList.add("세종대왕");
		
		List<Integer> noList= new ArrayList<Integer>();
		noList.add(1);
		noList.add(2);
		noList.add(3);
		
		List<String> addrList= new ArrayList<String>();
		noList.add(1);
		noList.add(2);
		noList.add(3);
		
		
		
		
		
		
	}

}
