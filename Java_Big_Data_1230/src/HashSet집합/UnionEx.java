package HashSet집합;
// 합집합 : 두개의 요소에서 어느 한쪽에만 존재 결과에 반영 ( 단 동일한 값이 양쪽에 존재하는 경우 중복은 제거 됨)
// 교집합 : 두 군데 모두 존재한 값만 결과에 반영
// 차집합 : 앞의 요소에 뒤의 요소에 제거한 나머지

import java.util.Arrays;
import java.util.HashSet;

public class UnionEx {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        s1.addAll(s2); /// 합집합
//        s1.retainAll(s2);
//        s1.removeAll(s2);
        System.out.println(s1);
    }
}
