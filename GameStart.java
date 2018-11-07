package team.redrock.base;

public class GameStart {
    Hunter hunter;
    Monster m1,m2,m3,m4,m5,m6;

    public GameStart(){
        hunter = new Hunter("GodV","那一箭");
        m1 = new Monster(1);
        m2 = new Monster(2);
        m3 = new Monster(3);
        m4 = new Monster(4);
        m5 = new Monster(5);


    }
    public void start(){

        while(hunter.isLive && (m1.isLive || m2.isLive || m3.isLive || m4.isLive || m5.isLive)){
            System.out.println("------------------对手寻找中---------------------");
            int ran = GameUtil.randomaRange(1,6);
            switch(ran){
                case 1: hunter.fight(m1);   break;
                case 2: hunter.fight(m2);   break;
                case 3: hunter.fight(m3);   break;
                case 4: hunter.fight(m4);   break;
                case 5: hunter.fight(m5);   break;

                default:System.out.println("这里没有怪兽啦");     break;
            }
        }
        end();
    }
    public void end(){
        if(hunter.isLive == true){
            System.out.println("来自ClearLove7的祝贺，7777777，恭喜你！过关啦");
        }else{
            System.out.println("哈哈哈哈哈哈，被怪兽打死了吧");
        }
    }
}
