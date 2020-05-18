package com.abahrami.template.book;

//import static org.hamcrest.core.IsEqual.equalTo;
//import static org.mockito.Mockito.when;
//
//import com.abahrami.template.book.domain.Book;
//import com.abahrami.template.book.repository.BookRepository;
//import org.junit.Ignore;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.reactive.server.WebTestClient;
//import reactor.core.publisher.Mono;
//
//@AutoConfigureWebTestClient
//@SpringBootTest
class BookIntegrationTest {
//
//  @MockBean private BookRepository mockBookRepository;
//  @Autowired private WebTestClient testClient;
//
//  @BeforeEach
//  public void init() {
//    MockitoAnnotations.initMocks(this);
//  }
//
//  @Test
//  @Ignore
//  public void testRetrieveApi() {
//    // Mocking the repository
//    Book book = Book.of("hp1", "Harry Potter 1", "1234");
//    when(mockBookRepository.findById("hp1")).thenReturn(Mono.just(book));
//
//    // Call reactive API to retrieve the book
//    testClient
//        .get()
//        .uri("/book/hp1")
//        .exchange()
//        .expectStatus()
//        .isOk()
//        .expectBody(Book.class)
//        .value(Book::getId, equalTo("hp1"));
//  }
}
