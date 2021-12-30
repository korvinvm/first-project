import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        stepTracker.createClass();
        stepTracker.hello();
        while (true) {
            stepTracker.menu();
            String select = scanner.next();

            if (select.equals("1")) {
                System.out.println("Введите месяц за который хотите ввести коллличество щагов");
                String mountStep = scanner.next();
                System.out.println("Введите день за который хотите ввести коллличество щагов");
                Integer daytStep = scanner.nextInt();
                System.out.println("Ввесдите колличество шагов пройденных в этот день");
                Integer stepsThatDay = scanner.nextInt();
                stepTracker.insertStep(mountStep, daytStep, stepsThatDay);
            } else if (select.equals("2")) {
                System.out.println("За какой месяц напечатать статистику?");
                String mountPrint = scanner.next();
                stepTracker.printStat(mountPrint);
            } else if (select.equals("3")) {
                System.out.println("Введите новую цель в шагах");
                int newTarget = scanner.nextInt();
                stepTracker.changetargetStep(newTarget);
            } else if (select.equals("0")) {
                break;
            } //иначе начинает занаво
        }
    }
}
