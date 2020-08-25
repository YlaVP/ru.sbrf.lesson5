package Interfaces;


    public class Cat  implements Info{

        public String name;
        public Cat(String name){
            this.name = "Feliks";
        }


        public void eat() {

            System.out.println("The cat eats sour cream and drinks milk");
        }

        public void makeNoise() {

            System.out.println("Cat is mew");
        }

        public void climb() {

            System.out.println("Cat climbing tress");
        }

        public void move() {

            System.out.println("Cat moves gracefully and jumps high");
        }


        public void showInfo(){

            System.out.println("Cat is name "+this.name);
        }
    }

