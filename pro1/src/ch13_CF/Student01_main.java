package ch13_CF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//생성한 학생객체들을 컬렉션(List,Set,Map)에 저장.
public class Student01_main {

	public static void main(String[] args) {
		//List에 저장
		List<Student01> stuList = new ArrayList<Student01>();
		
		stuList.add(new Student01(1,"홍길동","서울시"));
		stuList.add(new Student01(2,"이순신","경기도"));
		stuList.add(new Student01(3,"세종대왕","제주도"));
		System.out.println("학생목록(학생수)="+stuList.size());
		// 학생정보조회
		for(Student01 student : stuList) {
			System.out.println(student);
		}
		
		
		System.out.println("=================================");
		//Set에 저장
		Set<Student01> stuSet = new HashSet<Student01>();
		stuSet.add(new Student01(11,"홍길동11","서울시11"));
		stuSet.add(new Student01(12,"이순신12","경기도12"));
		stuSet.add(new Student01(13,"세종대왕13","제주도13"));
		System.out.println("학생집합(학생수)="+stuSet.size());
		//학생목록조회-Set의 입력순서와 무관한 출력순서
		for(Student01 student : stuSet) {
			System.out.println(student);
		}
		
		
		Iterator<Student01> student = stuSet.iterator();
		while(student.hasNext()) {
			System.out.println(student.next());
		}
		
		
		System.out.println("=================================");
		//Map에 저장
		Map<Integer,Student01> stuMap = new HashMap<Integer, Student01>();
		stuMap.put(111, new Student01(111,"홍길동111","서울시111"));
		stuMap.put(112, new Student01(112,"이순신112","경기도112"));
		stuMap.put(113, new Student01(113,"세종대왕113","제주도113"));
		System.out.println("학생Map(학생수)="+stuMap.size());
		
		
		//특정학생조회 : 특정학생객체의 Key알때는 get(키명)
		Student01 student1= stuMap.get(111);
		System.out.println("특정학생조회:" + student1);
		
		//학생전체조회:1)Key 집합 가져오기 -> 가져온 키를 알고 있으므로, get(키명)
		//1)key집합 가져오기.
		Set<Integer> keys = stuMap.keySet();
		System.out.println("keys =" + keys);
		System.out.println("keys =" + keys.size()); //3
		
		Iterator<Integer> it = keys.iterator();
		
		//2)반복문{가져온키를 알고이으므로 get(키명)
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(stuMap.get(key));
		}
		
		Set<Map.Entry<Integer, Student01>> entrySet = stuMap.entrySet();
		Iterator<Map.Entry<Integer, Student01>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
		//추가
		System.out.println("---------------------------------");
		for(Map.Entry<Integer, Student01> entry : stuMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		

	}
}
