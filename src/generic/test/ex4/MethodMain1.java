package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
//        Integer result =(Integer) GenericMethod.objMethod(i);

        // 타입 인자(type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer integerValue = GenericMethod.numberMethod(20);
        Double doubleValur = GenericMethod.numberMethod(20.0);

        System.out.println("integerValue = " + integerValue);
        System.out.println("doubleValur = " + doubleValur);

    }
}
