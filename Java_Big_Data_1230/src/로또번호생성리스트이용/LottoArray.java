package 로또번호생성리스트이용;
import java.util.ArrayList;
import java.util.List;

public class LottoArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();  // 객수 지정 필요없음.
        int tmp; // 로또번호를 임시로 저장하는 변수

        while (true){
            tmp = (int) ((Math.random() * 45) + 1);
            if(list.contains(tmp)) list.add(tmp);
            if(list.size() == 6) break;

        }
        for(Integer e : list ) System.out.println(e + " ");

    }
}
