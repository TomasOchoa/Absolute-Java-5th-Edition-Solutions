package tomas.ochoa;

/**
 *  Write a grading program for a class with the following grading policies:
 *
 * a. There are three quizzes, each graded on the basis of 10 points.
 * b. There is one midterm exam, graded on the basis of 100 points.
 * c. There is one final exam, graded on the basis of 100 points.
 *
 *  The final exam counts for 40% of the grade. The midterm counts for 35% of the
 * grade. The three quizzes together count for a total of 25% of the grade. (Do not
 * forget to convert the quiz scores to percentages before they are averaged in.)
 * Any grade of 90 or more is an A, any grade of 80 or more (but less than 90) is a
 * B, any grade of 70 or more (but less than 80) is a C, any grade of 60 or more (but
 * less than 70) is a D, and any grade below 60 is an F. The program should read in
 * the student’s scores and output the student’s record, which consists of three quiz
 * scores and two exam scores, as well as the student’s overall numeric score for the
 * entire course and final letter grade.
 *
 *  Define and use a class for the student record. The class should have instance
 * variables for the quizzes, midterm, final, overall numeric score for the course, and
 * final letter grade. The overall numeric score is a number in the range 0 to 100,
 * which represents the weighted average of the student’s work. The class should have
 * methods to compute the overall numeric grade and the final letter grade. These last
 * methods should be void methods that set the appropriate instance variables. Your
 * class should have a reasonable set of accessor and mutator methods, an equals
 * method, and a toString method, whether or not your program uses them. You
 * may add other methods if you wish.
 *
 * Variables:
 * int quiz1, quiz2, quiz3
 * int midterm
 * int final
 * int quizSum
 *
 * Facts:
 * final = 40 percent of grade
 * midterm = 35 percent of grade
 * sum of quizes = 25 %
 *
 * A = grade > 90
 * B = grade < 90 and > 80
 * C = grade < 80 and > 70
 * D = grade < 70 and > 60
 * F = grad > 60
 *
 * Program:
 * read in grades
 *
 *
 *
 *
 * */


public class StudentRecord
{
// Instance variables
    // name of recs
    int quiz1;
    int quiz2;
    int quiz3;
    int quizSum;
    int midterm;
    int finalExam;
    double numericalGrade;
    String letterGrade;

// Constructors
    //default
    public StudentRecord()
    {
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        quizSum = 0;
        midterm = 0;
        finalExam = 0;
        numericalGrade = 0.0;
        letterGrade = "";
    }
    public StudentRecord(int q1,int q2,int q3)
    {
        quiz1 = q1;
        quiz2 = q2;
        quiz3 = q3;
        quizSum = q1 + q2 + q3;
        midterm = 0;
        finalExam = 0;
        numericalGrade = 0.0;
        letterGrade = "";
    }


// Methods
    // Mutator
    public void setQuiz1(int q1)
    {
        this.quiz1 = q1;
    }
    public void setQuiz2(int q2)
    {
        this.quiz2 = q2;
    }
    public void setQuiz3(int q3)
    {
        this.quiz3 = q3;
    }
    public void setMidterm(int m)
    {
        this.midterm = m;
    }
    public void setFinalExam(int f)
    {
        this.finalExam = f;
    }
    // Accessor
    public int getQuiz1()
    {
        int q1 = this.quiz1;
        return q1;
    }
    public int getQuiz2()
    {
        int q2 = this.quiz2;
        return q2;
    }
    public int getQuiz3()
    {
        int q3 = this.quiz3;
        return q3;
    }
    public int getMidterm()
    {
        int m = this.midterm;
        return m;
    }
    public int getFinalExam()
    {
        int f = this.finalExam;
        return f;
    }
    public double getNumericalGrade()
    {
        double g = this.numericalGrade;
        return g;
    }
    public String getLetterGrade()
    {
        String  g = this.letterGrade;
        return g;
    }
    // Helper
    public void computeNumericalGrade()
    {
        double quizPoints;
        double midtermPoints;
        double finalPoints;

        quizSum = quiz1 + quiz2 + quiz3;
        quizPoints = ((quizSum/30.0)*100.0) * .25;
        midtermPoints = ((midterm/100.0)*100.0) * .35;
        finalPoints  = ((finalExam/100.0)*100.0) * .35;
        numericalGrade = quizPoints + midtermPoints + finalPoints;
    }
    public void computeLetterGrade()
    {
        if (numericalGrade > 90.0)
            letterGrade = "A";
        else if (numericalGrade < 90.0 && numericalGrade > 80.0)
            letterGrade = "B";
        else if (numericalGrade < 80.0 && numericalGrade > 70.0)
            letterGrade = "C";
        else if (numericalGrade < 70.0 && numericalGrade > 60.0)
            letterGrade = "B";
        else if (numericalGrade > 60.)
            letterGrade = "F";
    }
    public String toString()
    {
        return "";
    }





}
