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

        //zmrzlina
      nakresliKruh(200,200,1.5,Color.MAGENTA);
      zofka.turnLeft(90);
             nakresliRovnostrannyTrojuhelnik(220,200,210,Color.orange);
        zofka.turnRight(90);



        //sněhulák - přidala jsem mu hrnec, oči, knoflíky a mrkev
        zofka.turnLeft(90);
        nakresliKruh(400,50,1.0,Color.CYAN);
        nakresliKruh(400,170,1.3,Color.CYAN);
        nakresliKruh(400,320,1.5,Color.CYAN);
        nakresliKruh(280,200,0.7,Color.CYAN);
        nakresliKruh(520,200,0.7,Color.CYAN);
        zofka.setPenColor(Color.orange);
        zofka.setLocation(400,100);
        zofka.move(10);
        nakresliCtvrec(425,50,50,Color.DARK_GRAY);
        zofka.turnRight(90);
        zofka.setLocation(380,85);
        zofka.move(1);
        zofka.setLocation(420,85 );
        zofka.move(1);
        zofka.setLocation(400,200);
        for (int i =0; i<7; i++){zofka.move(1);
        double a = zofka.getY();
        zofka.setY(a*1.15);}



        //mašinka + komínek a kouř
        nakresliObdelnik(900,400,250,150,Color.DARK_GRAY);
        zofka.turnRight(180);
        nakresliKruh(900,400,1.34,Color.DARK_GRAY);
        zofka.turnRight(90);
        nakresliObdelnik(900,400,200,120,Color.BLUE);
        nakresliKruh(850,400,0.6,Color.DARK_GRAY);
        nakresliKruh(750,400,0.6, Color.DARK_GRAY);
        zofka.turnRight(90);
        nakresliRovnoramennyPravouhlyTrojuhelnik(700,420,100,Color.RED);
        nakresliObdelnik(750,280,60,30,Color.DARK_GRAY);

        nakresliKour(752,220,3,Color.BLACK);
        nakresliKour(772,220,5,Color.BLACK);


    }

    private void nakresliKour(double startX, double startY, int pocetOblacku,Color barva) {
        zofka.setLocation(startX,startY);
        zofka.setPenColor(barva);
        for (int i=0; i<pocetOblacku;i++){
            for (int a = 0; a < 90; a++) {
                zofka.move(0.5);
                zofka.turnRight(1);
            }
            zofka.turnLeft(90);
        }
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
