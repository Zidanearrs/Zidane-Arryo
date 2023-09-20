import greenfoot.*; 

public class Fish extends Actor {
    private int speed = 2;
    private int rotationSpeed = Greenfoot.getRandomNumber(10) + 1; 

    public void act() {
        moveSmoothly();
        checkEdge();
    }

    private void moveSmoothly() {
        if (Greenfoot.getRandomNumber(100) < 2) {
            turn(Greenfoot.getRandomNumber(91) - 45);
        }

        move(speed);
    }

    private void checkEdge() {
        if (isAtEdge()) {
            turn(180); 
        }
    }
}

