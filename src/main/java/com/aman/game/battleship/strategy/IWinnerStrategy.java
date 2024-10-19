package com.aman.game.battleship.strategy;

import com.aman.game.battleship.model.player.Player;

import java.util.List;

public interface IWinnerStrategy {

    Player getWinner(List<Player> playerList);
}
