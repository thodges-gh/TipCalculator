package program;

/**
 * Created by vornth on 7/12/15.
 */
public class Calculator {

    private double subTotal;
    private double tipAmount;
    private int tipPercent;
    private double trueTotal;

    public Calculator(double subTotal, int tipPercent) {
        this.subTotal = subTotal;
        this.tipAmount = setTipAmount(tipPercent);
        this.trueTotal = this.subTotal + this.tipAmount;
    }

    public double setTipAmount(int tipPercent) {
        this.tipAmount = (this.subTotal / tipPercent);
        return this.tipAmount;
    }
}
