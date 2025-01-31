package de.mat2095.my_slither;


class Prey {

    double x, y;
    int dir;
    double wang, ang;
    double sp;
    private final double size;
    private final long spawnTime;

    /**
     * Following code is used to save inputs to local variables of the same name.
     * @param x - x Coordinate of prey
     * @param y - y Coordinate of prey
     * @param size - Prey size as double
     * @param dir - ?? Double
     * @param wang - ?? Double
     * @param ang - angle of prey
     * @param sp - ?? Double
     */
    Prey(double x, double y, double size, int dir, double wang, double ang, double sp) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.dir = dir;
        this.wang = wang;
        this.ang = ang;
        this.sp = sp;
        this.spawnTime = System.currentTimeMillis();
    }

    /**
     * Calculates and returns the radius of prey
     * @return Radius
     */
    double getRadius() { // TODO: factor? (Original Dev)
        double fillRate = (System.currentTimeMillis() - spawnTime) / 1200.0;
        if (fillRate >= 1) {
            return size;
        } else {
            return (1 - Math.cos(Math.PI * fillRate)) / 2 * size;
        }
    }
}
