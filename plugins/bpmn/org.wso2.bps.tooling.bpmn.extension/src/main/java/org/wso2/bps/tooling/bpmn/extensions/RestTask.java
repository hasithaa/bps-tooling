/*
 * Copyright 2005-2015 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.bps.tooling.bpmn.extensions;

import org.activiti.designer.integration.annotation.Help;
import org.activiti.designer.integration.annotation.Property;
import org.activiti.designer.integration.annotation.PropertyItems;
import org.activiti.designer.integration.annotation.Runtime;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;

/**
 * REST Task Activity Designer implementation.
 *
 * @See org.wso2.carbon.bpmn.extensions.rest.RESTTask
 */
@Runtime(javaDelegateClass = Constants.REST_TASK_CLASS)
@Help(displayHelpShort = Constants.REST_TASK_HELP, displayHelpLong = Constants.REST_TASK_HELP_LONG)
public class RestTask extends AbstractCustomServiceTask {

	@Override
	public String getName() {
		return Constants.REST_TASK_NAME;
	}

	@Override
	public String contributeToPaletteDrawer() {
		return Constants.PALETTE_WSO2;
	}

	@Override
	public String getSmallIconPath() {
		return Constants.ICONS_REST_TASK;
	}

	/**
	 * @See Constants.SERVICE_URL_HELP_LONG
	 */
	@Property(type = PropertyType.TEXT, displayName = Constants.SERVICE_URL_LABEL, required = false,
			defaultValue = Constants.SERVICE_URL_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.SERVICE_URL_HELP, displayHelpLong = Constants.SERVICE_URL_HELP_LONG)
	private String serviceURL;

	/**
	 * @See Constants.BASIC_AUTH_USER_HELP_LONG
	 */
	@Property(type = PropertyType.TEXT, displayName = Constants.BASIC_AUTH_USER_LABEL, required = false,
			defaultValue = Constants.BASIC_AUTH_USER_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.BASIC_AUTH_USER_HELP, displayHelpLong = Constants.BASIC_AUTH_USER_HELP_LONG)
	private String basicAuthUsername;

	/**
	 * @See Constants.BASIC_AUTH_PASSWORD_HELP_LONG
	 */
	@Property(type = PropertyType.TEXT, displayName = Constants.BASIC_AUTH_PASSWORD_LABEL, required = false,
			defaultValue = Constants.BASIC_AUTH_PASSWORD_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.BASIC_AUTH_PASSWORD_HELP,
			displayHelpLong = Constants.BASIC_AUTH_PASSWORD_HELP_LONG) private String basicAuthPassword;

	/**
	 * @See Constants.EPR_HELP_LONG
	 */
	@Property(type = PropertyType.TEXT, displayName = Constants.EPR_LABEL, required = false,
			defaultValue = Constants.EPR_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.EPR_HELP, displayHelpLong = Constants.EPR_HELP_LONG) private String serviceRef;

	/**
	 * @See Constants.METHOD_HELP_LONG
	 */
	@Property(type = PropertyType.COMBOBOX_CHOICE, displayName = Constants.METHOD_LABEL, required = true,
			defaultValue = Constants.METHOD_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.METHOD_HELP, displayHelpLong = Constants.METHOD_HELP_LONG) @PropertyItems(
			{ Constants.METHOD_GET_LABEL, Constants.METHOD_GET_VALUE, Constants.METHOD_POST_LABEL,
			  Constants.METHOD_POST_VALUE }) private String method;

	/**
	 * @See Constants.INPUT_HELP_LONG
	 */
	@Property(type = PropertyType.MULTILINE_TEXT, displayName = Constants.INPUT_LABEL, required = true,
			defaultValue = Constants.INPUT_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.INPUT_HELP, displayHelpLong = Constants.INPUT_HELP_LONG) private String input;

	@Property(type = PropertyType.TEXT, displayName = Constants.OUTPUT_VARIABLE_LABEL, required = false,
			defaultValue = Constants.OUTPUT_VARIABLE_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.OUTPUT_VARIABLE_HELP, displayHelpLong = Constants.OUTPUT_VARIABLE_HELP_LONG)
	private String outputVariable;

	/**
	 * @See Constants.OUTPUT_VARIABLE_MAPPING_HELP_LONG
	 */
	@Property(type = PropertyType.TEXT, displayName = Constants.OUTPUT_VARIABLE_MAPPING_LABEL, required = false,
			defaultValue = Constants.OUTPUT_VARIABLE_MAPPING_DEFAULT_VALUE)
	@Help(displayHelpShort = Constants.OUTPUT_VARIABLE_MAPPING_HELP,
			displayHelpLong = Constants.OUTPUT_VARIABLE_MAPPING_HELP_LONG) private String outputMappings;

}
