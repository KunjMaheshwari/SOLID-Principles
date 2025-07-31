interface TaxCalculator {
    double calculateTax(double amount);
}

class IndiaTaxCalculator implements TaxCalculator {
    public double calculateTax(double amount) {
        return amount * 0.10;
    }
}

class USATaxCalculator implements TaxCalculator {
    public double calculateTax(double amount) {
        return amount * 0.08;
    }
}

class Invoice {
    private double amount;
    private TaxCalculator taxCalculator;

    public Invoice(double amount, TaxCalculator taxCalculator) {
        this.amount = amount;
        this.taxCalculator = taxCalculator;
    }

    public double getTotalAmount() {
        return amount * taxCalculator.calculateTax(amount);
    }
}

public class Main {
    public static void main(String args[]) {
        double amount = 1000.0;

        Invoice indiaInvoice = new Invoice(amount, new IndiaTaxCalculator());
        System.out.println(indiaInvoice.getTotalAmount());

        Invoice usInvoice = new Invoice(amount, new USATaxCalculator());
        System.out.println(usInvoice.getTotalAmount());
    }
}
