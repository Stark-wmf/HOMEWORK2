package team.redrock.base;



public class SlienceSkill extends Skill {
    private int damage;
    public SlienceSkill(String name,int damage){
        super(name,damage/5);
        this.damage=damage;

    }
    @Override
    public final int cast(Hero hero) {
        hero.reduceHp(damage);
        return damage;
    }




    }


