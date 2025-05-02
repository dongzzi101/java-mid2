package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        // 불변 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);

        mutableList.add(4);
        mutableList.add(5);
        System.out.println(mutableList);

        // 다시 불변리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        //unmodifiableList.add(6); 예외 발생
        System.out.println(unmodifiableList);
    }
}
