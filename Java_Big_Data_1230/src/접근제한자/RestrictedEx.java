package 접근제한자;
// 접근제한자는 객체지향언어 4가지 중요 특성 중에 하나
// 사용 목적은 내부의 필드값을 외부에서 접극하는 것을 제한하는 목적으로 사용
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name); //
        System.out.println(childRest.jobs); // 동일한 패키지 내에 있음

    }
}
class ChildRest extends ParentRest{
    String jobs;
    public String getJobs(){
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }
    public String getAddr(){
        return addr;
    }
}

