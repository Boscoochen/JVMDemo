package com.atguigu.java.chapter05.java2;

public class Program4 {
    public static void main(String[] args) {
//        DogService dogService = () -> new Dog1();
        DogService dogService = Dog1::new;
        System.out.println(dogService.getDog());

//        DogService2 dogService2 = (name, age) -> new Dog1(name, age);
        DogService2 dogService2 = Dog1::new;
        System.out.println(dogService2.getDog("jack", 10));
    }

    interface DogService {
        Dog1 getDog();
    }

    interface DogService2 {
        Dog1 getDog(String name, int age);
    }
}
