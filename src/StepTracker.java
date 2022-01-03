import java.util.HashMap;


public class StepTracker {
    static HashMap<String, HashMap<Integer,Integer>> resultStep;
    int targetStep ;
    Converter converter = new Converter();
    void createClass() {


        resultStep = new HashMap<>() ;
        targetStep = 10000;
        testMount.testMap(); //присасываем существующую таблицу
    }

    void hello() {

        System.out.println("добро пожаловат в счетчик калорий");
    }
    void menu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Ввести цель по количеству шагов в день;");
        System.out.println("0 - Выйти из приложения");
    }

    void insertStep(String mountStep, Integer dayStep, Integer stepsThatDay) {
    if (resultStep.containsKey(mountStep)) {
        HashMap<Integer, Integer> tempBoxInsertStep = resultStep.get(mountStep);
        tempBoxInsertStep.put(dayStep, stepsThatDay);
        resultStep.put(mountStep, tempBoxInsertStep);
    } else {
         HashMap<Integer, Integer> tempBoxInsertStep = new HashMap<>();
         tempBoxInsertStep.put(dayStep, stepsThatDay);
          resultStep.put(mountStep, tempBoxInsertStep);
    }
    System.out.println(resultStep);

    }


    void printStat(String mountPrint) {
   if (resultStep.containsKey(mountPrint)) {
        HashMap<Integer, Integer> tempBoxPrintStep = resultStep.get(mountPrint);
            System.out.println("Статистика за " + mountPrint);
            int countCycle = 0;     //счетчик циклов с 0
            int maxStep = 0;
            int sumStep = 0;
            int perfSeries = 0;
            int Series = 0;
            for (Integer Day : tempBoxPrintStep.keySet() ) {
                if (countCycle != 0) {          //ставим запятые
                    System.out.print(" ,");
                }
                System.out.print(Day + " день: " + tempBoxPrintStep.get(Day));

                countCycle++;                   //счетчик циклов
                sumStep += tempBoxPrintStep.get(Day);
                if (maxStep < tempBoxPrintStep.get(Day)) {
                       if (tempBoxPrintStep.get(Day) > targetStep) { //считаем лучшую серию
                            Series++;
                        } else {
                            if (Series > perfSeries) {
                                perfSeries = Series;
                            }
                            Series = 0;
                        }
                    }
                }
       System.out.println( "\n" +"всего шагов за месяц: "+sumStep);
       System.out.println( "всего киллометров пройдено за месяц: " + converter.convertStepToKM(sumStep));
       System.out.println( "всего Ккал сожжено за месяц: "+ converter.convertStepToColorie(sumStep));
       System.out.println("Среднее колличество шагов: "+(sumStep/(countCycle+1)));
       System.out.println("Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было выше целевого была:" + perfSeries);
       System.out.println("Ваша цель проходить в день "+ targetStep+" шагов");


   } else {
       System.out.println("нет такого месяца");
   }


    }
    void changetargetStep(int newTarget) {
            targetStep = newTarget;
            System.out.println("Цель успешно изменена на "+targetStep);
    }

}