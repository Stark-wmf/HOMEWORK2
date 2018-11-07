package team.redrock.skills;

import team.redrock.base.*;
import team.redrock.base.buff.Buff;
import team.redrock.base.buff.Dizzy;
import team.redrock.base.buff.Poison;
import team.redrock.base.buff.Slient;

/**
 * @Description
 * @Author 余歌
 * @Date 2018/10/31
 **/
public class slience extends SlienceSkill implements Slient {

    private static final String NAME = "悄悄地，打枪的不要！";
    private static final int damage = 666;
    private static final int   Slience_TIME=7;

    public slience() {
        super(NAME, damage);
    }

    @Override
    public int getTime() { return Slience_TIME;}



}