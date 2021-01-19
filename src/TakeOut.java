import java.util.Scanner;

public class TakeOut {

    public static void displayMainMenu()
    {
        System.out.println();
        System.out.println("Choose Type of Meal:");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
        System.out.println("Please enter your option: ");

        System.out.println();

    }
    public static void displayItalianFoodMenu()
    {
        System.out.println("Choose One:");
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3. Gazpacho Soup, Salad and Bread Sticks pack - Feeds 4 - 12.99");
        System.out.println("Please enter your choice: ");
    }
    public static void displayChineseFoodMenu()
    {
        System.out.println("Choose One:");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - Feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls - Feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rive Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
        System.out.println("Please enter your choice: ");

    }
    public static void displayAmericanFoodMenu()
    {
        System.out.println("Choose One:");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - Feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces - Feeds 5 - 22.99");
        System.out.println("3. Barbeque tray - includes buns and peach cobbler - Feeds 10 - 26.99");
        System.out.println("Please enter your choice: ");

    }
    public static int determineTrays(int people, int feeds)
    {
        if (people % feeds == 0) {
            return (people / feeds);
        }
        else
        {
            return (people/feeds) + 1;
        }
    }
    public static double getSubtotal(double price, int trays)
    {
        return price * trays;
    }
    public static double getTax(double subtotal, double taxrate)
    {
        return taxrate/100 * subtotal;
    }
    public static double getTip(double subtotal, double tipRate)
    {
        return tipRate/100 * subtotal;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip)
    {
        return subtotal + tax + tip;
    }
    public static double pricePerPerson(double grandTotal, int people)
    {
        return grandTotal/people;
    }
    public static int determineLeftOvers(int trays, int people)
    {
        return trays % people;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Food Take-Out Hub");
        System.out.print("Enter how many people you are ordering for (required more than 10): ");

        Scanner sc = new Scanner(System.in);
        int numPeople = 0;
        try
        {
            numPeople = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Invalid Input. Exiting Program.");
            System.exit(1);
        }

        if (numPeople < 10)
        {
            System.out.println("At least 10 people are required to justify group order.");
            System.exit(1);
        }

        displayMainMenu();
        int option = 0;

        try{
            option = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Invalid Input. Exiting Program.");
            System.exit(1);
        }

        if (option < 1 || option > 3)
        {
            System.out.println("Invalid Choice. Please choose a number between 1 and 3.");
            System.exit(1);
        }


        switch (option) {
            case 1 -> displayItalianFoodMenu();
            case 2 -> displayChineseFoodMenu();
            case 3 -> displayAmericanFoodMenu();
        }

        int foodChoice = 0;
        try{
            foodChoice = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Invalid Input. Exiting Program.");
            System.exit(1);
        }

        if (foodChoice < 1 || foodChoice > 3)
        {
            System.out.println("Invalid Choice. Please choose a number between 1 and 3.");
            System.exit(1);
        }

        int feeds = 0;
        double price = 0;

        switch(option)
        {
            case 1:
                if (foodChoice == 1)
                {
                    feeds = 5;
                    price = 17.99;
                }
                else if (foodChoice == 2)
                {
                    feeds = 7;
                    price = 15.99;
                }
                else
                {
                    feeds = 4;
                    price = 12.99;
                }
                break;
            case 2:
                if (foodChoice == 1)
                {
                    feeds = 7;
                    price = 18.99;
                }
                else if (foodChoice == 2)
                {
                    feeds = 7;
                    price = 18.99;
                }
                else
                {
                    feeds = 5;
                    price = 10.99;
                }
                break;
            case 3:
                if (foodChoice == 1)
                {
                    feeds = 8;
                    price = 21.99;
                }
                else if (foodChoice == 2)
                {
                    feeds = 5;
                    price = 22.99;
                }
                else
                {
                    feeds = 10;
                    price = 26.99;
                }
                break;
        }

        int trays = determineTrays(numPeople,feeds);
        System.out.println("You need " + trays + " trays.");
        System.out.println("Feeds: " + feeds);

        double subtotal = getSubtotal(price, trays);
        double tax = getTax(subtotal,7.0);
        double tip = getTip(subtotal,15.0);
        double grandTotal = getGrandTotal(subtotal,tax,tip);
        double perPerson = pricePerPerson(grandTotal,numPeople);
        int leftOvers = determineLeftOvers(trays,numPeople);

        System.out.println("Price for " + numPeople + " people (" + trays + " trays): " + String.format("%.2f", subtotal));
        System.out.format("Tax: %.2f",tax);
        System.out.println();
        System.out.format("Tip: %.2f", tip);
        System.out.println();
        System.out.format("Total (food, tax, tip): %.2f", grandTotal);
        System.out.println();
        System.out.format("Price per person: %.2f",perPerson);
        System.out.println();
        System.out.println("Leftover Servings for the delivery person: " + leftOvers);

    }


}
