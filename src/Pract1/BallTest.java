package Pract1;

public class BallTest {
    public  static void main(String[] args){
        Ball b1 = new Ball("Ball fire", 15);
        Ball b2 = new Ball("Ball dragon");
        Ball b3 = new Ball();
        Ball b4 = new Ball("Ball car", 20,"yellow");
        b3.setColor("black");
        b2.setSize(1);
        b2.setColor("red");
        b1.setColor("blue");
        System.out.println(b4);
        System.out.println(b3);
        System.out.println(b2);
        System.out.println(b1);
    }
}
