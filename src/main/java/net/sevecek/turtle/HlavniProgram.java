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

        //vychozi pozice
        zelva.turnLeft(60);
        zelva.penUp();

    }

    static void nakresliOsmiuhelnik(Turtle zelva) {

        zelva.penDown();

        for (int i = 0; i < 8; i++) {
            zelva.turnRight(45);
            zelva.move(60);
        }

        //vychozi pozice
        zelva.turnRight(90);
        zelva.penUp();
    }

    static void nakresliKruh(Turtle zelva) {

        zelva.penDown();

        for (int i = 0; i < 20; i++) {
            zelva.move(26);
            zelva.turnRight(20);
        }
        //vychozi pozice
        zelva.turnLeft(130);
        zelva.penUp();
    }

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

       /* zofka.penUp();
        zofka.turnRight(180);
        zofka.move(200);
        zofka.turnLeft(180);

        nakresliPrasatko(zofka);

        zofka.move(200);

        nakresliPrasatko(zofka);*/

        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(300);

        nakresliOsmiuhelnik(zofka);

        zofka.move(145);
        zofka.turnRight(90);
        zofka.move(250);

        nakresliKruh(zofka);
        }
    }

