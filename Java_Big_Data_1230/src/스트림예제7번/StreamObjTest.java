package 스트림예제7번;

import java.util.ArrayList;
import java.util.List;

public class StreamObjTest {
    public static void main(String[] args) {
        List<TravelCustomer> customersList = new ArrayList<>();
        customersList.add(new TravelCustomer("유나", 21, 1000));
        customersList.add(new TravelCustomer("남행선", 38, 3000));
        customersList.add(new TravelCustomer("남해이", 17, 1600));
        customersList.add(new TravelCustomer("민지", 18, 2000));
        System.out.println("고객 명단 출력");
        customersList.stream().map(c->c.getName()).forEach(s ->System.out.println(s));
        System.out.println("지불 금액 출력");
        int total = customersList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println(" 총 여행 비용 : " + total);

        System.out.println("== 20세 이상 성인 출력 ==");
        customersList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(c->c.getName())
                .forEach(s->System.out.println(s));

    }
}


class TravelCustomer {
    String name;
    int age;
    int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}