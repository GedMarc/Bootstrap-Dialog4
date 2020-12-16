package com.jwebmp.plugins.bs4.dialog.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BS4DialogInclusionModule implements IGuiceScanModuleInclusions<BS4DialogInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bs4.dialog");
		return set;
	}
}
