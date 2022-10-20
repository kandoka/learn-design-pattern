package com.kandoka.strategy;

/**
 * @Description 勇士
 * @Author kandoka
 * @Date 2022/10/20 20:06
 */
public class WarriorRole extends Role {
    public WarriorRole() {
        super("勇士", new XFZAttackBehavior(), new DPGDDefendBehavior());
    }

    public static void main(String[] args) {
        Role role = new WarriorRole();
        role.attack();
        role.defend();
    }
}
