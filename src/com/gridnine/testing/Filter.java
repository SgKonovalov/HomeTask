package com.gridnine.testing;

import java.util.List;

/*
 * Main functions for use.
 * �������� ������� ��� �������������.
 * 
 * 1. ".getName()" - use for get function name;
 * ".getName()" - ��� �������� ����� �������;
 * 
 * 2."filtering" - main function.
 * "filtering" - �������� �������.
 * */

public interface Filter {

	public String getName();

	public void filtering(List<Flight> flightList);

}