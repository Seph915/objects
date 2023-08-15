public class Programmer {

        String name;
        int age;
        boolean wearGlasses;

        Programmer(String name, int age, boolean wearGlasses) {
            this.name = name;
            this.age = age;
            this.wearGlasses = wearGlasses;
        }
        void drinkCoffee() {
            System.out.println("Espresso is the secret!");
        }
        void printDetails() {
            System.out.println(name + " is a " + age +"-yo programmer");
        }
        void hasGlasses() {
            System.out.println("Is " + name + " wearing glasses? " + wearGlasses);

            }
        }


