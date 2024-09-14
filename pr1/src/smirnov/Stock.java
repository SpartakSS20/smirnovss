package smirnov;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }
    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
}
