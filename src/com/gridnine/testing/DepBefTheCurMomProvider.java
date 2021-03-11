package com.gridnine.testing;

/*
 * This class get the object of main function (by interface called "Filter")
 * thanks to implements interface "FilterProvider".
 * 
 * Данный класс создаёт новый объект основной функции (интерфейса "Filter"),
 * в результате реализации интерфейса "FilterProvider".
 */

public class DepBefTheCurMomProvider implements FilterProvider {

	@Override
	public Filter getNewObject() {
		// TODO Auto-generated method stub
		return new DepBefTheCurMom();
	}
}