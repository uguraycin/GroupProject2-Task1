public class MarksTester {
    public static void main(String[] args) {

        StudentA studentA = new StudentA(50,50,40);
        StudentB studentB = new StudentB(60,80,60,90);

        System.out.println(studentA.percentage(50,50,40));
        System.out.println(studentB.percentage(63,81,68,37));
    }
}
