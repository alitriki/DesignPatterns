package org.winside.patterns.creation.factory;

public class SimpleEnemy implements Enemy{
    private int health;
    private int attackPower;

    public SimpleEnemy(EnemyDifficulty difficulty) {
        this.health = 100 * difficultyMultiplier(difficulty);
        this.attackPower = 10 * difficultyMultiplier(difficulty);
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
        return random.nextInt(attackPower + 1);
    }

    @Override
    public void defend(int damage) {
        health -= damage;
    }

    @Override
    public String useSpecialMove() {
        return "SimpleEnemy: No special moves available";
    }

    private int difficultyMultiplier(EnemyDifficulty difficulty) {
        return switch (difficulty) {
            case EASY -> 1;
            case MEDIUM -> 2;
            case HARD -> 3;
            };
    }
}
