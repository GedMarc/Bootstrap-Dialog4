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
package com.jwebmp.plugins.bs.dialog;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
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
		pluginVersion = "4.4.2",
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
@TsDependency(value = "bootstrap4-dialog",version = "^4.4.2")
@NgScript(value = "dist/js/bootstrap-dialog.js")
@NgStyleSheet("dist/less/bootstrap-dialog.less")
public class BSDialogPageConfigurator
		implements IPageConfigurator<BSDialogPageConfigurator>
{

	public BSDialogPageConfigurator()
	{
		//No config required
	}

	@NotNull
	@Override
	@SuppressWarnings("unchecked")
	 public Page<?> configure(Page<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}

	@Override
	public Integer sortOrder()
	{
		return 150;
	}
}
