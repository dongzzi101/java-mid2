package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        // 생성 시점에 T타입 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        
        integerBox.set(20); 
//        integerBox.set("20");  // Integer 타입만 허용
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(20.0);
        Double d = doubleBox.get();
        System.out.println("double = " + d);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Float> floatGenericBox = new GenericBox<>();

    }
}
