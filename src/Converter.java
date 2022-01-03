public class Converter {
    Integer valueStep = 50;
    Integer longStepMM = 750;   // в миллиметрах

    Integer  convertStepToKM(Integer Step) {
            Integer Km = Step*longStepMM/1000000;
        return Km;
    }

    void PrintconvertStepToKM(Integer Step) {
        Integer Metr = (Integer)(Step * longStepMM);
        System.out.println(((Integer)(Metr/1000000))+"километров");

    }

    Integer convertStepToColorie(Integer Step) {
        Integer colorie = (Integer)(Step * valueStep/1000);
        return colorie;
    }

    void PrintStepToColorie(Integer Step) {
        Integer colorie = Step * valueStep;
        System.out.println(((Integer)(colorie/1000))+"ккал");

    }
}
    //  *0.75
// 1шаг 50 калл
// 1ккалл = 1000калл