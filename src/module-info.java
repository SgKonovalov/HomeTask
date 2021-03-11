module HomeTask {
	
	provides com.gridnine.testing.FilterProvider 
	with com.gridnine.testing.DepBefTheCurMomProvider,
	com.gridnine.testing.DerDateEarArrDateProvider,
	com.gridnine.testing.MoreThenTwHProvider;
	
	uses com.gridnine.testing.FilterProvider;
	
}