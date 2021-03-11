package com.gridnine.testing;

import java.util.ServiceLoader;

/*
 * "Main" class including:
 * Класс "Main" включает в себя
 * 
 * 1. The constant called "loader" (with "getter"). "Loader" providing the "service provider";
 * Константу "loader" (с "геттером") для подключения "поставщика"
 * 
 * 2.  Method "getFiltered":
 * 		- For work of this method, "user" have to insert correct name* method which "user" want.
 * 		Для работы этого метода, "пользователь" должен указать имя метода*, который он хочет ипользовать.
 * 		
 * 		- This method realizes iteration of "service provider" names by "for-each" cycle.
 * 		In sucsess iterating case, method creates new object of class for realizes needed method.
 * 		В цикле "for-each" метод перебирает имена "поставщиков", сопоставляя их с данными,
 * 		введёнными пользователем. В случае успешного поиска, создаёт новый объект класса,
 * 		необходимого для реализации метода, "выбранного пользователем".
 * 
 * 		- By "if" operator, method checks successful creating object by previous block.
 * 		If  check passed, creates new "List" by calling ".createFlights()" method. 
 * 		After passes for execution. At other case, printed an "error message".
 * 		С помощью оператора "if", проходит проверка успешного создания объекта предыдущим блоком.
 * 		Если проверка пройдена успешно, то при вызове метода ".createFlights()" создаётся "List",
 * 		который передаётся на исполнение нужному методу.
 * 		В противном случае, выводит сообщение об ошибке.
 *
 * 3. The "main" method:
 * 		For realized any function* of this programm, "user" need calling the static "getFiltered"
 * 		method of "Main" class, with entereng the name of function*, without creating new object.
 * 		Для выполнения любой функции* программы, пользоателю достаточно вызвать статический метод
 * 		класса "Main" и как параметр, указать имя нужного метода*, без создания отдельного объекта
 * 		класса "Main".
 * _______________________________________________________________________________________________
 * 		
 * 		function* - function names in "ReadMe" file.
 * 		функции* - имена функций в файле "ReadMe".
 */

public class Main {

	final private ServiceLoader<FilterProvider> loader = ServiceLoader.load(FilterProvider.class);

	public ServiceLoader<FilterProvider> getLoader() {
		return loader;
	}

	static void getFiltered(String Name) {

		Main forLoad = new Main();

		Filter filter = null;

		for (FilterProvider filterProvider : forLoad.getLoader()) {
			if (filterProvider.getNewObject().getName().equals(Name)) {

				filter = filterProvider.getNewObject();
				break;
			}
		}

		if (filter != null)

			filter.filtering(FlightBuilder.createFlights());

		else
			System.out.print("\nFunction named by " + "'" + Name + "'" + " not find!");

		filter = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main.getFiltered("DepBefTheCurMom");

		Main.getFiltered("DerDateEarArrDate");

		Main.getFiltered("MoreThenTwH");

		/*
		 * The method below is used to check whether the loop is working properly
		 * if the function name is missing
		 * Метод ниже, для проверки работоспособности цикла в случае отсутсвия имени функции
		 * */
		 
		 Main.getFiltered("Wrong method name");
	}
}