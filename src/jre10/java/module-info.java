import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrap.dialog.BSDialogPageConfigurator;
import com.jwebmp.plugins.bootstrap.dialog.implementations.BootstrapDialog4ExclusionsModule;

module com.jwebmp.plugins.bootstrap.dialog4 {
	exports com.jwebmp.plugins.bootstrap.dialog;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BSDialogPageConfigurator;

	provides IGuiceScanJarExclusions with BootstrapDialog4ExclusionsModule;
	provides IGuiceScanModuleExclusions with BootstrapDialog4ExclusionsModule;

	opens com.jwebmp.plugins.bootstrap.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
