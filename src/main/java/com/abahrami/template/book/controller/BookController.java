package com.abahrami.template.book.controller;

import com.abahrami.template.book.domain.Book;
import com.abahrami.template.book.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

  private final BookRepository repository;

  public BookController(final BookRepository repository) {
    this.repository = repository;
  }

  @PostMapping
  public Mono<Book> create(@RequestBody final Book book) {
    return repository.save(book);
  }

  @GetMapping("{title}")
  public Mono<Book> retrieve(@PathVariable final String title) {
    log.info("Call to title reactive retrieve");
    return repository.findById(title);
  }

  @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<Book> search(@RequestParam final String title) {
    return repository.findByTitleLike(title);
  }
}
