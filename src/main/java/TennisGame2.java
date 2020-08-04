public class TennisGame2
{
    private int player1Point;
    private int player2Point;

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    private String translateScore(int score) {
        switch (score) {
            case 2:
                return "Thirty";
            case 1:
                return "Fifteen";
            case 0:
                return "Love";
        }
        return "Forty";
    }

    public String getScore(){
        String player1Result = "";
        String player2Result = "";
        String score = "";

        // Winner
        if (player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2) {
            return "Win for " + player1Name;
        }
        if (player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2) {
            return "Win for " + player2Name;
        }

        // Advantage
        if (player1Point > player2Point && player2Point >= 3) {
            return "Advantage " + player1Name;
        }
        if (player2Point > player1Point && player1Point >= 3) {
            return "Advantage " + player2Name;
        }

        // Deuce
        boolean isDeuce = player1Point == player2Point && player1Point >= 3;
        if (isDeuce) {
            return "Deuce";
        }

        // เสมอกัน
        boolean sameScoreNotDeuce = player1Point == player2Point && player1Point < 3;
        if (sameScoreNotDeuce)
        {
            score = translateScore(player1Point);
            score += "-All";
        }

        
        if (player1Point > 0 && player2Point ==0)
        {
            player1Result = translateScore(player1Point);
            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > 0 && player1Point ==0)
        {
            player2Result = translateScore(player2Point);

            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player1Point < 4)
        {
            player1Result = translateScore(player1Point);
            player2Result = translateScore(player2Point);
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > player1Point && player2Point < 4)
        {
            player2Result = translateScore(player2Point);
            player1Result = translateScore(player1Point);
            score = player1Result + "-" + player2Result;
        }


        return score;
    }


    public void player1Score(){
        player1Point++;
    }

    public void player2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        // be careful to edit "=="
        // if (player1.equals("player")) means NullPointerException (NPE)
        if ("player1".equals(player)) // means Null Safety
        {
            player1Score();
        } else {
            player2Score();
        }
    }
}
