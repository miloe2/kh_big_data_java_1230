package 스트림예제5번;
// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
          //스트림에서 홀수 값만 골라냄
//        stream1.filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
//        System.out.println();
//        // 스트림에서 중복 요소를 제거
//        stream2.distinct().forEach(e ->System.out.print(e+ " "));

//        // 정수 입력해서 홀수 짝수 나누기
//        List<Integer> input = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 7; i++){
//            input.add(sc.nextInt());
//        }
//        input.stream().filter(n-> n% 2 != 0).forEach(e->System.out.print(e+ " "));
//        System.out.println();
//        input.stream().filter(n-> n% 2 == 0).forEach(e->System.out.print(e+ " "));

        // 스트림 변환(map()) : 해당 스트림의 요소들에 주어진 함수의 인수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성
        Stream <String> stream = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        stream.map(e->e.length()).forEach(System.out::println);

        String[] arr = {"I study jard","You study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);

        // 스트림 제한
        // limit() : 해당 스트림의 첫번째 요소부터 전달 된 개수까지의 요소로만 이루어진 새로운 스트림 반환 / 1 ~ limit 까지 반환
        // skip()  : 해당 스트림의 첫번째 요소부터 전달 된 개수만큼의 요소를 제외하고 출력
        IntStream stream4 = IntStream.range(0, 10); // 0 ~ 10 미만
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        IntStream stream7 = IntStream.range(0, 10);
        stream4.forEach(n->System.out.print(n + " "));
        stream5.limit(5).forEach(n->System.out.print(n + " ")); // 5개만
        System.out.println();
        stream6.skip(5).forEach(n->System.out.print(n+" ")); // 5개를 skip 하고 그 다음부터 출력
        System.out.println();
        stream7.skip(3).limit(5).forEach(n -> System.out.print(n+" ")); //  앞에 3개를 제외하고 그다음부터 5개
        System.out.println();

        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream8 = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        Stream<String> stream9 = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        stream8.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s+ " "));

    }
}
