package team.redrock.base;

public class Monster{
    int curLife;
    int maxLife;
    String type;
    boolean isLive = true;
    int attack;
    int defend;
    int agile;

    public Monster(int mt){
        switch(mt){
            case 1: type ="纳什男爵";maxLife = 180; curLife = 180;   attack = 25;defend = 15;    agile = 30;   break;
            case 2: type = "云端亚龙";maxLife =80; curLife =60; attack =20;defend =8;agile =50;break;
            case 3: type = "海洋亚龙";maxLife =80; curLife =60; attack =20;defend =10;agile =30;break;
            case 4: type = "炼狱亚龙"; maxLife = 80; curLife = 60; attack = 30; defend = 8; agile = 30;break;
            case 5: type = "山脉亚龙";maxLife =80; curLife =60; attack =20;defend =18;agile =20;break;


        }
    }

    public void injured(Hunter hunter){   //掉血


        System.out.println("**********"+type+"又被射了一箭"+"***********");
        int lostLife = GameUtil.calLostLife(hunter.attack, this.defend);
        curLife-=lostLife;
        if(curLife<0){
            curLife=0;
            died(hunter);
            return;
        }
        show();
        kill(hunter);
    }
    public void died(Hunter hunter){
        this.isLive = false;
        System.out.println("**********"+type+"被砍的四分五裂了"+"**********"+isLive);
        hunter.expAdd(this);    //this
    }
    public void kill(Hunter hunter){
        if(isLive){
            System.out.println("**********>"+type+"发动致命一击！！！，咬了"+hunter.name+"一大口"+"***********");
            hunter.injured(this);
        }else{
            System.out.println("**********"+type+"已经被砍的四分五裂了"+"**********");
        }
    }
    public void show(){
        System.out.println("**********"+type+"  "+"生命值"+curLife+"  "+"生命状态"+isLive+"***************");
    }
}
