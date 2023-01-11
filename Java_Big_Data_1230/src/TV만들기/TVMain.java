package TV만들기;

import 메소드연습.Sample;

public class TVMain {
    public static void main(String[] args) {
        TV samsung = new TV(); // 기본 생성자 호출
        TV lg = new TV(true, 2,15); // 매개변수가 있는 생성자 호출
        samsung.getTV();
        lg.getTV();

        samsung.setON(true);
        samsung.setChannel(1030);
        samsung.setVolume(20);

        samsung.getTV();
    }
}

