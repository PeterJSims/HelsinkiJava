
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if (newCents > 100) {
            newEuros++;
            newCents -= 100;
        }

        return new Money(newEuros, newCents);
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        Money newMoney = new Money(newEuros, newCents);
        Money zero = new Money(0, 0);

        if (newMoney.lessThan(zero)) {
            return zero;
        } else {
            return newMoney;
        }

    }

    public boolean lessThan(Money comparedTo) {
        if (this.euros == comparedTo.euros) {
            return this.cents < comparedTo.cents;
        }

        return this.euros < comparedTo.euros;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
