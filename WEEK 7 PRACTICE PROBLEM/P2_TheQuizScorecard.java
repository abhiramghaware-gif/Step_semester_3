public class P2_TheQuizScorecard {

    private final boolean[] results;
    private final int totalQuestions;
    private int answeredCount;

    public P2_TheQuizScorecard(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.results = new boolean[totalQuestions];
        this.answeredCount = 0;
    }

    public void recordAnswer(boolean correct) {
        if (answeredCount >= totalQuestions) {
            System.out.println("All questions already answered. Ignoring.");
            return;
        }
        results[answeredCount] = correct;
        answeredCount++;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < answeredCount; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        P2_TheQuizScorecard sc = new P2_TheQuizScorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("Score: " + sc.getScore());
    }
}
