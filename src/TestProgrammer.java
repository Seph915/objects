public class TestProgrammer {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("luca", 20, true);
        Programmer programmer2 = new Programmer("Andrea" , 21 , false);

        programmer1.drinkCoffee();
        programmer2.hasGlasses();

    }
}
