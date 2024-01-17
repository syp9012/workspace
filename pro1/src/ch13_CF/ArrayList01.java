package ch13_CF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*collection Framework
- 인터페이스

*List 
- ArrayList, Vector ,LinkedList
- 순차 적으로 저장되고, 배열과 달리 자동적으로 크기가 변경된다.
- Collection 인터페이스를 상속받는다.

*Set 
- HashSet, TreeSet
- 집합과 개념이 유사하다. 순서가 없고 동일한 값을 가지지 않는다.
- Collection 인터페이스를 상속받는다.

*Map
- HashMap, Properties, HashTable, TreeMap
- 키와 값으로 구성되어 있다. 

컬렉션은 다양한 타입을 넣을수있지만 <>를 통해 타입 제한을 한다.
형변환등의 이유를통해.
List<String> list = new ArrayList<String>();


*/
public class ArrayList01 {

	public static void main(String[] args) {
		//인터페이스명 list = new 구현클래스명();
		//상위클래스명 list = new 하위클래스명();
		//   클래스명 list = new   클래스명();
		
		//다형성을 이용해서 코드의 유연함을 가지고 올수있다.
		List list = new ArrayList();
		
		
//		List list2 = new LinkedList(); //List interface는 import해야한다.

		/*	List list2 = new ArrayList(); //List interface는 import해야한다.
		List list3 = new Vector(); //List interface는 import해야한다.*/	
		
	
		
		
		
		System.out.println(list); //[]
		System.out.println(list.toString()); //[]
		System.out.println(list.size()); //0
				
		//list 조회=> get() 값가져오기.
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			
			//String클래스이 객체일 경우에만
			if(obj instanceof String) {
				String v = (String)obj;
				System.out.println(v.length());
			}
			
			
			System.out.println(obj);
		}
		
		//value 추가 => add(Object)
		
		list.add("핸드폰");
		list.add(new String("노트북"));
		list.add("건물");
						//기본타입->클래스타입:자동박싱  // 
		list.add(1); // int -> Integer 클래스로 박싱.
		//list.add(18000000000L); // long -> Long 클래스로 박싱.
		list.add(230.5); // double -> Double 클래스로 박싱.
		list.add(true); // boolean-> Boolean 클래스로 박싱.
		list.add(new String[] {"땅", "차"}); // 주소가 들어가서 가능;
		list.add('a'); //char ->Character 클래스로 박싱.
			
		System.out.println("---------------------------\n");
		//list 조회=> get() 값가져오기.
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			//String클래스이 객체일 경우에만
			
			if(obj instanceof String) {
				String v = (String)obj;
				System.out.println("글자길이="+v.length());
			}else {
				System.out.println("String타입 외:"+ obj.toString());
			}
			//jav.lang.classCastException: class java.lang.Long cannot be cast to class java.lang.String (java.lang.Long and java.lang.String a
		}
		System.out.println("---------------------------\n");
		//value 변경 
		//add(인덱스,value) : 특정 인덱스를 지정하여 value추가.
		//=>size의 변경 발생.
		System.out.println("변경전 list.get(5)=" + list.get(5)); //true
		list.add(5, false);
		System.out.println("변경후 list.get(5)=" + list.get(5)); //false
		System.out.println("변경후 list.get(6)=" + list.get(6)); //true
		System.out.println("list.size()="+ list.size()); //9
		
		//set(인덱스,value) : 특정 인덱스의 value를 변경.
		//=>size의 변경 발생x
		list.set(5, Boolean.TRUE); //wrapper클래스 타입의 값
		System.out.println("list.size()="+ list.size()); //9
		System.out.println("set()변경후 list.get(5)=" + list.get(5)); //true
		
		//remove(인덱스) : 특정 인덱스의 value를 삭제하고, 삭제된 객체를 반환한다.
		//Object ro = list.remove(0);
		String ro2 = (String)list.remove(0);
		System.out.println(ro2); // 삭제한 내용 출력
		System.out.println("remove(0)삭제후 list.size()="+ list.size()); //8
		
		
		//remove(Object) : 지정한 객체를 삭제하고,삭제여부를 boolean으로 반환한다. 
		System.out.println(list.remove("건물")); //true
		System.out.println("remove(\"건물\")삭제후 list.size()=" + list.size()); //7
		
		//clear() : 저장된 모든 객체를 제거 
		list.clear(); // 리턴값 없음
		System.out.println("clear()제거후 list.size()=" + list.size()); // 0
		
	}
}