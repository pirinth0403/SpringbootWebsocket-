package com.chat.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WsConfig implements WebSocketMessageBrokerConfigurer{ 

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		// TODO AUTO generated method stub
		//WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
		registry.addEndpoint("/javatechie").withSockJS(); // websocket connection is down that time server and client connected with withSocKJS ..
		 
		
	}
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry  registry) {
		// TODO AUTO generated method stub
		//WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
		
		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
		
		
	}
	
	

	
	

}
