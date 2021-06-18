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
        if (scorePlayer1 < 4 && scorePlayer2 < 4 && !(scorePlayer1 + scorePlayer2 == 6)) {
            String[] pointWords = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            stringResult = pointWords[scorePlayer1];
            return (scorePlayer1 == scorePlayer2) ? stringResult + "-All" : stringResult + "-" + pointWords[scorePlayer2];
        } else {
            if (scorePlayer1 == scorePlayer2)
                return "Deuce";
            stringResult = scorePlayer1 > scorePlayer2 ? namePlayer1 : namePlayer2;
            return ((scorePlayer1 - scorePlayer2)*(scorePlayer1 - scorePlayer2) == 1) ? "Advantage " + stringResult : "Win for " + stringResult;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName)) {
            this.scorePlayer1 += 1;
        } else {
            this.scorePlayer2 += 1;
        }

    }

}
