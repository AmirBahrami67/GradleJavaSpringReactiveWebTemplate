package com.abahrami.template.book.repository;

import com.abahrami.template.book.domain.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {

  Flux<Book> findByTitleLike(String strings);
}
