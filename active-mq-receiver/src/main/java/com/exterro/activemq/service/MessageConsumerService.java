/**
 * @Placed com.exterro.activemq.service
 */
package com.exterro.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author MirdulaRangasamy
 *
 * @date 27 Aug 2024
 */
@Component
public class MessageConsumerService {
	
	@JmsListener(destination = "youtube")
	public void listener(String name) {
		System.out.println("From Youtube: "+name);
	}
}
