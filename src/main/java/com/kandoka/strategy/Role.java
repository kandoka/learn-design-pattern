package com.kandoka.strategy;

/**
 * @Description 抽象角色
 * @Author kandoka
 * @Date 2022/10/20 19:54
 */
public abstract class Role {
    /**
     * 角色名
     */
    protected String name;

    /**
     * 抽象攻击策略
     */
    protected IAttackBehavior attackBehavior;

    /**
     * 抽象防御策略
     */
    protected IDefendBehavior defendBehavior;

    /**
     * 由子类传入具体的策略实现方法
     * @param name 子类的角色名称
     * @param attackBehavior 抽象攻击策略，由子类决定具体策略
     * @param defendBehavior 抽象防御策略，由子类决定具体策略
     */
    public Role(String name, IAttackBehavior attackBehavior, IDefendBehavior defendBehavior) {
        this.name = name;
        this.attackBehavior = attackBehavior;
        this.defendBehavior = defendBehavior;
    }

    /**
     * 攻击，调用传入的攻击策略方法
     */
    protected void attack() {
        attackBehavior.attack();
    }

    /**
     * 防御，调用传入的防御策略
     */
    protected void defend() {
        defendBehavior.defend();
    }
}
