package calculator;

import java.util.Scanner;

public class Testing {
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public static void main(String[] args) {
        Calculator kalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean goNext = true;
        String operations = "+-/*";
        do {
            System.out.println("Введите данные для вычислений");
            String input = scanner.nextLine();
            String[] valuesForCalculation = input.split(" ");
            if (valuesForCalculation.length == 3 && isDouble(valuesForCalculation[0]) && isDouble(valuesForCalculation[2])
                    && operations.contains(valuesForCalculation[1])) {
                double a = Double.parseDouble(valuesForCalculation[0]);
                double b = Double.parseDouble(valuesForCalculation[2]);
                input = valuesForCalculation[1];
                switch (input) {
                    case "+": {
                        System.out.println(kalculator.plus(a, b));
                        break;
                    }
                    case "-": {
                        System.out.println(kalculator.minus(a, b));
                        break;

                    }
                    case "*": {
                        System.out.println(kalculator.umn(a, b));
                        break;
                    }
                    case "/": {
                        System.out.println(kalculator.del(a, b));
                        break;
                    }
                }
                System.out.println("Введите 'stop' для завершения, 'history' для вывода всей истории, 'historyplus' для " +
                       " истории плюса, 'historyminus' для минуса, 'historydel' для истории деления, 'historyumn' для истории " +
                        " умножения, любую комбинацию для продолжения");
                String action = scanner.nextLine();
                switch (action) {
                    case "history": {
                        kalculator.printHistory();
                        break;
                    }

                    case "stop": {
                        goNext = false;
                        break;

                    }
                    case "historyplus": {
                        kalculator.printHistoryPlus();
                        break;

                    }
                    case "historyminus": {
                        kalculator.printHistoryMinus();
                        break;
                    }

                    case "historydel": {
                        kalculator.printHistoryDel();
                        break;
                    }

                    case "historyumn": {
                        kalculator.printHistoryUmn();
                        break;
                    }
                }
            } else System.out.println("Такой ввод не корректен!");
        }
        while (goNext);
    }
}