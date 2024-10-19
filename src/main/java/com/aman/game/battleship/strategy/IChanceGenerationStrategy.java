package com.aman.game.battleship.strategy;

import com.aman.game.battleship.model.player.Player;
import com.aman.game.battleship.model.PlayerChanceTarget;

import java.util.List;

public interface IChanceGenerationStrategy {

    PlayerChanceTarget getPlayerChanceTarget(List<Player> opponents);
}
