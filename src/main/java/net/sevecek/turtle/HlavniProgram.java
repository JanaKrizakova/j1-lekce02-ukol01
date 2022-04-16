package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    static void nakresliPrasatko(Turtle zelva) {

        zelva.penDown();

        //predni nohy
        zelva.turnLeft(135);
        zelva.move(50);
        zelva.turnLeft(180);
        zelva.move(50);

        zelva.turnRight(90);
        zelva.move(50);
        zelva.turnLeft(180);
        zelva.move(50);

        zelva.turnRight(135);
        zelva.move(200);

        //zadni nohy
        zelva.turnRight(135);
        zelva.move(50);
        zelva.turnLeft(180);
        zelva.move(50);

        zelva.turnRight(90);
        zelva.move(50);
        zelva.turnLeft(180);
        zelva.move(50);

        zelva.turnRight(45);
        zelva.move(100);

        zelva.turnLeft(90);
        zelva.move(200);

        zelva.turnLeft(90);
        zelva.move(100);

        //hlava
        zelva.turnRight(120);
        zelva.move(100);

        zelva.turnRight(120);
        zelva.move(100);

    }

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliPrasatko(zofka);
        }
    }

