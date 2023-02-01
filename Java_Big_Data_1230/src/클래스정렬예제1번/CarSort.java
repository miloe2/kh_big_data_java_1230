package 클래스정렬예제1번;

public class CarSort implements Comparable<CarSort>{
    String modelName;
    int modelYear;
    String Color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        Color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName); // 앞의 문자열 사전순으로 뒤에 있으면 양수값 반환
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬
    }
}
