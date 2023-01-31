package 벡터예제;

import java.util.List;
import java.util.Vector;

// Vector 는 ArrayList 내부적으로 동일한 구조. 메소드의 사용 방법도 완전히 동일. 멀티스레드에서 안전
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "010-1234-5678", "yyy@gmail.com", "변호사", "서울시 역삼역"));
        list.add(new NameCard("동그라미", "010-5678-5678", "ddd@gmail.com", "무직", "인천시 강화군"));
        list.add(new NameCard("이준호", "010-3333-5678", "ddd@gmail.com", "무직", "서울시 서초구"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직업 : " + e.position);

        }




    }

}
class NameCard {
    String name ;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}
