package com.trishul.model.people;


import com.trishul.exception.InvalidMatch;
import com.trishul.model.match.Ball;
import com.trishul.model.match.ScoreCard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Scorer extends Person {
    public Scorer(String name) {
        super(name);
    }

    public void setScore(Ball ball, String match, int innings) throws InvalidMatch {
        ScoreCard scoreCard = ScoreCard.INSTANCE(match, innings);
        scoreCard.setScoreCardForBall(ball);
    }
}
