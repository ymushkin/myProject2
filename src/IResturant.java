/**
 * Created by YitzchakMushkin on 11/05/2016.
 */

import java.util.List;

public interface IResturant {
    String getName();
    String getChefName();
    String getAddress();
    List<IDish> getDishes();
}
