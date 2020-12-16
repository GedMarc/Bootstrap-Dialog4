/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bs4.dialog;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 19 Feb 2017
 */
@PluginInformation(pluginName = "Bootstrap Dialog",
		pluginUniqueName = "bootstrap-dialog",
		pluginDescription = "The Bootstrap Dialog widget for Bootstrap",
		pluginVersion = "4.8",
		pluginDependancyUniqueIDs = "jquery,bootstrap",
		pluginCategories = "bootstrap,web ui,ui,framework",
		pluginSubtitle = "Make use of Bootstrap's modal more monkey-friendly.",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-BootstrapDialog",
		pluginSourceUrl = "https://github.com/EugenMayer/bootstrap-dialog",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapDialog/wiki",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.bootstrap/jwebmp-bootstrap-dialog4",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04",
		pluginGroupId = "com.jwebmp.plugins.bootstrap",
		pluginArtifactId = "jwebmp-bootstrap-dialog4",
		pluginModuleName = "com.jwebmp.plugins.bs4.dialog",
		pluginStatus = PluginStatus.Released
)
public class BSDialogPageConfigurator
		implements IPageConfigurator<BSDialogPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	public BSDialogPageConfigurator()
	{
		//No config required
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BSDialogPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BSDialogPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .getJavascriptReferences()
			    .add(BSDialogReferencePool.Bootstrap4DialogReference.getJavaScriptReference());
			page.getBody()
			    .getCssReferences()
			    .add(BSDialogReferencePool.Bootstrap4DialogReference.getCssReference());

			page.getBody()
			    .getJavascriptReferences()
			    .remove(BSDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
			page.getBody()
			    .getCssReferences()
			    .remove(BSDialogReferencePool.BootstrapDialogReference.getCssReference());
		}

		return page;
	}

	@Override
	public boolean enabled()
	{
		return BSDialogPageConfigurator.enabled;
	}

	@Override
	public Integer sortOrder()
	{
		return 150;
	}
}
