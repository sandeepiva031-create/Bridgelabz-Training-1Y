public class FeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discount = fee * 0.10;

        System.out.println(
                "The discount amount is INR " + discount +
                        " and final discounted fee is INR " + (fee - discount)
        );
    }
}
