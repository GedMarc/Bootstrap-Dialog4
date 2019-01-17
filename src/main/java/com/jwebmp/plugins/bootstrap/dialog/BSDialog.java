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
package com.jwebmp.plugins.bootstrap.dialog;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

import java.util.Objects;

/**
 * An implementation of the Bootstrap Dialog project.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Dialog Component",
		description = "A JWebSwing Component for Bootstrap to display dialog message boxes in an easier fashion",
		url = "https://github.com/EugenMayer/bootstrap-dialog",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapDialog/wiki")
public class BSDialog<J extends BSDialog<J>>
		extends Div<BSDialogChildren, BSDialogAttributes, BSDialogFeatures, BSDialogEvents, J>
{


	private BSDialogFeature feature;

	/**
	 * Constructs a new instance of the Bootstrap Dialog Plugin
	 */
	public BSDialog()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the JQuery Feature for this component
	 *
	 * @return
	 */
	public final BSDialogFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSDialogFeature(this);
		}
		return feature;
	}

	/**
	 * Shortcut reference to the title in get Options
	 *
	 * @param title
	 *
	 * @return
	 */
	public J setTitle(Component title)
	{
		getOptions().setTitle(title);
		return (J) this;
	}

	/**
	 * Sets the options on this component
	 *
	 * @return
	 */
	@Override
	public BSDialogOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Sets the message of this dialog
	 *
	 * @param message
	 *
	 * @return
	 */
	public J setMessage(Component message)
	{
		getOptions().setMessage(message);
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getFeature());
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof BSDialog))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		BSDialog<?> bsDialog = (BSDialog<?>) o;
		return Objects.equals(getComponent(), bsDialog.getComponent());
	}
}
