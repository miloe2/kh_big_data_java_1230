package Math클래스;
// Math 클래스의 모든 메소드는 클래스 메소드이므로 객체를 생성하지 않고 바로 사용 함.
// random() : 0.0 ~ 1.0 미만의 임의로 double 형 값을 생성해서 반환
// 7자리의 로또 번호 생성
// 7개의 배열을 만들고 첫번째부터 여섯번째는 0 ~ 50 사이의 임의의 수 생성
// 마지막 7번째는 50 ~ 100 사이의 임의의 수를 만들어서 대입하고, 한번에 출력 / 단, 중복은 허용
public class MathMainEx {
    public static void main(String[] args) {

//        // floor() : 소수점 이하를 무조건 날림
//        // ceil() : 소수점 이하가 있으면 무조건 올림
//        // round() : 반올림
//        System.out.println(Math.floor(10.999));
//        System.out.println(Math.floor(10.001));
//        System.out.println(Math.floor(10.5));
//
//        System.out.println(Math.ceil(10.999));
//        System.out.println(Math.ceil(10.001));
//        System.out.println(Math.ceil(10.5));
//
//        System.out.println(Math.round(10.999));
//        System.out.println(Math.round(10.001));
//        System.out.println(Math.round(10.5));
//        System.out.println(Math.round(10.499999));

        System.out.println(Math.max(11,9.000));
        System.out.println(Math.min(11,9.000));

        System.out.println(Math.pow(2, 10)); // 2^10




//        // abs() 메소드 : 절대값 구하기, 양수면 양수, 음수면 양수
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.abs(-3.14));

//        int arr [] = new int [7];
//        for (int i = 0; i < 7; i++){
//            if ( i < 6) {
//                System.out.print((int)(Math.random() * 50)+ " ");
//            } else {
//                System.out.print((int)(Math.random() * 50 ) + 50);
//            }
//        }


// 0 ~ 99 사이의 임의의 수 생성하기
//        for (int i =0; i < 100; i++){
//            System.out.println((int)(Math.random()*100));
//        }
        // 3 ~ 8 사이의 임의의 수 생성하기
//        System.out.println((int)(Math.random() * 6 )+3);

    }
}