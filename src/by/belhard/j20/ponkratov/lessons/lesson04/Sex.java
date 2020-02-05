package by.belhard.j20.ponkratov.lessons.lesson04;

public enum Sex {

    MALE(false),
    FEMAL(false),
    UNKNOW(true);

    Sex(boolean wasChanched){

        this.wasChanched = wasChanched;

    }
    private boolean wasChanched;

    public boolean isWasChanched() {
        return wasChanched;
    }
}
