import com.jwebmp.plugins.bs.dialog.*;
import com.jwebmp.plugins.bs.dialog.implementations.BS4DialogInclusionModule;

module com.jwebmp.plugins.bs.dialog {
	exports com.jwebmp.plugins.bs.dialog;

	requires transitive com.jwebmp.plugins.bootstrap;
	
	provides com.jwebmp.core.services.IPageConfigurator with BSDialogPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BS4DialogInclusionModule;
	
	opens com.jwebmp.plugins.bs.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
}
