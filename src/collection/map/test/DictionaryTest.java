package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        System.out.println("== 단어 입력 단계 ==");
        Map<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("영어 단어를 입력 (종료 q) : ");
            String english = sc.nextLine();

            if (finishWithQ(english)) break;

            System.out.print("한글 뜻 입력  : ");
            String korean = sc.nextLine();

            dictionary.put(english, korean);
        }
        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력 (종료 q) : ");
            String english = sc.nextLine();

            if (finishWithQ(english)) break;

            if (dictionary.containsKey(english)) {
                System.out.println(english + "의 뜻 : " + dictionary.get(english));
            } else {
                System.out.println(english + "은(는) 사전에 없습니다.");
            }
        }

    }

    private static boolean finishWithQ(String english) {
        return english.equals("q");
    }

}
