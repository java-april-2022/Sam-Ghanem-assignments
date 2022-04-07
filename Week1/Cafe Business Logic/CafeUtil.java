import java.util.ArrayList;
public class CafeUtil {
    // int getStreakGoal()
// Cafe Java wants to implement a reward system for customers who always buy more drinks than 
// they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums 
// together every consecutive integer from 1 to 10 and returns the sum.
// In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.
// Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.
// Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.
    public int getStreakGoal(){
        int sum = 0;
        for (int x = 1; x <= 10; x++ ){
            sum = sum + 1;
        }
        return sum;
    }
    // double getOrderTotal(double[] prices)
    // Given an array of item prices from an order,
    // sum all of the prices in the array and return the total. 
    // Don't forget to test your code! Find the lines of test code for
    // this method in TestCafe.java and uncomment it before you compile and run.
    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for (int idx = 0; idx < lineItems.length; idx++) {
            sum += lineItems[idx];
        }
        return sum;
        // for (double price : lineItems ){
        //     sum = sum + price;
            
            
        }
    public void displayMenu(ArrayList<String> menuItems){
        for (int idx = 0; idx < menuItems.size(); idx++){
            System.out.printf("%s %s \n",idx,menuItems.get(idx));

        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter yout name!!!!");
        String userName = System.console().readLine();
        System.out.printf("Hello %s ",userName);
        System.out.printf("There is %s customers ahead of you.",customers.size());
        customers.add(userName);
        


    }

}