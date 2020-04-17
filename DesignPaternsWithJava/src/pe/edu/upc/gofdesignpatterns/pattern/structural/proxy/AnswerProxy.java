package pe.edu.upc.gofdesignpatterns.pattern.structural.proxy;

import pe.edu.upc.gofdesignpatterns.pattern.structural.decorator.AnswerGenerator;
import pe.edu.upc.gofdesignpatterns.pattern.structural.decorator.Queryable;

import java.util.HashMap;
import java.util.Map;

public class AnswerProxy implements Queryable {
    private final AnswerGenerator answerGenerator;

    private final Map<String, String> answersCache;

    public AnswerProxy(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator;
        answersCache = new HashMap<>();
    }

    @Override
    public String giveAnswerTo(String question) {
        if(isCached(question)) {
            System.out.println("There is a cached answer.");
            return answersCache.get(question);
        }
        return findInGenerator(question);
    }

    private boolean isCached(String question) {
        return answersCache.get(question) != null;
    }

    private String findInGenerator(String question) {
        System.out.println("No cached answer found.");
        String answer = answerGenerator.giveAnswerTo(question);
        if(answer != null ) {
            System.out.println("Caching answer");
            answersCache.put(question, answer);
        }
        return answer;
    }
}
