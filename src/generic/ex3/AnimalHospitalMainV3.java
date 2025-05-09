package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("양양이1", 300);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 냥병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1: 개 병원에 고양이 전달
//        dogHospital.set(cat); //매개변수 체크 실패: 컴파일 오류 방생하지 않음

        // 문제 2: 개 타입 반환
        dogHospital.set(dog);
        Dog animal = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + animal);
    }
}
