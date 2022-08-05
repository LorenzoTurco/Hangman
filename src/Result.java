package src;

public class Result {
    private byte lives = 5;

    public void setLives(byte newLives){
        this.lives = newLives;
    }

    public byte getLives(){
        return this.lives;
    }

    public void reduceLives(){
        this.lives --;
    }
}
