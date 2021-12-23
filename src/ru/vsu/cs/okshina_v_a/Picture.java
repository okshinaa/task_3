package ru.vsu.cs.okshina_v_a;

import ru.vsu.cs.okshina_v_a.figures.Line;
import ru.vsu.cs.okshina_v_a.figures.HorizontalParabola;
import ru.vsu.cs.okshina_v_a.figures.Circle;
import ru.vsu.cs.okshina_v_a.figures.Rectangle;

public class Picture {
    private final Line L;
    private final HorizontalParabola HP;
    private final Circle C;
    private final Rectangle R;

    public Picture(Line L, HorizontalParabola HP, Circle C, Rectangle R) {
        this.L = L;
        this.HP = HP;
        this.C = C;
        this.R = R;
    }

    public SimpleColor getColor(double x, double y) {
        if (C.isPointInsideCircle(x, y) || (!C.isPointInsideCircle(x, y) && R.isPointInsideRectangle(x, y) && x < 0)) {
            return SimpleColor.BLUE;
        } else if (!C.isPointInsideCircle(x, y) && R.isPointInsideRectangle(x,y) && x > 0) {
            return SimpleColor.GRAY;
        } else if (!L.isPointAboveLine(x, y) && !R.isPointInsideRectangle(x, y)) {
            return SimpleColor.GREEN;
        } else if (L.isPointAboveLine(x, y) && HP.isPointLeftOfParabola(x, y)) {
            return SimpleColor.BLUE;
        } else return SimpleColor.ORANGE;
    }
}

