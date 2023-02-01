package 클래스정렬예제2번;

import java.util.Comparator;

// 정렬 방식을 정하는 클래스 생성
public class DescendComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price == o2.price){
            return o1.name.compareTo(o2.name);
        }
        return o2.price - o1.price;
    }

    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }
}
