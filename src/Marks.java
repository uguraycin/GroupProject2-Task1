abstract class Marks {
double grade1, grade2, grade3;
       public double percentage (double grade1, double grade2, double grade3){
        return (grade1+grade2+grade3)/3;
        } }

class StudentA extends Marks{
    StudentA(double Math, double Biology, double Physic) {
        this.grade1=Math;
        this.grade2=Biology;
        this.grade3=Physic;}

    public double percentage (double Math, double Biology, double Physic){
        return (grade1+grade2+grade3)/3;  }
    }

class StudentB extends Marks{
    double grade4;
    public StudentB (double Math, double Biology, double Physic, double Calculus) {
        this.grade1=Math;
        this.grade2=Biology;
        this.grade3=Physic;
        this.grade4=Calculus;}

    public double percentage(double grade1, double grade2, double grade3, double grade4) {
        this.grade4=grade4;
        return(grade1 + grade2 + grade3 + grade4)/4;
            }

}
