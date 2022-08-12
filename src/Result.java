package src;

public class Result {
    private byte lives = 6;
    public byte getLives(){
        return this.lives;
    }
    public void reduceLives(){
        this.lives --;
    }
}
