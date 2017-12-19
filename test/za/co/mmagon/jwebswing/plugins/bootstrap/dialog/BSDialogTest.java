/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.dialog;

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
		dialog.getOptions().setClosable(true).setAutodestroy(true).setCloseIcon("close");
		System.out.println(dialog.renderJavascript().toString().trim().replaceAll("\n", "").replaceAll("\t", ""));
		Assertions.assertEquals("BootstrapDialog.show({  \"title\" : \"\",  \"message\" : \"\",  \"closable\" : true,  \"closeIcon\" : \"close\",  \"autodestroy\" : true});", dialog.renderJavascript().toString().trim().replaceAll("\n", "").replaceAll("\t", ""));
	}

	@Test
	public void testSomeMethod2()
	{
		BSDialog dialog = new BSDialog();
		dialog.getOptions().setClosable(true).setAutodestroy(true).setCloseIcon("close");
		dialog.getOptions().setSize(BSDialogDialogSizes.SIZE_LARGE);
		dialog.getOptions().setType(BSDialogTypes.TYPE_WARNING);
		System.out.println(dialog.renderJavascript().toString().trim().replaceAll("\n", "").replaceAll("\t", ""));
		Assertions.assertEquals("BootstrapDialog.show({  \"title\" : \"\",  \"message\" : \"\",  \"type\" : \"type-warning\",  \"size\" : \"size-large\",  \"closable\" : true,  \"closeIcon\" : \"close\",  \"autodestroy\" : true});",
		                        dialog.renderJavascript().toString().trim().replaceAll("\n", "").replaceAll("\t", ""));
	}
}
