package com.gridnine.testing;

import java.util.List;

/*
 * Main functions for use.
 * Основные функции для использования.
 * 
 * 1. ".getName()" - use for get function name;
 * ".getName()" - для указания имени функции;
 * 
 * 2."filtering" - main function.
 * "filtering" - основная функция.
 * */

public interface Filter {

	public String getName();

	public void filtering(List<Flight> flightList);

}