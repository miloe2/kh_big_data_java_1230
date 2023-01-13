package 상속실습예제;
// 인간(person) 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) - 몇 살 인지?
// - sleep : 잠을 자는 특성 (정수 값 사용, 게터/세터) - 몇 시간 자는지?
// 인간으로부터 직장인을 생성
// - work : 몇 시간 일하는지 (정수 값 사용, 게터/세터)
// 인간으로부터 학생을 생성
// -study : 공부하는 특성 (1 입력 : "열심히", 2 입력 : "적당히", 3 입력 : "놀면서")

public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.infoWorker();
        worker.infoWorker();

        Student student = new Student();
        student.infoStudent();
    }
}
