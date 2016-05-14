package myProject2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by YitzchakMushkin on 14/05/2016.
 */
public class CaptainCurry implements IResturant {
    CaptainCurry()
    {
    }

    IDish[] dishes = new IDish[]{new Dish(this, "Ramen", 534)};

    @Override
    public String getName() {
        return "Captain Curry";
    }

    @Override
    public String getChefName() {
        return "Roshfeld";
    }

    @Override
    public String getAddress() {
        return "Sharona Market";
    }

    @Override
    public List<IDish> getDishes() {
        return Arrays.asList(dishes);
    }
}
