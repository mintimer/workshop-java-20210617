package com.example.hellospring.refactor;

public class TennisGame3 {

    private int scorePlayer1;
    private int scorePlayer2;
    private final String namePlayer1;
    private final String namePlayer2;

    public TennisGame3(String namePlayer1, String namePlayer2) {
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
    }

    public String getScore() {
        String stringResult;
        CheckScore checkScore = new CheckScore();
        if (checkScore.isNotDeuceYet()) {
            String[] pointWords = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            stringResult = pointWords[scorePlayer1];
            if (checkScore.isDraw()) {
                return stringResult + "-All";
            }
            return stringResult + "-" + pointWords[scorePlayer2];
        } else {
            if (checkScore.isDraw()) {
                return "Deuce";
            }

            if (scorePlayer1 > scorePlayer2) {
                stringResult = namePlayer1;
            } else stringResult = namePlayer2;

            if (checkScore.isAdvantage()) {
                return "Advantage " + stringResult;
            }
            return "Win for " + stringResult;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName)) {
            this.scorePlayer1 += 1;
        } else {
            this.scorePlayer2 += 1;
        }

    }

    private class CheckScore {
        public boolean isNotDeuceYet() {
            return scorePlayer1 < 4 && scorePlayer2 < 4 && !(scorePlayer1 + scorePlayer2 == 6);
        }

        public boolean isDraw() {
            return scorePlayer1 == scorePlayer2;
        }

        public boolean isAdvantage() {
            return (scorePlayer1 - scorePlayer2) * (scorePlayer1 - scorePlayer2) == 1;
        }
    }
}
