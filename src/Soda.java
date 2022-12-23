public class Soda extends Product{
    private String flavor;
    public Soda(String name, double price, String flavor) {
        super(name, price);
        this.setFlavor(flavor);
    }
    public String getFlavor() {
        return flavor;
    }
    private void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public String toString(){
        return String.format("%sflavor:\t%s", super.toString(), flavor);
    }

}
