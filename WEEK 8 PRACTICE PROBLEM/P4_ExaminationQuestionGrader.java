class Question {
    protected String questionText;
    protected String correctAnswer;
    protected String studentAnswer;
    protected int points;

    public Question(String questionText, String correctAnswer, String studentAnswer, int points) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public double calculateScore() {
        return 0.0;
    }
}

class MCQ extends Question {
    public MCQ(String questionText, String correctAnswer, String studentAnswer, int points) {
        super(questionText, correctAnswer, studentAnswer, points);
    }

    @Override
    public double calculateScore() {
        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }
        return 0.0;
    }
}

class TF extends Question {
    public TF(String questionText, String correctAnswer, String studentAnswer, int points) {
        super(questionText, correctAnswer, studentAnswer, points);
    }

    @Override
    public double calculateScore() {
        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }
        return 0.0;
    }
}

class Essay extends Question {
    public Essay(String questionText, String correctAnswer, String studentAnswer, int points) {
        super(questionText, correctAnswer, studentAnswer, points);
    }

    @Override
    public double calculateScore() {
        String[] keywords = correctAnswer.split(",");
        int matchCount = 0;
        String studentLower = studentAnswer.toLowerCase();
        
        for (String kw : keywords) {
            if (studentLower.contains(kw.trim().toLowerCase())) {
                matchCount++;
            }
        }
        
        if (matchCount >= 2) {
            return points * 0.75;
        } else if (matchCount == 1) {
            return points * 0.50;
        }
        return 0.0;
    }
}

public class P4_ExaminationQuestionGrader {
    public static void main(String[] args) {
        Question[] questions = {
            new MCQ("What is the capital of France?", "Paris", "Paris", 10),
            new TF("The Earth is flat?", "False", "True", 5),
            new Essay("Name two primary OOP principles.", "Inheritance, Polymorphism, Encapsulation", "Polymorphism is one.", 20),
            new Essay("Describe abstraction and composition.", "Abstraction, Composition", "I talked about abstraction.", 15)
        };
        
        double totalScore = 0;
        
        System.out.printf("MCQ: %.2f\n", questions[0].calculateScore());
        System.out.printf("TF: %.2f\n", questions[1].calculateScore());
        System.out.printf("ESSAY: %.2f\n", questions[2].calculateScore());
        System.out.printf("ESSAY: %.2f\n", questions[3].calculateScore());
        
        for (Question q : questions) {
            totalScore += q.calculateScore();
        }
        
        System.out.printf("Total Score: %.2f\n", totalScore);
    }
}
