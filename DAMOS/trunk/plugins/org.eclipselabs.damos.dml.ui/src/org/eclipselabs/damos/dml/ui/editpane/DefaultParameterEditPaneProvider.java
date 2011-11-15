package org.eclipselabs.damos.dml.ui.editpane;

import org.eclipselabs.damos.dml.Parameter;

/**
 * @author Andreas Unger
 *
 */
public class DefaultParameterEditPaneProvider implements IParameterEditPaneProvider {

	public IValueSpecificationEditPane createEditor(Parameter parameter) {
//		DataTypeSpecification dataType = parameter.getDataType();
//		if (dataType instanceof PrimitiveTypeSpecification) {
//			switch (((PrimitiveTypeSpecification) dataType).getKind()) {
//			case STRING:
//				return new StringValueSpecificationEditPane();
//			}
//		}
		return new StringValueSpecificationEditPane();
	}

}
