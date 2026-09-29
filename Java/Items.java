public class Items {
    public static void main(String[] args) {
        int[] qty = {4, 10, 9, 10};
        String[] ItemDetails = {"Pencil", "Duster", "Pen", "Marker"};
        double[] unitPrice = {20.0, 50.0, 30.0, 80.0};
        double[] amount = {80.0, 500.0, 270.0, 800.0};

        for(int i = 0; i <= 3; i++) {
            System.out.println(
                "Quantity: " + qty[i] + ", Item: " + ItemDetails[i] +   ", Unit Price: " + unitPrice[i] + ", Amount: " + amount[i]
            );
        }
    }
}



