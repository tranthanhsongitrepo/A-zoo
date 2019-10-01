package com.company;

public class Main {

    public static void animalFeeding(Animal a){
        a.makeNoise();
    }
    public static void main(String[] args) {
	    Animal[] animals = new Animal[5];
	    animals[0] = new Lion();
	    animals[1] = new Hippo();
	    animals[2] = new Tiger();
	    animals[3] = new Dog();
	    animals[4] = new Cat();

	    for (Animal a : animals)
            a.eat();

	    for (Animal a : animals)
	        animalFeeding(a);

	    // Câu d : Sau khi bổ sung sleep thì các class kế thừa từ Animal phải có cài đặt lại cho phương thức này
        // => Giải quyết bằng cách cài đặt phương thức sleep cho mỗi class kế thừa từ Animal


    }
}
