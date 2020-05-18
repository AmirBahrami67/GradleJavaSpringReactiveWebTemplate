package com.abahrami.template.book.controller

import com.abahrami.template.book.domain.Book
import com.abahrami.template.book.repository.BookRepository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import spock.lang.Specification

/**
 * BookController unit tests.
 */
class BookControllerSpec extends Specification {

    private BookController controller
    private BookRepository mockRepository
    private Book sampleBook

    void setup() {
        mockRepository = Mock()
        controller = new BookController(mockRepository)
        sampleBook = new Book('hp1', 'Harry Potter 1', 'isbn1')
    }

    void 'should call service for create'() {
        given:
        Mono<Book> expectedResult = Mono.just(sampleBook)
        1 * mockRepository.save(sampleBook) >> expectedResult

        expect:
        controller.create(sampleBook) == expectedResult
    }

    void 'should call service for retrieve'() {
        given:
        Mono<Book> expectedResult = Mono.just(sampleBook)
        1 * mockRepository.findById('id1') >> expectedResult

        expect:
        controller.retrieve('id1') == expectedResult
    }

    void 'should call service for search'() {
        given:
        Flux<Book> expectedResult = Flux.just(sampleBook)
        1 * mockRepository.findByTitleLike('harry') >> expectedResult

        expect:
        controller.search('harry') == expectedResult
    }
}
