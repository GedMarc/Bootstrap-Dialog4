module com.jwebmp.plugins.bs4.dialog {
	exports com.jwebmp.plugins.bs4.dialog;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.dialog.BSDialogPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4.dialog.implementations.BootstrapDialog4ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.dialog.implementations.BootstrapDialog4ExclusionsModule;

	opens com.jwebmp.plugins.bs4.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
