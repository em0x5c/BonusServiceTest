package com.company;

import com.company.BonusService;

public class Main {
    public static void main(String[] args) {
	    BonusService service = new BonusService();

	    //подготавливаем данные:
	    long amount = 100060;
	    boolean registered = true;
	    long expected = 30;

	    //вызываем целевой метод:
	    long actual = service.calculate(amount, registered);

        //производим проверку (сравниваем ожидаемый и фактический):
        //если true - то PASS
        //если false - то FAIL
        boolean passed = expected == actual;

	    System.out.println(passed);
    }
}
