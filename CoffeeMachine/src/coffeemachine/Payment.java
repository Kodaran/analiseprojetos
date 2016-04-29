package coffeemachine;

public class Payment {

    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Payment coffeePayment(Payment pay, double money) {
        if (money >= 0.35) {
            pay.setMoney(money - 0.35);
        } else {
            System.out.println("Dinheiro insuficiente");
        }
        return pay;
    }
}
