package 쓰레드예제7번;
//synchronized (동기화): 멀티스레드에서 특정 메소드나 블록{}에 대해 lock(잠금)을 설정하는 것
// 동시 접근으로 인해 발생 할 수 있는 문제를 해결하기 위해 사용되며, 사용시 급격한 성능 저하가 발생할 수 있음.

import static java.lang.Thread.sleep;

public class ThreadEx7 {
    public static void main(String[] args) {
        SharedThread SharedThread = new SharedThread();
        Runnable th1  = new Runnable() {
            @Override
            public void run() {
//                sharedValu
            }
        };
        Thread thread1 = new Thread(th1);
        thread1.start();

    }
}

class SharedThread {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        try {
            sleep(2000);
        } catch (InterruptedException ex) {

        }
    }

}
