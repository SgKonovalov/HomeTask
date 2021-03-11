package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

/*
 * Class for implementation first task at list: "Get the departure before current moment".
 * 
 * Класс для выполнения первого задания: "вылет до текущего момента времени".
 */

public class DepBefTheCurMom implements Filter {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "DepBefTheCurMom";
	}

	@Override
	public void filtering(List<Flight> flightList) {
		// TODO Auto-generated method stub

		/*
		 * Done by Stream API (Реализованно с помощью Stream API):
		 * 
		 * 1. Create a new Stream. called "MyStream"; Создан новый поток "MyStream"
		 * 
		 * 2. By cycle "forEach" getted segments of flight by "getSegments()" function;
		 * В цикле "forEach" получены сегменты полёта с ипользованием функции
		 * "getSegments()"
		 * 
		 * 3. Filtered departure time as need. Used function "getDepartureDate()" beside
		 * used the standard function Stream API; Отфильтровано время вылета по заданию.
		 * Использована функция "getDepartureDate()" и стандартные функции Stream API
		 * 
		 * 4. At new "forEach" cycle printed results. В новом цикле "forEach"
		 * распечатаны результаты
		 */

		Stream<Flight> MyStream = flightList.stream();

		MyStream.forEach(atFlight -> atFlight.getSegments().stream()
				.filter(atSegment -> atSegment.getDepartureDate().isBefore(LocalDateTime.now()))
				.forEach(print -> System.out.println("Filtered by first condition.\n" + print)));
	}
}