package com.aman.game.battleship.io.output;

import com.aman.game.battleship.model.player.Player;

import java.util.List;

public interface IOutputPrinter {

    void printMsg(String msg);
    void printWinner(Player player);
    void printSelfBoard(Player player);
    void printOpponentBoard(List<Player> allPlayers, Player currentPlayer);
}