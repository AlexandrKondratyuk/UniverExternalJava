package ua.sankoniks.entities;

import ua.sankoniks.utility.*;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания базового класса Point
 */

public class Point extends Figure implements Cloneable {

    @Override
    protected Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + getX() + ", y=" + getY() + "]";
    }
}
