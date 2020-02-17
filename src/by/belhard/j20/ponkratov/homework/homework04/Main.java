package by.belhard.j20.ponkratov.homework.homework04;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Stas");
        Player player2 = new Player("Oleg", 5, 0);

        player1.move(3 , 5);
        player2.move(0,0);

        player1.printInfo();
        player2.printInfo();

        player1.move(0,0);

        player1.printInfo();

        player1.setName("Anton");
        System.out.println(player1.getName());
    }
}
