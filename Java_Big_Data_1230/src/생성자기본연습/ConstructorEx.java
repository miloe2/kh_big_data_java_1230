package 생성자기본연습;
// 생성자 : 클래스가 객체로 만들어질 때 자동으로 호출되며(new 키워드 사용 시),
// 생성자에서 인스턴스 필드를 초기화하는 것이 주 목적이다.
// 생성자 만드는 규칙
// 1. 생성자는 클래스 이름과 같아야 함.
// 2. 반환 타입은 없고 접근제한자는 올수 있으나 private 특별한 경우가 아니면 사용 안함
// 3. 하나의 클래스는 여러개의 생성자를 가질 수 있으나, 오버로딩 생성 규칙에 맞아야함.
public class ConstructorEx {
    public static void main(String[] args) {
        Car ev6 = new Car(); // 아무것도 없는 생성자 호출
        Car kona = new Car("kona");
        Car sorento = new Car("sorento", "2023");
        Car g90 = new Car("제네시스 G90", "2022", "Black");

        ev6.getCar();
        kona.getCar();
        sorento.getCar();
        g90.getCar();
    }
}
class Car {
    String name ; // 인스턴스 필드
    String year;
    String color;
    Car(){} // 아무것도 없는 생성자
    Car(String name){
        this.name = name;
    }
    Car(String name, String year){
        this.name = name;
        this.year = year;
    }
    Car(String name, String year, String color){
        this.name = name;
        this.year = year;
        this.color = color;
    }
    void getCar(){
        System.out.println("이름 : " + name);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("----------------");
    }
}

