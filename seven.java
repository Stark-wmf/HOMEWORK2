package team.redrock.skills;

import team.redrock.base.CureSkill;
import team.redrock.base.DamageSkill;
import team.redrock.base.Hero;
import team.redrock.base.UnbeatableSkill;
import team.redrock.base.buff.Buff;
import team.redrock.base.buff.Dizzy;
import team.redrock.base.buff.Poison;

/**
 * @Description
 * @Author 余歌
 * @Date 2018/10/31
 **/
public class seven extends UnbeatableSkill implements Poison {

    private static final String NAME = "万毒归宗！！!";
    private static final int DAMAGE = 777;
    private static final int Poison_TIME = 7;

    public seven() {
        super(NAME, DAMAGE);
    }

    @Override
    public int getTime() { return Poison_TIME;}



}