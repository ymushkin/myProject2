/**
 * Created by YitzchakMushkin on 14/05/2016.
 */
public class LunchRecommand {
    public IDish getTodaysOffer(){
        return new CaptainCurry().dishes[0];
    }

}
