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

import com.jwebmp.plugins.bs.dialog.BSDialog;
import com.jwebmp.plugins.bs.dialog.BSDialogDialogSizes;
import com.jwebmp.plugins.bs.dialog.BSDialogTypes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSDialogTest
{

	public BSDialogTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSDialog dialog = new BSDialog();
		dialog.getOptions()
		      .setClosable(true)
		      .setAutodestroy(true)
		      .setCloseIcon("close");
		System.out.println(dialog.renderJavascript()
		                         .toString()
		                         .trim()
		                         .replaceAll("\n", "")
		                         .replaceAll("\t", ""));
		Assertions.assertEquals("BootstrapDialog.show({  \"closable\" : true,  \"closeIcon\" : \"close\",  \"autodestroy\" : true});",
		                        dialog.renderJavascript()
		                              .toString()
		                              .trim()
		                              .replaceAll("\n", "")
		                              .replaceAll("\t", ""));
	}

	@Test
	public void testSomeMethod2()
	{
		BSDialog dialog = new BSDialog();
		dialog.getOptions()
		      .setClosable(true)
		      .setAutodestroy(true)
		      .setCloseIcon("close");
		dialog.getOptions()
		      .setSize(BSDialogDialogSizes.SIZE_LARGE);
		dialog.getOptions()
		      .setType(BSDialogTypes.TYPE_WARNING);
		System.out.println(dialog.renderJavascript()
		                         .toString()
		                         .trim()
		                         .replaceAll("\n", "")
		                         .replaceAll("\t", ""));
		Assertions.assertEquals(
				"BootstrapDialog.show({  \"type\" : \"type-warning\",  \"size\" : \"size-large\",  \"closable\" : true,  \"closeIcon\" : \"close\",  \"autodestroy\" : true});",
				dialog.renderJavascript()
				      .toString()
				      .trim()
				      .replaceAll("\n", "")
				      .replaceAll("\t", ""));
	}
}
