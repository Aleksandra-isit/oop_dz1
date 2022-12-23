public class Cheese extends Product{
    private double percentageOfFat;
    private int elitism;
    public Cheese(String name, double price, double percentageOfFat, int elitism) {
        super(name, price);
        this.setPercentageOfFat(percentageOfFat);
        this.setElitism(elitism);
    }
    private void setPercentageOfFat(double percentageOfFat){
        this.percentageOfFat = percentageOfFat;
    }
    public double getPercentageOfFat(){
        return percentageOfFat;
    }

    public int getElitism() {
        return elitism;
    }
    private void setElitism(int elitism) {
        this.elitism = elitism;
    }

    public String toString(){
        return String.format("%sPercentage of fat content:\t%.2f; Elitism:\t%d;", super.toString(), percentageOfFat, elitism);
    }
}
