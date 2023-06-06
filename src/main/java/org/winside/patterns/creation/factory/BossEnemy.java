package org.winside.patterns.creation.factory;

public class BossEnemy implements Enemy {
    private int health;
    private final int attackPower;
    private final String specialMove;

    public BossEnemy(EnemyDifficulty difficulty) {
        this.health = 200 * difficultyMultiplier(difficulty);
        this.attackPower = 20 * difficultyMultiplier(difficulty);
        this.specialMove = "Boss Smash";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public int attack() {
        return random.nextInt(attackPower / 2) + (attackPower / 2);
    }

    @Override
    public void defend(int damage) {
        health -= damage;
    }

    @Override
    public String useSpecialMove() {
        return "BossEnemy: Use special move - " + specialMove;
    }

    private int difficultyMultiplier(EnemyDifficulty difficulty) {
        return switch (difficulty) {
            case EASY -> 1;
            case MEDIUM -> 2;
            case HARD -> 3;
        };
    }
}
