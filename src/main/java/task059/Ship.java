package task059;

//https://www.codewars.com/kata/54fe05c4762e2e3047000add/train/java

public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double CREW_MEMBER_WEIGHT = 1.5;
        double DRAFT_WORTH = 20;
        return this.draft - (this.crew * CREW_MEMBER_WEIGHT) > DRAFT_WORTH;
    }
}
