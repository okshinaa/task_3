package ru.vsu.cs.okshina_v_a;

public class TestCase {
    public boolean isCorrectGetColor(Picture picture) {
        if ((picture.getColor(-1, -1) == SimpleColor.BLUE)
                && (picture.getColor(-2.5, -1) == SimpleColor.BLUE)
                && (picture.getColor(2.5, -2) == SimpleColor.GRAY)
                && (picture.getColor(-7, 5) == SimpleColor.GREEN)
                && (picture.getColor(7, 5) == SimpleColor.BLUE)
                && (picture.getColor(9, -7) == SimpleColor.ORANGE)
                && (picture.getColor(2, -8) == SimpleColor.GREEN)
                && (picture.getColor(8, -5) == SimpleColor.ORANGE)
                && (picture.getColor(0, 0) == SimpleColor.BLUE)
                && (picture.getColor(2, -2) == SimpleColor.GRAY)) {
            return true;
        } else return false;
    }
}
