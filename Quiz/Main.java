import java.util.*;

import Java.IDE.Quiz.Questions;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz ();
        quiz.start();
    }
}

class Quiz {
    Scanner input = new Scanner(System.in);
    int correctCount = 0, wrongCount = 0;

    public void start() {
        Map <Questions, Character> answer = new HashMap <>();

        Questions q1 = new Questions("Which statement is true about Java?", 
            "a) Java is a sequence-dependent programming language",
            "b) Java is a code dependent programming language",
            "c) Java is a platform-dependent programming language",
            "d) Java is a platform-independent programming language"
        );
        Questions q2 = new Questions("What is the extension of java code files?",      
            "a) .js",
            "b) .txt",
            "c) .class",
            "d) .java"
        );

        Questions q3 = new Questions("Who invented Java Programming??", 
            "a) Guido van Rossum",
            "b) James Gosling",
            "c) Dennis Ritchie",
            "d) Bjarne Stroustrup"
        );    

        Questions q4 = new Questions("Which one of the following is not a Java feature?", 
            "a) Object-oriented",
            "b) Use of pointers",
            "c) Portable",
            "d) Dynamic and Extensible"
        );
        
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?", 
            "a) identifier & keyword",
            "b) identifier",
            "c) keyword",
            "d) none of the mentioned"
        );

        answer.put(q1,'D');
        answer.put(q2,'D');
        answer.put(q3,'B');
        answer.put(q4,'B');
        answer.put(q5,'C');

        for (Map.Entry<Questions, Character> map : answer.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your option : ");
            Character selectedOption = input.next().charAt(0);

            int correctAns = Character.compare(selectedOption,map.getValue());

            if (correctAns == 0) {
                System.out.println("Your option is Correct !...");
                correctCount ++;
            } else {
                System.out.println("Your option is Wrong !...");
                wrongCount ++;
            }
        }

        System.out.println();
        System.out.println("Your Score Card ...");
        System.out.println("Total questions : " + answer.size());
        System.out.println("Correct Answers : " + correctCount);
        System.out.println("Wrong Answers : " + wrongCount);
        int percentage = (100 * correctCount) / answer.size();
        System.out.println("Percentage : " + percentage );
        if (95 < percentage) {
            System.out.println("Your performance is Very Good !... ");
        } else if (percentage < 35) {
            System.out.println("Your performance is Very Low ! ... ");
        } else {
            System.out.println("Your performace is medium !... ");
        }

    }
}
