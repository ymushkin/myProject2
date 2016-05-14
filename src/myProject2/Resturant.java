package myProject2;

import java.util.List;

/**
 * Created by YitzchakMushkin on 15/05/2016.
 */
public class Resturant implements IResturant {

    Resturant(String name, String chefName, String address, List<IDish> dishes){
        this.name = name;
        this.chefName = chefName;
        this.address = address;
        this.dishes = dishes;
    }

    String name;
    String chefName;
    String address;
    List<IDish> dishes;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getChefName() {
        return chefName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public List<IDish> getDishes() {
        return dishes;
    }
}
