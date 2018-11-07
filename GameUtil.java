package team.redrock.base;

public class GameUtil {
    public static int randomaRange(int start,int end){
        return (int)(Math.random()*(end-start)+start);
    }

    static int lostBasicLife = 10;
    public static int calLostLife(int attack,int defend){
        int lostLife = attack-defend;
        int rel = 0;
        if(lostLife<=0){
            rel = lostBasicLife;
        }else{
            rel = (lostLife+lostBasicLife);
        }
        return rel;
    }
}

