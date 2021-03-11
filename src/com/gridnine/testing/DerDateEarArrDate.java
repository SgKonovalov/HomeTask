package com.gridnine.testing;

import java.util.List;
import java.util.stream.Stream;

/*
* Class for implementation second task at list: "Arrived time earlier than departure time".
* 
* ����� ��� ���������� ������� �������: "������� �������� � ����� ������ ������ ���� ������".
*/

public class DerDateEarArrDate implements Filter {

	/*
	 * Done by Stream API (������������ � ������� Stream API):
	 * 
	 * 1. Create a new Stream. called "MyStream"; ������ ����� ����� "MyStream"
	 * 
	 * 2. By cycle "forEach" getted segments of flight by "getSegments()" function;
	 * � ����� "forEach" �������� �������� ����� � ������������� �������
	 * "getSegments()"
	 * 
	 * 3. Filtered by comparison by departure and arrival segments time with
	 * condition "isBefore" (means earlier) by standard function of Stream API.
	 * ������������� ���� ��������� ������� ��������� ������ � ����������� �
	 * ������� "����������� ����� ������", � ������� ����������� ������ "isBefore"
	 * �� Stream API.
	 * 
	 * 4. At new "forEach" cycle printed results. � ����� ����� "forEach"
	 * ����������� ����������
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