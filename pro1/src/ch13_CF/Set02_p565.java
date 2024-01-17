package ch13_CF;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*collection
 * 
 * collection Framework
 * 
 * 
 * 
 * set
 * Arrayset Vector Linkedset
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
public class Set02_p565 {

	public static void main(String[] args) {
		//interface 참조변수 = new 구현클래스명();
		//상위클래스명 참조변수= new 하위클래스명();
		//클래스명 참조변수 = new 클래스명();
		//<> 제너릭을 통해 타입 제한.
		//HashSet set = new HashSet();
		Set<String> set = new HashSet<String>();
		
		//add() value 입력
		set.add("홍길동");
		set.add("고영희");
		set.add("이순신");
		set.add("개");
		set.add("고양이");
//		set.add(Math.random());
		
		
		//size() 입력한 value 개수 조회
		int size = set.size();
		System.out.println("size()= "+ size);
		
		//모든 value꺼내기 => 향상된 for문.
		for(Object a : set) {
			System.out.print(a + ", ");
		}
		System.out.println("");
		
		//모든 value꺼내기 => iterator
		Iterator<String> it = set.iterator();
//		boolean b = it.hasNext();
//		System.out.println(b);
//		String s = it.next();
//		System.out.println(s);
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		};
		
		// 삭제 후 개수 확인
		set.remove("홍길동");
		
		
		
		//String 제네릭을 통해 타입을 지정해 Object가 아닌 String 변수에 값 대입가능.
		for(String a : set) {
			System.out.print(a+"("+a.length()+")");
		}
		System.out.println("");
		
		//전부 삭제
		set.removeAll(set);
		size = set.size();
		System.out.println("size()= "+ size);
		
		set.clear();
		size = set.size();
		System.out.println("size()= "+ size);

		
		
	}

}
