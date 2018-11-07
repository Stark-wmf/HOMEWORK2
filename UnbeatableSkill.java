package team.redrock.base;

public class UnbeatableSkill extends Skill{
    private int poison;
    public UnbeatableSkill(String name,int poison){
        super(name,0);
        this.poison=  poison;
    }

    @Override
    public final int cast(Hero hero) {
        return poison;
    }
}


