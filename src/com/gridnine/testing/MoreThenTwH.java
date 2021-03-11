package com.gridnine.testing;

import java.time.temporal.ChronoUnit;
import java.util.List;

/*
 * Class for implementation third task at list: "Time spend on land more then two hours".
 * 
 * Класс для выполнения третьего задания: "общее время, проведённое на земле превышает два часа ".
 */

public class MoreThenTwH implements Filter {

	/*
	 * Realization "filtering" method include next block: Реализация метода
	 * "filtering", включает следующие блоки
	 * 
	 * 1. Iterating elements of List provided by ".createFlights()" method by
	 * "for-each" cycle; Переборка элементов коллекции в цикле "for-each",
	 * сформированной в результате вызова метода ".createFlights()"
	 * 
	 * 2. Outer "for" cycle iterating "segments", and looking for
	 * "first flight segment"; Внешний цикл "for" перебирает "сегменты полёта" и
	 * "ищет" первый сегмент;
	 * 
	 * 3. Inner "for" cycle iterating "segments", and looking for
	 * "second + flight segment"; Внутренний цикл "for" перебирает "сегменты полёта"
	 * и "ищет" второй + сегменты;
	 * 
	 * 4. Inner "if" compares differences by hours beetwen segments (>2). If
	 * "flights" by conditions finded - print. Вложенный "if" выявляет различия по
	 * часам между сегментами. Если находит нужный - печатает.
	 */

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "MoreThenTwH";
	}

	@Override
	public void filtering(List<Flight> flightList) {
		// TODO Auto-generated method stub
		System.out.println("\nFiltered by third condition.");

		for (Flight myObj : flightList) {

			for (int i = 0; i < myObj.getSegments().size(); i++) {
				for (int x = i + 1; x < myObj.getSegments().size(); x++) {

					if (ChronoUnit.HOURS.between((myObj.getSegments().get(i).getArrivalDate()),
							(myObj.getSegments().get(x).getDepartureDate())) > 2)

						System.out.println(myObj.getSegments());
				}
			}
		}
	}
}