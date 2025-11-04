package Payments;

    class GooglePay extends Payment {
        void pay(int amount) {
            System.out.println("The payment " + amount + " is paid from Google Pay");
        }
    }

