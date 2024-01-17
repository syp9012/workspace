package ch13_CF;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map01_p570 {

	public static void main(String[] args) {
		//interface 참조변수 = new 구현클래스명();
		//     클래스명 참조변수= new 클래스명();
		//HashMap map = new HashMap();
		Map map = new HashMap();
		
//		System.out.println(map);  			//{}
//		System.out.println(map.toString()); //{}
		
		int len = map.size();
//		System.out.println("size()=" + len);
		
		//value입력

		
		map.put("홍길동",100);
		map.put("이순신",90);
		map.put("김구",80);
		map.put("세종대왕",70);

//		System.out.println("세종대왕의 key 값: "+map.get("세종대왕"));   
//		System.out.println("size()=" + map.size()); 
		
		//순서X,중복(키중복X,값중복허용O) 
//		map.put("세종대왕",99);
//		System.out.println("size()=" + map.size()); 
//		System.out.println("세종대왕의 key 값: "+map.get("세종대왕"));  // 키값이 중복되면 값을 덮어씀
		
		map.put("을지문덕", 100); //값중복
//		System.out.println("size()=" + map.size()); //5
//		System.out.println("을지문덕의 key 값: "+map.get("을지문덕"));  // 100
		
		// 모두꺼내기(p574 25라인)
		Set<String> keySet = map.keySet();
		Iterator<String> it= keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = (Integer)map.get(key);//map 안에 put된 키를 이용하여 값을 가져오기.
			System.out.println(key +"의 값은 "+ value);
		}
		
		//특정객체 삭제(p574 34라인)
		map.remove("홍길동");
		System.out.println("size()="+map.size()); // 4
		System.out.println(map.get("홍길동")); //null
		
		//객체를 하나씩 처리(p574 38라인)  >>> 좀더 볼것.
		Set<Map.Entry<String, Integer>> et = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt= et.iterator();
		while(entryIt.hasNext()) {
			Entry<String,Integer> entry = entryIt.next();
			String key = entry.getKey(); // 키만 가져오는것.
			Integer value = entry.getValue();//Entry 안에 있는 값을 가져오기.
			System.out.println(key +"의 값은 "+ value);
		}
		
		

	}

}
