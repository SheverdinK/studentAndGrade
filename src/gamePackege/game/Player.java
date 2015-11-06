package gamePackege.game;

public class Player {

    private String name;
    private int totalPoint;

    public Player (String name, int totalPoint) {
        setName (name);
        setTotalPoint (totalPoint);
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getTotalPoint () {
        return totalPoint;
    }

    public void setTotalPoint (int totalPoint) {
        this.totalPoint = totalPoint;
    }
}
