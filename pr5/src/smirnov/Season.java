package smirnov;

public enum Season {
    WINTER(-15.5, 150), SUMMER(26.4, 250), SPRING(14.5, 240), AUTUMN(10.3, 270);
    private final double avgTemp;
    private final int avgPrec;

    Season(double avgTemp, int avgPrec) {
        this.avgTemp = avgTemp;
        this.avgPrec = avgPrec;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
    public int getAvgPrec(){
        return avgPrec;
    }
    public String getDescription() {
        if (this == Season.AUTUMN || this == Season.WINTER) {
            return ("Это холодное время года.");
        }
        else {
            return ("Это тёплое время года.");
        }
    }

    @Override
    public String toString() {
        return "Season{" +
                "avgTemp=" + avgTemp +
                ", avgPrec=" + avgPrec +
                '}';
    }
}
