package com.abahrami.template.book.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

@Component
public class BookWebSocketHandler implements WebSocketHandler {

  @Override
  public Mono<Void> handle(final WebSocketSession session) {

    return session.send(
        session
            .receive()
            .map(msg -> "RECEIVED ON SERVER :: " + msg.getPayloadAsText())
            .map(session::textMessage));
  }
}
