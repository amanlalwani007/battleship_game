package com.aman.game.battleship.model.boundary;

import com.aman.game.battleship.model.Coordinate;
import lombok.NonNull;

import java.util.List;

public interface IBoundary {

    boolean contains(@NonNull Coordinate coordinate);
    List<Coordinate> allCoordinates();
}
