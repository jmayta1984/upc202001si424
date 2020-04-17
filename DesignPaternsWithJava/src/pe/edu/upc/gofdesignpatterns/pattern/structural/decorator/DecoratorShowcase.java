package pe.edu.upc.gofdesignpatterns.pattern.structural.decorator;

import pe.edu.upc.gofdesignpatterns.common.Showcase;

public class DecoratorShowcase implements Showcase {

    private AnswerGenerator answerGenerator;
    private Queryable decoratedAnswerGenerator;

    public DecoratorShowcase() {

        answerGenerator = new AnswerGenerator();
        answerGenerator.addAnswer("How are you?", "Fine");
        answerGenerator.addAnswer("Who is the Apple CEO?", "Tim Cook");

        decoratedAnswerGenerator = new AnswerDecorator(answerGenerator);

    }

    @Override
    public void show() {
        System.out.println("Decorator Pattern Showcase");
        String notFindableQuestion = "Who is the Microsoft CEO?";
        String findableQuestion = "Who is the Apple CEO?";
        System.out.println(notFindableQuestion);
        System.out.println(decoratedAnswerGenerator.giveAnswerTo(notFindableQuestion));
        System.out.println(findableQuestion);
        System.out.println(decoratedAnswerGenerator.giveAnswerTo(findableQuestion));
    }
}
