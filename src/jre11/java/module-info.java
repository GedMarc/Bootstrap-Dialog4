module com.jwebmp.plugins.bs4.dialog {
	exports com.jwebmp.plugins.bs4.dialog;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires java.validation;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.dialog.BSDialogPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.dialog.implementations.BootstrapDialog4ExclusionsModule;

	opens com.jwebmp.plugins.bs4.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
