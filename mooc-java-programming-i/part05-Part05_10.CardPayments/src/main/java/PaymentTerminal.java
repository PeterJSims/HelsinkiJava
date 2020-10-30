
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        }
        affordableMeals++;
        money += 2.50;
        return payment - 2.50;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < 4.30) {
            return payment;
        }
        heartyMeals++;
        money += 4.30;
        return payment - 4.30;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.50) {
            return false;
        }
        affordableMeals++;
        card.takeMoney(2.50);
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30) {
            return false;
        }
        heartyMeals++;
        card.takeMoney(4.30);
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > money || sum < 0) {
            return;
        }
        card.addMoney(sum);
        money += sum;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
