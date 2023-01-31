package 제네릭응용;

public class GenericPrinter <T extends Material> { // Material 로 부터 상속받은 클래스만 타입변수로 지정 가능
    private T material;
    public void setMaterial(T material){
        this.material = material;
    }
    public T getMaterial(){
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
