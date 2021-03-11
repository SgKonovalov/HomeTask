package com.gridnine.testing;

import java.util.List;
import java.util.stream.Stream;

/*
* Class for implementation second task at list: "Arrived time earlier than departure time".
* 
* Класс для выполнения второго задания: "имеются сегменты с датой прилёта раньше даты вылета".
*/

public class DerDateEarArrDate implements Filter {

	/*
	 * Done by Stream API (Реализованно с помощью Stream API):
	 * 
	 * 1. Create a new Stream. called "MyStream"; Создан новый поток "MyStream"
	 * 
	 * 2. By cycle "forEach" getted segments of flight by "getSegments()" function;
	 * В цикле "forEach" получены сегменты полёта с ипользованием функции
	 * "getSegments()"
	 * 
	 * 3. Filtered by comparison by departure and arrival segments time with
	 * condition "isBefore" (means earlier) by standard function of Stream API.
	 * Отфильтровано путём сравнения времени сегментов вылета и приземления с
	 * уловием "приземление ранее вылета", с помощью стандарного метода "isBefore"
	 * из Stream API.
	 * 
	 * 4. At new "forEach" cycle printed results. В новом цикле "forEach"
	 * распечатаны результаты
	 */

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "DerDateEarArrDate";
	}

	@Override
	public void filtering(List<Flight> flightList) {
		// TODO Auto-generated method stub

		Stream<Flight> MyStream = flightList.stream();

		MyStream.forEach(atFlight -> atFlight.getSegments().stream()
				.filter(atSegment -> atSegment.getArrivalDate().isBefore(atSegment.getDepartureDate()))
				.forEach(print -> System.out.println("\nFiltered by second condition.\n" + print)));
	}
}