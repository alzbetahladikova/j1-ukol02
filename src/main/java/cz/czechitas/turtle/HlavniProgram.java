package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();


       /* cvicne nakreslene obrazce

        nakresliRovnoramennyPravouhlyTrojuhelnik(800,100,100,Color.ORANGE);
        nakresliRovnostrannyTrojuhelnik(150,150,100, Color.cyan);
        nakresliCtvrec(300,300,100, Color.MAGENTA);
        nakresliObdelnik(500, 500, 100, 200, Color.green);
        nakresliKruh(500,100,1,Color.BLUE);

        */


    }
    private void nakresliRovnoramennyPravouhlyTrojuhelnik (double startX, double startY, double delkaStrany, Color barva)
    { zofka.setPenColor(barva);
        zofka.setLocation(startX,startY);
      zofka.move(delkaStrany);
        zofka.turnLeft(135);
        var delkaPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));
        zofka.move(delkaPrepony);
        zofka.turnLeft(135);
        zofka.move(delkaStrany);
        zofka.turnLeft(90);}

    private void nakresliKruh (double startX, double startY,double polomer,Color barva){
        zofka.setPenColor(barva);
        zofka.setLocation(startX,startY);
        for (int i = 0; i < 360; i++) {
            zofka.move(polomer);
            zofka.turnLeft(1);
        }
    }
    private void nakresliObdelnik(double startX, double startY, double delkaStranyA, double delkaStranyB, Color barva){
        zofka.setPenColor(barva);
        zofka.setLocation(startX,startY);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }}
    private void nakresliCtvrec(double startX, double startY, double delkaStrany, Color barva){
            zofka.setPenColor(barva);
            zofka.setLocation(startX,startY);
        for (int i = 0; i < 4; i++) {
               zofka.move(delkaStrany);
               zofka.turnRight(90);}}

    private void nakresliRovnostrannyTrojuhelnik(double startX,double startY,double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        zofka.setLocation(startX,startY);
      for (int i =0; i<3;i++) {zofka.move(delkaStrany);
        zofka.turnLeft(120);
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
