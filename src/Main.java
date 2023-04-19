public class Main {
    public static void main(String[] args) {
        //Sword sword1 = new Sword(new Plastic());
        //Выдаст ошибку на этапе компиляции

        Sword sword2 = new Sword(new Steel());
        System.out.println(sword2.testEndurance());
    }
}
