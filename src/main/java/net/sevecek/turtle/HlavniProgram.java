package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.penDown();

        //predni nohy
        zofka.turnLeft(135);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);

        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);

        zofka.turnRight(135);
        zofka.move(200);

        //zadni nohy
        zofka.turnRight(135);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);

        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);

        zofka.turnRight(45);
        zofka.move(100);

        zofka.turnLeft(90);
        zofka.move(200);

        zofka.turnLeft(90);
        zofka.move(100);

        //hlava
        zofka.turnRight(120);
        zofka.move(100);

        zofka.turnRight(120);
        zofka.move(100);
        }
    }

