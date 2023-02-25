package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();


        nakresliRovnostrannyTrojuhelnik(150,150,100, Color.cyan);
        nakresliCtvrec(300,300,100, Color.MAGENTA);


    }
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
