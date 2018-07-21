/*
 * Copyright (C) 2017 Marc Magon
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
@JsonPropertyOrder({"title", "message"})
public class BSDialogOptions<J extends BSDialogOptions>
		extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	private BSDialogTypes type;
	private BSDialogDialogSizes size;
	private String cssClass;
	@JsonIgnore
	private ComponentHierarchyBase title;
	@JsonIgnore
	private ComponentHierarchyBase message;
	private Boolean nl2br;
	private Boolean closable;
	private Boolean closeByBackdrop;
	private Boolean closeByKeyboard;
	private String closeIcon;
	private String spinicon;
	private Boolean autodestroy;
	private Boolean draggable;
	private Boolean animate;
	private String description;
	private Integer tabindex;
	private String data;

	/**
	 * Default constructor
	 */
	public BSDialogOptions()
	{
		//Nothing Needed
	}

	/**
	 * Give your dialog a specific look, BootstrapDialog.TYPE_DEFAULT or type-default BootstrapDialog.TYPE_INFO or type-info BootstrapDialog.TYPE_PRIMARY or type-primary (default)
	 * BootstrapDialog.TYPE_SUCCESS or type-success BootstrapDialog.TYPE_WARNING or type-warning BootstrapDialog.TYPE_DANGER or type-danger
	 *
	 * @return
	 */
	public BSDialogTypes getType()
	{
		return type;
	}

	/**
	 * Give your dialog a specific look, BootstrapDialog.TYPE_DEFAULT or type-default BootstrapDialog.TYPE_INFO or type-info BootstrapDialog.TYPE_PRIMARY or type-primary (default)
	 * BootstrapDialog.TYPE_SUCCESS or type-success BootstrapDialog.TYPE_WARNING or type-warning BootstrapDialog.TYPE_DANGER or type-danger
	 *
	 * @param type
	 *
	 * @return
	 */
	public J setType(BSDialogTypes type)
	{
		this.type = type;
		return (J) this;
	}

	/**
	 * BootstrapDialog.SIZE_NORMAL or size-normal (default) BootstrapDialog.SIZE_WIDE or size-wide BootstrapDialog.SIZE_LARGE or size-large
	 *
	 * @return
	 */
	public BSDialogDialogSizes getSize()
	{
		return size;
	}

	/**
	 * BootstrapDialog.SIZE_NORMAL or size-normal (default) BootstrapDialog.SIZE_WIDE or size-wide BootstrapDialog.SIZE_LARGE or size-large
	 *
	 * @param size
	 *
	 * @return
	 */
	public J setSize(BSDialogDialogSizes size)
	{
		this.size = size;
		return (J) this;
	}

	/**
	 * Additional CSS classes that will be added to your dialog.
	 *
	 * @return
	 */
	public String getCssClass()
	{
		return cssClass;
	}

	/**
	 * Additional CSS classes that will be added to your dialog.
	 *
	 * @param cssClass
	 *
	 * @return
	 */
	public J setCssClass(String cssClass)
	{
		this.cssClass = cssClass;
		return (J) this;
	}

	/**
	 * Components HTML
	 *
	 * @return
	 */
	public ComponentHierarchyBase getTitle()
	{
		return title;
	}

	/**
	 * Sets the components HTML to render
	 *
	 * @param title
	 *
	 * @return
	 */
	public J setTitle(ComponentHierarchyBase title)
	{
		this.title = title;
		return (J) this;
	}

	@JsonProperty("title")
	private String getTitleHTML()
	{
		return title == null ? "" : title.toString(true);
	}

	/**
	 * Gets the message component
	 *
	 * @return
	 */
	public ComponentHierarchyBase getMessage()
	{
		return message;
	}

	/**
	 * Sets the message component
	 *
	 * @param message
	 *
	 * @return
	 */
	public J setMessage(ComponentHierarchyBase message)
	{
		this.message = message;
		return (J) this;
	}

	@JsonProperty("message")
	private String getMessageHTML()
	{
		return message == null ? "" : message.toString(true);
	}

	/**
	 * Automatically convert line breaking character to &lt;br /&gt; if it's set to true, everything keeps original if it's false.
	 *
	 * @return
	 */
	public Boolean getNl2br()
	{
		return nl2br;
	}

	/**
	 * Automatically convert line breaking character to &lt;br /&gt; if it's set to true, everything keeps original if it's false.
	 *
	 * @param nl2br
	 *
	 * @return
	 */
	public J setNl2br(Boolean nl2br)
	{
		this.nl2br = nl2br;
		return (J) this;
	}

	/**
	 * When set to true, you can close the dialog by:
	 * <p>
	 * Clicking the close icon in dialog header. Clicking outside the dialog. ESC key.
	 *
	 * @return
	 */
	public Boolean getClosable()
	{
		return closable;
	}

	/**
	 * When set to true, you can close the dialog by:
	 * <p>
	 * Clicking the close icon in dialog header. Clicking outside the dialog. ESC key.
	 *
	 * @param closable
	 *
	 * @return
	 */
	public J setClosable(Boolean closable)
	{
		this.closable = closable;
		return (J) this;
	}

	/**
	 * Whether or not to close by the backdrop
	 *
	 * @return
	 */
	public Boolean getCloseByBackdrop()
	{
		return closeByBackdrop;
	}

	/**
	 * Sets to close by the backdrop or not
	 *
	 * @param closeByBackdrop
	 *
	 * @return
	 */
	public J setCloseByBackdrop(Boolean closeByBackdrop)
	{
		this.closeByBackdrop = closeByBackdrop;
		return (J) this;
	}

	/**
	 * Sets to close by keyboard press
	 *
	 * @return
	 */
	public Boolean getCloseByKeyboard()
	{
		return closeByKeyboard;
	}

	/**
	 * Sets close by keyboard
	 *
	 * @param closeByKeyboard
	 *
	 * @return
	 */
	public J setCloseByKeyboard(Boolean closeByKeyboard)
	{
		this.closeByKeyboard = closeByKeyboard;
		return (J) this;
	}

	/**
	 * Sets the close icon
	 *
	 * @return
	 */
	public String getCloseIcon()
	{
		return closeIcon;
	}

	/**
	 * Sets the close icon
	 *
	 * @param closeIcon
	 *
	 * @return
	 */
	public J setCloseIcon(String closeIcon)
	{
		this.closeIcon = closeIcon;
		return (J) this;
	}

	/**
	 * Sets the spin icon
	 *
	 * @return
	 */
	public String getSpinicon()
	{
		return spinicon;
	}

	/**
	 * Sets the spin icon
	 *
	 * @param spinicon
	 *
	 * @return
	 */
	public J setSpinicon(String spinicon)
	{
		this.spinicon = spinicon;
		return (J) this;
	}

	/**
	 * Whether or not to auto destroy the dialog
	 *
	 * @return
	 */
	public Boolean getAutodestroy()
	{
		return autodestroy;
	}

	/**
	 * Whether or not to auto destroy
	 *
	 * @param autodestroy
	 *
	 * @return
	 */
	public J setAutodestroy(Boolean autodestroy)
	{
		this.autodestroy = autodestroy;
		return (J) this;
	}

	/**
	 * Sets if the dialog is drag-able
	 *
	 * @return
	 */
	public Boolean getDraggable()
	{
		return draggable;
	}

	/**
	 * Sets if the dialog is drag-able
	 *
	 * @param draggable
	 *
	 * @return
	 */
	public J setDraggable(Boolean draggable)
	{
		this.draggable = draggable;
		return (J) this;
	}

	/**
	 * Sets if the dialog must animate
	 *
	 * @return
	 */
	public Boolean getAnimate()
	{
		return animate;
	}

	/**
	 * Sets if the dialog must animate
	 *
	 * @param animate
	 *
	 * @return
	 */
	public J setAnimate(Boolean animate)
	{
		this.animate = animate;
		return (J) this;
	}

	/**
	 * Sets the aria description
	 *
	 * @return
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the dialog description or aria description
	 *
	 * @param description
	 *
	 * @return
	 */
	public J setDescription(String description)
	{
		this.description = description;
		return (J) this;
	}

	/**
	 * Gets the tab index
	 *
	 * @return
	 */
	public Integer getTabindex()
	{
		return tabindex;
	}

	/**
	 * Sets the tab index
	 *
	 * @param tabindex
	 *
	 * @return
	 */
	public J setTabindex(Integer tabindex)
	{
		this.tabindex = tabindex;
		return (J) this;
	}

	/**
	 * Sets any data being passed into the dialog
	 *
	 * @return
	 */
	public String getData()
	{
		return data;
	}

	/**
	 * Sets any data being passed into the dialog
	 *
	 * @param data
	 *
	 * @return
	 */
	public J setData(String data)
	{
		this.data = data;
		return (J) this;
	}

}
