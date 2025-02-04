package Java.IDE.Quiz;

public class Questions {
    private String question, option1, option2, option3, option4;

    public Questions() {}

    public Questions(String question, String option1, String option2, String option3, String option4) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
    public String getQuestion() {return question;}
    public void setQuestion(String question){this.question = question;}

    public String getOption1() {return option1;}
    public void setOption1() {this.option1 = option1;}

    public String getOption2() {return option2;}
    public void setOption2() {this.option2 = option2;}

    public String getOption3() {return option3;}
    public void setOption3() {this.option3 = option3;}

    public String getOption4() {return option4;}
    public void setOption4() {this.option4 = option4;}

    @Override
    public String toString() {
        return "Questions \n" + "Question : " + question + 
        "option 1 " + option1 + '\n' +
        "option 2 " + option2 + '\n' +
        "option 3 " + option3 + '\n' +
        "option 4 " + option4 + '\n' 
        ;
    }

}

