package net.shivam.javacodes.day3;

public class MonsterCaller {
	public static void main(String[] args) {
		Monster.buildBattleBoard();
		char[][] tempBattleBoard = new char[10][10];
		Monster[] Monsters = new Monster[4];
		Monsters[0] = new Monster(1000, 20, 1, "Frank");
		Monsters[1] = new Monster(500, 40, 2, "Drac");
		Monsters[2] = new Monster(1000, 20, 1, "Paul");
		Monsters[3] = new Monster(1000, 20, 1, "George");
		Monster.redrawBoard();
	}

}
