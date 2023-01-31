package 어레이리스트예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// List 인터페이스란 ? 배열과 비슷한 구조를 가지면 하위에 ArrayList, likedList, Vector 클래스로 구성됨.
// 요소의 저장 순서가 유지, 중복 저장 허용, 동적 할당(크기 지정을 안해도 됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에저장, 검색으 인덱스로 하기 때문에 빠름, 삽입삭제는 느림 (맨 뒤 삽입/ 삭제는 빠름)
// Vector : ArrayList 와 동일 특성을 가짐, 멀티스레드 환경을 위한 동기화 기능을 지원하기 때문에 ArrayList 보다 느림
// LikedList : 물리적으로 연속된 공간이 아님. 참조로 다음 저장 위치를 가리킴, 삽입/삭제가 빠르지만 검색은 느림
public class ArraylistEx1 {
    public static void main(String[] args) {
        String[] data = {"138", "145", "122", "155"}; // 이미 만들어진 배열
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // asList() 이미 만들어진 배열을 List 에 추가
//        pitches.add("138"); // ArrayList 마지막 인덱스에 값 추가 (이때 사이즈가 증가함)
//        pitches.add("128");
//        pitches.add("111");
//        pitches.add(1,"155");   // 해당 인덱스에 값 추가 (성능에 영향을 미침)
//        pitches.sort(Comparator.naturalOrder()); // 오름차순
        pitches.sort(Comparator.reverseOrder()); // 내림차순


//        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환함
//        System.out.println(pitches.size()); // ArrayList 의 개수 반환
//        System.out.println(pitches.contains("142")); // false , 전달된 값이 Arraylist 내에 있는지 확인
//        System.out.println(pitches.remove(0)); // 리스트에서 해당 항목을 삭제하고 결과를 삭제하고, 삭제된 요소를 반환함
//        System.out.println(pitches.remove("128")); // 리스트에서 해당 항목을 삭제하고 true/false 로 반환

        System.out.println(pitches);
    }
}
