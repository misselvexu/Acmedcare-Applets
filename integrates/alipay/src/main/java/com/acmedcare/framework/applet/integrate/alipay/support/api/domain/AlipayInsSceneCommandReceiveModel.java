package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 命令接收
 *
 * @author auto create
 * @since 1.0, 2019-03-20 22:17:04
 */
public class AlipayInsSceneCommandReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2649895184174832627L;

	/**
	 * 命令对象
	 */
	@ApiField("command")
	private Command command;

	public Command getCommand() {
		return this.command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}

}
