package 클래스정렬연습문제;
import java.util.Comparator;

public class ScoreSort implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.score == o2.score){
//            return o1.num.compareTo(o2.num);
        }
        return o1.score - o2.score;
    }
}