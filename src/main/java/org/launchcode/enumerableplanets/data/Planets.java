package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, "Inner", "91.726 Million"),
    VENUS("Venus", 225, "Inner", "41.84 Million"),
    EARTH("Earth", 365, "Inner", "---"),
    MARS("Mars", 687, "Inner", "56 Million"),
    JUPITER("Jupiter", 4333, "outer", "591 Million"),
    SATURN ("Saturn", 10756, "outer", "1.197 Billion"),
    URANUS ("Uranus", 30687, "outer", "2.586 Billion"),
    NEPTUNE ("Neptune", 60200, "outer", "4.296 Billion");


    private final String displayName;
    private int yearLength;
    private String innerOuter;
    private String distanceFromEarth;

    Planets(String displayName, int yearLength, String innerOuter, String distanceFromEarth) {
        this.displayName = displayName;
        this.yearLength = yearLength;
        this.innerOuter = innerOuter;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getInnerOuter() {
        return innerOuter;
    }

    public String getDistanceFromEarth() {
        return distanceFromEarth;
    }
}
