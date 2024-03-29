package com.jwebmp.plugins.bs.dialog.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BootstrapDialog4ExclusionsModule
		implements IGuiceScanModuleExclusions<BootstrapDialog4ExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstrap.dialog4");
		return strings;
	}
}
