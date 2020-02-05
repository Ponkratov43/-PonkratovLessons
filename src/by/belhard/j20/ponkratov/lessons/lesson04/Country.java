package by.belhard.j20.ponkratov.lessons.lesson04;

public class Country {

    private String title;

    private int zipCode;

    private static int example;

    public Country(String title, int zipCode) {
        this.title = title;
        this.zipCode = zipCode;
    }

    public static String capitalize(String string){

        example++;

        return string.toUpperCase();
    }

    public String getTitle() {
        return title;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
