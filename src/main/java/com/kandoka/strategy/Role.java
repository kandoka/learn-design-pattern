package com.kandoka.strategy;

/**
 * @Description 抽象角色
 * @Author kandoka
 * @Date 2022/10/20 19:54
 */
public abstract class Role {
    protected String name;
    protected IAttackBehavior attackBehavior;
    protected IDefendBehavior defendBehavior;
    public Role(String name, IAttackBehavior attackBehavior, IDefendBehavior defendBehavior) {
        this.name = name;
        this.attackBehavior = attackBehavior;
        this.defendBehavior = defendBehavior;
    }

    protected void attack() {
        attackBehavior.attack();
    }
    protected void defend() {
        defendBehavior.defend();
    }
}
