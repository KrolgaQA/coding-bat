package logic2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if(big==goal/5&small>=goal%5){
            return goal-big*5;
        }else if(big*5<goal&goal-big*5<=small){
            return goal-big*5;
        }else if(big>goal/5&small>=goal%5){
            return goal%5;
        }
        return -1;


    }
}
