package myProject2;

public class Main {

    public static void main(String[] args) {
        LunchRecommand lunchRecommand = new LunchRecommand();

        IDish todayDish = lunchRecommand.getTodaysOffer();

        System.out.println("Today we recommand to eat " + todayDish.getName() + " at " + todayDish.getResturant().getName());
    }
}
