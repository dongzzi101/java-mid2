package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("test");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        // 잘못된 타입 인수 전달
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
