package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void whenPosition() {
        BishopBlack bishop = new BishopBlack(Cell.A5);
        assertEquals(Cell.A5, bishop.position());
    }

    @Test
    public void whenCopy() {
        BishopBlack bishop = new BishopBlack(Cell.A5);
        BishopBlack newBishop = (BishopBlack) bishop.copy(Cell.A5);
        assertEquals(Cell.A5, newBishop.position());
    }

    @Test
    public void whenWayC1G5() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] way = bishop.way(Cell.G5);
        Cell[] exp = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(exp, way);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveNotDiagonal() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        bishop.way(Cell.A5);
    }
}