public class geometryRunner {
    
    public static void main(String[] args) throws Exception {

    geomtryCalculator run = new geomtryCalculator(); 

    int formulaPicked = run.formulaSelect();

    if (formulaPicked == 1){
        run.rectangle();
    }
    else if (formulaPicked == 2){
        run.cube();
    }
    else if (formulaPicked == 3){
        run.circle();
    }
}
}