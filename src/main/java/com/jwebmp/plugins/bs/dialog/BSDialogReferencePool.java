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

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.base.servlets.interfaces.ReferencePool;

/**
 * Default reference pool structure
 *
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum BSDialogReferencePool
		implements ReferencePool
{
	BootstrapDialogReference(new JavascriptReference("BootstrapDialog", 1.351, "bower_components/bootstrap3-dialog/dist/js/bootstrap-dialog.min.js", 15),
	                         new CSSReference("BootstrapDialogCSS", 1.351, "bower_components/bootstrap3-dialog/dist/css/bootstrap-dialog.min.css")),
	Bootstrap4DialogReference(new JavascriptReference("Bootstrap4Dialog", 1.351, "bower_components/bootstrap4-dialog/dist/js/bootstrap-dialog.min.js", 15),
	                          new CSSReference("Bootstrap4DialogCSS", 1.351, "bower_components/bootstrap4-dialog/dist/css/bootstrap-dialog.min.css"));

	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	BSDialogReferencePool()
	{
	}

	BSDialogReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		this.javaScriptReference.setPriority(RequirementsPriority.Fourth);
		this.cssReference = cssReference;
		this.cssReference.setPriority(RequirementsPriority.Fourth);
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}
