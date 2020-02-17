package by.belhard.j20.ponkratov.homework.homework06.task02;

public class Main {

    public static void main(String[] args) {

        Community community = new Community(
                new Person("Stas"),
                new Person("Grisha"),
                new Person("Margo"),
                new Person("Anton"),
                new Person("Oleg")
        );

        final Person searchRes = community.find("Grisha");

        if (searchRes == null){
            System.out.println("Not found");
        }else{
            System.out.println("Founded " + searchRes);
        }

    }

}
