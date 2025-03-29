public class Main {
    public static void main(String[] args) {
        TotalCalculator orderCalculator = new TotalCalculation();
        OrderPlacement orderPlacement = new OrderPlacement();
        InvoiceGenerator invoiceGenerator = new GeneratorInvoice();
        EmailNotifier emailNotifier = new EmailNotification();

        double total = orderCalculator.calculateTotal(500, 5);
        orderPlacement.placeOrder("Bulatao, Luis Joshua D.", "Pinagpala Street");
        invoiceGenerator.generateInvoice("Order.pdf");
        emailNotifier.sendEmailNotification("luisjoshua.bulatao@neu.edu.ph");
    }
}