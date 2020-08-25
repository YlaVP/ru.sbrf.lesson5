package Interfaces;

    public class Dog implements Info {
        public String name;

        public Dog(String name){

            this.name = "Rex";
        }

        public void eat() {

            System.out.println("Dog chews bones and eat meat");
        }

        public void makeNoise() {

            System.out.println("Dog is barking");
        }

        public void swimming() {

            System.out.println("Dog is swimming");
        }

        public void move() {

            System.out.println("Dog can walk and run");
        }
        public void showInfo(){

            System.out.println("Dog is name "+this.name);
        }

    }


