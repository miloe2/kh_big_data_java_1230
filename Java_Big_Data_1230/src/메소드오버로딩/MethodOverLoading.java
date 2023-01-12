package 메소드오버로딩;
// 메소드오버로딩 : 동일한 이름의 메소드를 매개변수의 타입이나 개수, 순서에 따라 다르게 호출하는 것
// 반환타입은 보지 않음, 메소드 이름은 동일 해야 함.
public class MethodOverLoading {
    public static void main(String[] args) {

    }
    static int sum (int x, int y, int z ) {
        return x + y + z;
    }
    // 매개변수의 개수가 다름
    static double sum (int x, int y, int z, int aa){
        return (double)(x + y + z + aa);
    }
    static String sum (String x, String y, String z){
        return x + y + z;
    }

}
