package de.mat2095.my_slither;

import java.awt.*;

/**
 * This class gets and sets the co-ords, size and spawn type of food
 */
class Food {

    final int x, y;
    private final double size;
    private final double rsp;
    private final long spawnTime;
    private final Color colour;
    /**
     * Following code is used to save inputs to local variables of the same name.
     * @param x - x Coordinate
     * @param y - y Coordinate
     * @param size - size of food as double
     * @param fastSpawn - boolean to enable spawntype
     * @param colour = the colour of the food
     */
    Food(int x, int y, double size, boolean fastSpawn,Color colour) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.rsp = fastSpawn ? 4 : 1;
        this.colour = colour;
        spawnTime = System.currentTimeMillis();
    }

    double getSize() {
        return size;
    }
    Color getColour(){ return colour;}
    double getRadius() {
        double fillRate = rsp * (System.currentTimeMillis() - spawnTime) / 1200;
        if (fillRate >= 1) {
            return size;
        } else {
            return (1 - Math.cos(Math.PI * fillRate)) / 2 * size;
        }
    }
}
