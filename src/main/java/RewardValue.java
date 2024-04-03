public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue(){
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue reward1 = new RewardValue(100.0);
        System.out.println("Cash Value: $" + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        RewardValue reward2 = new RewardValue(5000);
        System.out.println("Cash Value: $" + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }
}
