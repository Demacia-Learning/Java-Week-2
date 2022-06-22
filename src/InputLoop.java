package src;

class InputLoop {
    public void inputLoop() {
        int number;
        try {
            do {
                number = Integer.parseInt(System.console().readLine("Enter a number, it better not be negative! ,;,;, : "));
                System.out.println();
            } while (number >= 0);
        } catch (NumberFormatException nfe) {
            System.out.println("You might only enter a number (Zallen -> Integer)");
        }

    }
}
