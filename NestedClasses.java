// Classes inside another class

class Account{
    long number;
    String name;

    class DebitCard{
        String card_number;
        String type;

        public DebitCard(String card_number, String type) {
            this.card_number = card_number;
            this.type = type;
        }
    }

    public Account(long number, String name) {
        this.number = number;
        this.name = name;
    }
}


public class NestedClasses {
    public static void main(String[] args) {
        Account acc = new Account(12598745,"rahul");
        Account.DebitCard dc1 = acc.new DebitCard("456-654","Platinum");
    }
}
