package com.gridnine.testing;

/*
 * This class get the object of main function (by interface called "Filter")
 * thanks to implements interface "FilterProvider".
 * 
 * ������ ����� ������ ����� ������ �������� ������� (���������� "Filter"),
 * � ���������� ���������� ���������� "FilterProvider".
 */

public class DepBefTheCurMomProvider implements FilterProvider {

	@Override
	public Filter getNewObject() {
		// TODO Auto-generated method stub
		return new DepBefTheCurMom();
	}
}