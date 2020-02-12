package by.belhard.j20.ponkratov.lessons.lesson06.CollectionExample;

public class Value {

    private String str;

    public Value(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Value{" +
                "str='" + str + '\'' +
                '}';
    }
}
