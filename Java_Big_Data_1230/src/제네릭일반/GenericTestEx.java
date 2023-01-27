package 제네릭일반;
// 컴파일 시 강한 타입 체크
// 타입 변환 제거

import java.util.ArrayList;
import java.util.List;

public class GenericTestEx {
    public static void main(String[] args) {
//        List list = new ArrayList(); // 자바 8 이전 스타일
//        list.add("안녕하세요");
//        String str = (String) list.get(0);
        // 제네릭 타입
        List<String> list = new ArrayList<>(); // List 에서 사용할 데이터 타입을 미리 지정하여 컴파일시 타입체크가 일어나도록함.
        list.add("Hello");
        String str = list.get(0); // 0번째 값을 읽어옴
    }
}
