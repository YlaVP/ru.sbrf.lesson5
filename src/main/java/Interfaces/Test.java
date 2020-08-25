package Interfaces;


    public class Test {
        public static void main(String[] args) {

            Cat cat1 = new Cat("Feliks");
            Dog dog1 = new Dog("Rex");

            outputInfo(cat1);
            outputInfo(dog1);
        }
        public static void outputInfo(Info info){

            info.showInfo();
            info.makeNoise();
            info.move();
            info.eat();
        }
    }

