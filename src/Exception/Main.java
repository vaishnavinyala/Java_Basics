package Exception;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 4;
            int multiplier = a * b;
            System.out.println(multiplier);
        }
        catch(Exception e){
            System.out.println(e);
        }

        }
    }
