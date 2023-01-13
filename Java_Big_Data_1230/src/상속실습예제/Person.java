package 상속실습예제;
// 인간(person) 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) - 몇 살 인지?
// - sleep : 잠을 자는 특성 (정수 값 사용, 게터/세터) - 몇 시간 자는지?
// 인간으로부터 직장인을 생성
// - work : 몇 시간 일하는지 (정수 값 사용, 게터/세터)
// 인간으로부터 학생을 생성
// -study : 공부하는 특성 (1 입력 : "열심히", 2 입력 : "적당히", 3 입력 : "놀면서")
import java.util.Scanner;
public class Person {
    int age;
    int sleep;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }


}
class Worker extends Person{

    int work;
    Scanner sc = new Scanner(System.in);

    public void setWork(int work) {
        this.work = work;
    }
    int getWork(){
        return work;
    }
    Worker(){
        System.out.print("몇 살 입니까?");
        age = sc.nextInt();
        System.out.print("몇 시간 주무십니까?");
        sleep = sc.nextInt();
        System.out.print("몇 시간 일하십니까?");
        work = sc.nextInt();
    }
    void infoWorker(){
        System.out.println("===============");
        System.out.println("나이 : " + age);
        System.out.println("수면시간 : " + sleep);
        System.out.println("근무시간 : " + getWork());
    }

}
class Student extends Person{
    int study;
    int getStudy(){
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return study;
    }
    public void setStudy(int study) {
        this.study = study;
    }
    Scanner sc = new Scanner(System.in);
    Student(){
        System.out.print("몇 살 입니까?");
        age = sc.nextInt();
        System.out.print("몇 시간 주무십니까?");
        sleep = sc.nextInt();
        System.out.println("공부를 얼마나 하시나요 ? [1 ~ 3]");
        study = sc.nextInt();

    }

    void infoStudent(){
        System.out.println("===============");
        System.out.println("나이 : " + age);
        System.out.println("수면시간 : " + sleep);
        if(study == 1) System.out.println("공부를 열심히 함.");
            else if (study == 2) System.out.println("공부를 적당히 함.");
            else System.out.println("공부를 놀면서 함.");
    }

}
