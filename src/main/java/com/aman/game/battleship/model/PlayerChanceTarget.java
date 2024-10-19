package com.aman.game.battleship.model;

import com.aman.game.battleship.model.player.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PlayerChanceTarget {

    final Player targetPlayer;
    final Coordinate target;
}
