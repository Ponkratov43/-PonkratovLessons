package by.belhard.j20.ponkratov.lessons.lesson06.Enity;

import java.util.Objects;

public class Enity {

    String abc;

    int a;

    public Enity(String abc, int a) {
        this.abc = abc;
        this.a = a;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enity enity = (Enity) o;
        return a == enity.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
