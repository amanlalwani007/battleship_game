package com.aman.game.battleship.strategy;

import com.aman.game.battleship.io.input.IInputProvider;
import com.aman.game.battleship.io.input.PlayerInput;
import com.aman.game.battleship.model.player.Player;
import com.aman.game.battleship.exceptions.InvalidInputException;
import com.aman.game.battleship.model.Coordinate;
import com.aman.game.battleship.model.PlayerChanceTarget;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
public class LocalChanceGeneration implements IChanceGenerationStrategy {

    private final IInputProvider inputProvider;

    @Override
    public PlayerChanceTarget getPlayerChanceTarget(@NonNull final List<Player> opponents) {
        final PlayerInput playerInput = inputProvider.takeInput();
        Player targetPlayer = null;
        for (Player player: opponents) {
            if (player.getId() == playerInput.getPlayerNum()) {
                targetPlayer = player;
            }
        }

        if (targetPlayer == null) {
            throw new InvalidInputException();
        }
        return new PlayerChanceTarget(targetPlayer, new Coordinate(playerInput.getTargetX(), playerInput.getTargetY()));
    }
}
