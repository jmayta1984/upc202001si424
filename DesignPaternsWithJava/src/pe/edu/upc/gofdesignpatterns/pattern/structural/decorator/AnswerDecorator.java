package pe.edu.upc.gofdesignpatterns.pattern.structural.decorator;

public class AnswerDecorator implements Queryable {

    private final Queryable answerGenerator;

    public AnswerDecorator(Queryable answerGenerator) {
        this.answerGenerator = answerGenerator;
    }

    @Override
    public String giveAnswerTo(String question) {
        String answer = answerGenerator.giveAnswerTo(question);
        if(answer == null) return "Sorry, I don't have the answer.";
        return String
                .format("That's a great question!, and the answer is %s", answer);

    }
}
