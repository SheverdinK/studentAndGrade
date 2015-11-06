package gamePackege.game;

import gamePackege.question.American;
import gamePackege.question.Open;
import gamePackege.question.Question;
import gamePackege.question.YesOrNo;

import java.util.ArrayList;

public class GameData {

    static	ArrayList <Question> questionDB = new ArrayList<> ();

    static {
        questionDB.add(new American ("Q1?", 1, 2, new String[] {"q1Ans1","q1Ans2","q1Ans3","q1Ans4"}, 1));
        questionDB.add(new American("Q2?", 2, 2, new String[] {"q2Ans1","q2Ans2","q2Ans3","q2Ans4"}, 1));
        questionDB.add(new American ("Q3?", 3, 2, new String[] {"q3Ans1","q3Ans2","q3Ans3","q3Ans4"}, 1));

        questionDB.add(new YesOrNo ("Q4?", 1, 1, true));
        questionDB.add(new YesOrNo("Q5?", 2, 1, false));
        questionDB.add(new YesOrNo("Q6?", 3, 1, true));

        questionDB.add(new Open ("Q7?", 1, 3, "q7ans1"));
        questionDB.add(new Open("Q8?", 2, 3, "q7ans2"));
        questionDB.add(new Open("Q9?", 3, 3, "q7ans3"));
        questionDB.add(new Open("Q10?", 4, 3, "q7ans4"));

    }
}

