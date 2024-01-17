package ch13_CF;

import java.util.ArrayList;
import java.util.List;

/*collection
 * 
 * collection Framework
 * 
 * 
 * 
 * List
 * ArrayList Vector LinkedList
 * 타입에 상관없이 넣을수 있고, 순서가 존재한다. 
 * 중복된 값이 들어갈수 있다.
 * 
 * 
 * Set
 * HashSet, TreeSet
 * 순서가 존재하지 않고, 중복된 값이 들어갈수 없다.
 * 
 * 
 * 
 * Map
 * HashMap, TreeMap, Properties
 * 키와 밸류로 이루어지며, 키는 중복불가, 값은 중복가능하다.
 * 
 * 
 * 
 */
public class ArrayList02 {

	public static void main(String[] args) {
		//interface 참조변수 = new 구현클래스명();
		//상위클래스명 참조변수= new 하위클래스명();
		//클래스명 참조변수 = new 클래스명();
		//<> 제너릭을 통해 타입 제한.
		//ArrayList list = new ArrayList();
		List<String> list = new ArrayList<String>();
		
		//add() value 입력
		list.add("홍길동");
		list.add("고영희");
		list.add("이순신");
		list.add("개");
		list.add("고양이");
//		list.add(Math.random());
		
		
		//size() 입력한 value 개수 조회
		int size = list.size();
		System.out.println("size()= "+ size);
		
		//모든 value꺼내기 => 2가지 방법.
		
		for(Object a : list) {
			System.out.print(a + ", ");
		}
		System.out.println("");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("");
		
//		for(Object a : list) {
//			if(a instanceof String) {
//				String str = (String)a;
//				System.out.print(str.toUpperCase());
//			}
//		}
		
		//String 제네릭을 통해 타입을 지정해 Object가 아닌 String 변수에 값 대입가능.
		for(String a : list) {
			System.out.print(a+"("+a.length()+")");
		}
		System.out.println("");
		
		
		
	}

}
