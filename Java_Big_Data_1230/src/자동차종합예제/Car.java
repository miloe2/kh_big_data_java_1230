package 자동차종합예제;

public abstract class  Car {
    protected int speed;
    protected int fuelEff;
    protected int fuelTank;
    protected int seatCnt;
    protected String name;

    // 부가 기능은 각 차량 마다 다르기 때문에 부모는 기능만 명시하고 상속받은 자식이 해당기능을 구현함.
    abstract void setMode(boolean isMode);
    public String getName(){
        return name;
    }

    // 이동 횟수 구하기 : 외부의 입력값으로 승객의 수가 필요
    int getMoveCnt(int passCnt) {
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }

    // 총 이동 비용은 매개변수로 거리와 이동 횟수가 필요
    int getTotalCost(int dist, int moveCnt) {
        return (dist / fuelEff * 2000) * moveCnt;
    }

    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {
        if (((dist * moveCnt) / fuelEff) % fuelTank != 0)
            return (((dist * moveCnt) / fuelEff) / fuelTank) + 1;
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }
    // 총 소요 시간
    public double getMoveTime(int dist, int moveCnt){
        return (double) dist * moveCnt / speed;
    }
}