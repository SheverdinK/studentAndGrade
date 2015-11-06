package gamePackege.question;

public class Question {

    private  String question;
    private  int point;
    private  int level;


    public Question (String name, int point, int level) {
        this.question = name;
        this.point = point;
        this.level = level;
    }

    public String getQuestion () {
        return question;
    }
}
