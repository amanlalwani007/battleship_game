package com.aman.game.battleship.strategy;

import com.aman.game.battleship.model.player.Player;

import java.util.List;

public interface IPlayerPickingStrategy {

    Integer firstPlayer(List<Player> allPlayers);
    Integer pickNextPlayer(Integer currentPlayerIndex, List<Player> allPlayers);
}
