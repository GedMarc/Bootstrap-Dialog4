import com.jwebmp.plugins.bs4.dialog.implementations.BS4DialogInclusionModule;

module com.jwebmp.plugins.bs4.dialog {
	exports com.jwebmp.plugins.bs4.dialog;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.dialog.BSDialogPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.dialog.implementations.BootstrapDialog4ExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BS4DialogInclusionModule;
	
	opens com.jwebmp.plugins.bs4.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
