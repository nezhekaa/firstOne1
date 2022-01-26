package calculator;

public class Calculator {
    History history = new History();

    public double plus(double a, double b) {
        double result = a + b;
        history.listPlus.add(a + " + " + b + " = " + result);
        history.listAll.add(a + " + " + b + " = " + result);
        return result;
    }

    public double minus(double a, double b) {
        double result = a - b;
        history.listMinus.add(a + " - " + b + " = " + result);
        history.listAll.add(a + " - " + b + " = " + result);
        return result;
    }

    public double del(double a, double b) {
        double result = a / b;
        history.listDel.add(a + " / " + b + " = " + result);
        history.listAll.add(a + " / " + b + " = " + result);
        return result;
    }

    public double umn(double a, double b) {
        double result = a * b;
        history.listUmn.add(a + " * " + b + " = " + result);
        history.listAll.add(a + " * " + b + " = " + result);
        return result;
    }

    public void printHistory() {
        for (int i = 0; i < history.listAll.size(); i++) {
            System.out.println(history.listAll.get(i) + " ");
        }
    }

    public void printHistoryPlus() {
        for (int i = 0; i < history.listPlus.size(); i++) {
            System.out.println(history.listPlus.get(i) + " ");
        }
    }

    public void printHistoryMinus() {
        for (int i = 0; i < history.listMinus.size(); i++) {
            System.out.println(history.listMinus.get(i) + " ");
        }
    }

    public void printHistoryDel() {
        for (int i = 0; i < history.listDel.size(); i++) {
            System.out.println(history.listDel.get(i) + " ");
        }
    }

    public void printHistoryUmn() {
        for (int i = 0; i < history.listUmn.size(); i++) {
            System.out.println(history.listUmn.get(i) + " ");
        }
    }
}
