/**
 * Created by YitzchakMushkin on 14/05/2016.
 */
public class Dish implements IDish{
    String name;
    int calories;
    IResturant resturant;

    Dish(IResturant resturant, String name, int Calories){
        this.name = name;
        this.calories = calories;
        this.resturant = resturant;
    }

    public IResturant getResturant(){
        return resturant;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }
}
