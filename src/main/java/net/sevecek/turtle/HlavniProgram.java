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
            zelva.move(60);
            zelva.turnRight(45);

        }

        zelva.penUp();
    }

    static void nakresliKruh(Turtle zelva) {

        zelva.penDown();

        for (int i = 0; i < 18; i++) {
            zelva.move(26);
            zelva.turnRight(20);
        }

        zelva.penUp();
    }

    private static void nakresliPaprsek(Turtle zelva, int delkaPaprsku) {
        zelva.turnLeft(90);
        zelva.move(delkaPaprsku);
        zelva.turnLeft(180);
        zelva.move(delkaPaprsku);
        zelva.turnLeft(90);
    }

    static void nakresliSlunicko(Turtle zelva) {

        zelva.penDown();

        for (int i = 0; i < 18; i++) {
            zelva.move(15);

            nakresliPaprsek(zelva, 30);

            zelva.turnRight(20);
        }

        zelva.penUp();
    }

    static void nakresliDomecek(Turtle zelva) {

        zelva.penDown();

        zelva.move(130);
        zelva.turnRight(90);
        zelva.move(100);
        zelva.turnRight(90);
        zelva.move(130);
        zelva.turnRight(90);
        zelva.move(100);

        //strecha
        zelva.turnLeft(120);
        zelva.move(100);
        zelva.turnLeft(120);
        zelva.move(100);

        //vychozi pozice
        zelva.turnRight(150);

        zelva.penUp();
    }

    static void nakresliUlici(Turtle zelva) {

        for (int i = 0; i < 5; i++) {
            zelva.turnRight(90);
            zelva.move(250);
            zelva.turnRight(90);

            nakresliDomecek(zelva);
        }
    }

    static void nakresliPismenoJ(Turtle zelva) {

        zelva.penDown();

        zelva.move(20);
        zelva.turnRight(180);
        zelva.move(20);
        zelva.turnLeft(90);
        zelva.move(45);
        zelva.turnLeft(90);
        zelva.move(105);
        zelva.turnLeft(180);
        zelva.move(105);

        zelva.penUp();
        zelva.turnLeft(90);
        zelva.move(15);
        zelva.turnLeft(90);
    }

    static void nakresliPismenoA(Turtle zelva) {

        zelva.penDown();

        zelva.turnRight(20);
        zelva.move(110);
        zelva.turnRight(140);
        zelva.move(60);
        zelva.turnRight(110);
        zelva.move(40);
        zelva.turnRight(180);
        zelva.move(40);
        zelva.turnRight(70);
        zelva.move(50);

        zelva.penUp();
        zelva.turnLeft(70);
        zelva.move(15);
        zelva.turnLeft(90);
    }

    static void nakresliPismenoN(Turtle zelva) {

        zelva.penDown();

        zelva.move(105);
        zelva.turnRight(155);
        zelva.move(115);
        zelva.turnLeft(155);
        zelva.move(105);
        zelva.turnRight(180);
        zelva.move(105);

        zelva.penUp();
        zelva.turnLeft(90);
        zelva.move(15);
        zelva.turnLeft(90);
    }

    static void nakresliJmeno(Turtle turtle) {
        nakresliPismenoJ(turtle);
        nakresliPismenoA(turtle);
        nakresliPismenoN(turtle);
        nakresliPismenoA(turtle);
    }

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(400);
        zofka.turnLeft(180);

        nakresliPrasatko(zofka);

        zofka.move(350);

        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);

//        nakresliOsmiuhelnik(zofka);

        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);

//        nakresliKruh(zofka);

        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnLeft(90);

        nakresliSlunicko(zofka);

        zofka.turnRight(180);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnLeft(90);

        nakresliDomecek(zofka);

        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(90);

        nakresliUlici(zofka);

        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(200);

        nakresliDomecek(zofka);

        zofka.move(400);

        nakresliJmeno(zofka);
        }
}

