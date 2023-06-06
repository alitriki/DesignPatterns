package org.winside.patterns.creation.factory;

import java.util.Random;

public interface Enemy {
    Random random = new Random();
    int getHealth();
    int getAttackPower();
    int attack();
    void defend(int damage);
    String useSpecialMove();
}
