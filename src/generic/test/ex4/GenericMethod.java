package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object object) {
        System.out.println("object = " + object);
        return object;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }


}
