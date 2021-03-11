package com.gridnine.testing;

/* 
 * Main provider interface. Needed for getting object by main function called "Filter".
 * 
 * Интерфейс основного "поставщика". Нужен для получения объекта функции, интерфейса "Фильтр".
*/

public interface FilterProvider {

	public Filter getNewObject();

}