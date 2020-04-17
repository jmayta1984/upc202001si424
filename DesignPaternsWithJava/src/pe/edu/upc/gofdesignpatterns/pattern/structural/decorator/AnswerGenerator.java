package pe.edu.upc.gofdesignpatterns.pattern.structural.decorator;

import java.util.HashMap;
import java.util.Map;

public class AnswerGenerator implements Queryable {

    private final Map<String, String> answers;

    public AnswerGenerator() {
        this.answers = new HashMap<>();
    }

    public void addAnswer(String question, String answer) {
        answers.put(question, answer);
    }

    @Override
    public String giveAnswerTo(String question) {
        return answers.get(question);
    }
}
