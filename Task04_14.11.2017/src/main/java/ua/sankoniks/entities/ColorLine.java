package ua.sankoniks.entities;

import ua.sankoniks.utility.Colored;

/**
 * @author Kondratyuk Olexandr
 *         <p>
 *         Класс для создания класса ColorLine, который наследуется от Line с добавлением нового параметра color
 */

public class ColorLine extends Line implements Colored {

    /**
     * @param color - цвет линии
     */
    private int color;

    public ColorLine(Point beg, Point end, int color) {
        super(beg, end);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine [color=" + color + ", Beg = " + getBeg() + ", End =" + getEnd() + "]";
    }

}
