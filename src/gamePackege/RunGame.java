package gamePackege;

import gamePackege.game.Game;
import gamePackege.game.Player;

import java.util.Scanner;

public class RunGame {

    public static void main (String[] args) {

//        1 - enter Name of player
        Scanner scanner = new Scanner (System.in);
        String name = scanner.next ();
        Player player = new Player (name, 0);

//        2 - Randomize of Question and Print
        Game game = new Game ();
    }
}
