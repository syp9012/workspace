package ch13_CF;


//Pair
class Pair<K,V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}

public class Pair_main_generic{
   public static void main(String[] args) {
       // Integer와 String 타입의 쌍을 저장하는 Pair 객체를 생성.
       Pair<Integer, String> pair1 = new Pair<>(1, "Apple");   
       System.out.println(pair1.getFirst() + ", " + pair1.getSecond());
   }
}

//Pair를 처음만들때는 타입이 정해져있지 않다. 
/*Type Parameter
 * 예)K- the key's type
 * 예)V- the value's type
 * 
 * 하나 이상의 type parameter를 선언하고 있는 클래스 => 제네릭 클래스
 * 하나 이상의 type parameter를 선언하고 있는 인터페이스 => 제네릭 인터페이스
 * 이를 합쳐서 제네릭타입이라고 한다.
 * 제네릭을 사용하면 데이터 타입을 컴파일 시에 결정할수 있다.
 * 잘못된 타입의 키를 사용하려고하면 컴파일 시점에서 에어를 발생시켜 문제를 미리 방지할수 있다.
 * 
 * 
 */
