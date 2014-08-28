/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package net.teufel.e4.mail.handlers;

import net.teufel.e4.mail.parts.Part;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class OpenHandler {
	
	@Execute
	public void execute(EPartService partService, EModelService modelService, MApplication app ){
		
		MPart part = partService.createPart(Part.ID);
		MPartStack stack = (MPartStack) modelService.find("net.teufel.e4.mail.partStack", app);
		stack.getChildren().add(part);
		
	}
}
