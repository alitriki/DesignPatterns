package org.winside.patterns.creation.factory;

public class EnemyFactory {
    public Enemy createEnemy(EnemyType type, EnemyDifficulty difficulty) {
        return switch (type) {
            case SIMPLE -> new SimpleEnemy(difficulty);
            case BOSS -> new BossEnemy(difficulty);
        };
    }
}
