package team.redrock.base;



public class Hunter {   //Godv
    String name;
    int maxLife;
    int curLife;
    boolean isLive;
    String weapon;
    int attack;         //攻击力
    int defend;         //防御力
    int level;
    int exp;
    int agile;


    public Hunter(String name,String weapon){
        this.name = name;
        this.weapon = weapon;
        maxLife = 100;
        curLife = maxLife;
        isLive = true;
        attack = 25;
        defend = 10;
        level = 1;
        exp = 0;
        agile = 35;

    }
    public void fight(Monster monster){
        if(monster.isLive){
            if(isLive){
                System.out.println("--------->"+name+"无情的拿起"+weapon+"射向"+monster.type+"<----------------");
                monster.injured(this);
            }else{
                System.out.println("--------->"+"我们的主角"+name+"已经牺牲了"+"<----------------");
            }
        }else
        {
            System.out.println("这个地方的怪兽已清除！！！");
        }
    }

    public void injured(Monster monster){   //掉血
        //增加躲避的判断
        if(monster.type == "纳什男爵"){

            System.out.println("--------->"+name+":看我反向Q绕地球一圈反杀！！！"+"<---------");
            int lostLife = GameUtil.calLostLife(monster.attack, this.defend);
            curLife-=lostLife;
            if(curLife<0){
                curLife=0;
                died();
                return;
            }
            monster.curLife+=this.curLife/10;
            show();
            fight(monster);
        }else{

            System.out.println("--------->"+name+":反击风暴开启！！！"+"<---------");
            int lostLife = GameUtil.calLostLife(monster.attack, this.defend);
            curLife-=lostLife;
            if(curLife<0){
                curLife=0;
                died();
                return;
            }
            show();
            fight(monster);
        }
    }
    public void expAdd(Monster monster){
        this.exp+=monster.maxLife;
        int needExp = 0;
        for(int i=1;i<=level;i++){
            needExp+=i*50;
        }
        if(exp>=needExp){
            upgrade();
        }

    }
    public void upgrade(){
        attack+=3;
        defend+=2;
        maxLife+=10;
        curLife+=maxLife;
        level++;
        System.out.println("--------------------------分割线-------------------------");
        System.out.println("系统提示：升级啦，目前等级"+level+"血量"+curLife+"攻击力"+attack+"防御力"+defend);
    }
    public void died(){
        System.out.println("**********"+name+"被怪兽打死了"+"**********");
        isLive = false;
        show();
    }
    public void show(){
        System.out.println("---------->"+name+"  "+"生命值:"+curLife+"  "+
                "生命状态"+isLive+"   "+"等级"+level+"   "
                +"<-------------");
    }

}
