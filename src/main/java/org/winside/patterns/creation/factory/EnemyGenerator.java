package org.winside.patterns.creation.factory;

public class EnemyGenerator {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();

        // Create enemies
        Enemy enemy1 = enemyFactory.createEnemy(EnemyType.SIMPLE, EnemyDifficulty.EASY);
        Enemy enemy2 = enemyFactory.createEnemy(EnemyType.BOSS, EnemyDifficulty.MEDIUM);

        // Display enemy information
        displayEnemyInformation(enemy1);
        displayEnemyInformation(enemy2);

        // Simulate attacks
        simulateAttack(enemy1, enemy2);
        simulateAttack(enemy2, enemy1);
    }

    public static void displayEnemyInformation(Enemy enemy) {
        System.out.println("Health: " + enemy.getHealth());
        System.out.println("Attack Power: " + enemy.getAttackPower());
        System.out.println("Special Attack: " + enemy.useSpecialMove());
        System.out.println();
    }

    public static void simulateAttack(Enemy attacker, Enemy defender) {
        int attackPower = attacker.attack();
        defender.defend(attackPower);
    }
}