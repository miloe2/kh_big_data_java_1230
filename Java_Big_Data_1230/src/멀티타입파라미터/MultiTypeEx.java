package 멀티타입파라미터;

import 다형성응용.PolyBuyer;

// 타입변수 : 참조형 타입을 의마하고 어떤 문자로 이름을 지정해도 상관 없지만, 일반적으로 'T'를 사용함.
// 타입변수는 클래스 뿐만 아니라 메소드의 매개변수나 반환타입으로 사용 가능
public class MultiTypeEx {
    public static void main(String[] args) {
        Product<String, Integer> product1 = new Product<>("TV", 2023);
        Product<Integer, String> product2 = new Product<>(2022, "PC");
        System.out.println(product1.getName());
        System.out.println(product2.getName());
    }
}
class Product <T, M> {
    private T name;
    private M year;

    public Product(T name, M year) {
        this.name = name;
        this.year = year;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}