import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        EquationFactory linearFactory = new EquationFactory();
        EquationFactory quadraticFactory = new QuadraticFactory();
        EquationFactory biQuadraticFactory = new BiQuadraticFactory();

        Equation eq;

        ArrayList<Equation> equations = new ArrayList<>();

        String file ="src/input02.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        while ((currentLine != null) && (!currentLine.isEmpty())) {

            String[] stringArray = currentLine.trim().split("\\s+");
            int len = stringArray.length;

            Double[] arr = new Double[len];
            int j = 0;
            for (String s : stringArray) {
                arr[j] = Double.parseDouble(s);
                j = j + 1;
            }

            if ((arr.length==5) && (arr[0]==0)) {
                Double[] arr1 = new Double[3];
                arr1[0] = arr[2];
                arr1[1] = arr[3];
                arr1[2] = arr[4];
                arr = arr1;
            }
            if ((arr.length == 3) && (arr[0]==0)) {
                Double[] arr1 = new Double[2];
                arr1[0] = arr[1];
                arr1[1] = arr[2];
                arr = arr1;
            }
            len = arr.length;
            ArrayList<Double> doubleArray = new ArrayList<Double>();
            doubleArray.addAll(Arrays.asList(arr));

            if (len==2) {
                eq = linearFactory.create(doubleArray);
            } else if (len==3) {
                eq = quadraticFactory.create(doubleArray);
            } else if (len==5){
                eq = biQuadraticFactory.create(doubleArray);
            } else {
                eq = linearFactory.create(new ArrayList<>(Arrays.asList(0.0, 0.0)));
                System.out.println("FAILED TO CREATE AN EQUATION: LEN = " + len);
            }
            equations.add(eq);
            currentLine = reader.readLine();
        }
        reader.close();

        ArrayList<Equation> zero_solutions = new ArrayList<>();
        ArrayList<Equation> one_solution = new ArrayList<>();
        ArrayList<Equation> two_solutions = new ArrayList<>();
        ArrayList<Equation> three_solutions = new ArrayList<>();
        ArrayList<Equation> four_solutions = new ArrayList<>();
        ArrayList<Equation> infinity_solutions = new ArrayList<>();

        ArrayList<Double> one_solution_number = new ArrayList<>();


        for (Equation qq : equations) {
            ArrayList<Double> solution = qq.solve();
            if (solution.size()==0) {
                zero_solutions.add(qq);
            } else if (solution.size()==1) {
                one_solution.add(qq);
                one_solution_number.add(solution.get(0));
            } else if (solution.size() == 2) {
                two_solutions.add(qq);
            } else if (solution.size() == 3) {
                three_solutions.add(qq);
            } else if (solution.size() == 4) {
                four_solutions.add(qq);
            } else {
                infinity_solutions.add(qq);
            }
            //System.out.println(qq + ";  Solution: " + solution);
        }

        System.out.println(" No solutions: ");
        for (Equation eqq : zero_solutions) {
            System.out.println(eqq);
        }

        System.out.println(" ONE solutions: ");
        for (Equation eqq : one_solution) {
            System.out.println(eqq);
        }

        System.out.println(" TWo solutions: ");
        for (Equation eqq : two_solutions) {
            System.out.println(eqq);
        }

        System.out.println("               THREE solutions: ");
        for (Equation eqq : three_solutions) {
            System.out.println(eqq);
        }

        System.out.println("              FOUR solutions: ");
        for (Equation eqq : four_solutions) {
            System.out.println(eqq);
        }

        System.out.println("             INFINITY solutions: ");
        for (Equation eqq : infinity_solutions) {
            System.out.println(eqq);
        }


        double mini  = Collections.min(one_solution_number);
        double maxi  = Collections.max(one_solution_number);
        int mini_index = one_solution_number.indexOf(mini);
        int maxi_index = one_solution_number.indexOf(maxi);
        System.out.println("Equation with smallest solution: " + one_solution.get(mini_index) + ";    The minimal solution: " + mini);
        System.out.println("Equation with greatest solution: " + one_solution.get(maxi_index) + ";    The maximal solution: " + maxi);
    }
}
