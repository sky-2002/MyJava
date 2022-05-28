public class FlourPacker {

    public static boolean canPack(int bigCount,int smallCount,int goal){
        if (bigCount<0 || smallCount<0 || goal<0)
            return false;
        if (smallCount>=goal)
            return true;
        int big = goal/5;
        int rem = goal%5;
        if (big<=bigCount && smallCount>=rem)
            return true;
        else if (big>bigCount){
            if (smallCount>=goal-5*bigCount)
                return true;
            else
                return false;
        }

        return false;
    }

}
