package 래퍼클래스;
// 래퍼클래스 : 기본타입을 객체 타입으로 변환시켜주는 것
// 필요한 이유 ? 컬렉션프레임워크에서 사용되는 자료형은 모두 객체타입이므로 기본타입을 사용할 수 없음.
// 객체타입으로 사용하는 이유는 일반화 프로그램을 위해서이며, 일반화 프로그램은
// 여러가지 데이터 타입에 대해서 동일한 자료구조로 관리하기 위해서 .
public class WrapperTest {
    public static void main(String[] args) {
        String[] scale = {"a", "b", "c", "d", "e", "f", "g"};

        for(int i = 0; i <10; i++){
            System.out.println(scale[(int) (Math.random() * 7)]);
        }




        }
    }