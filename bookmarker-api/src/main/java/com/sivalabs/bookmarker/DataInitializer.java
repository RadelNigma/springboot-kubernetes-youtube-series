package com.sivalabs.bookmarker;

import com.sivalabs.bookmarker.domain.Bookmark;
import com.sivalabs.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        repository.save(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io", Instant.now()));
        repository.save(new Bookmark(null, "Micronaut", "https://micronaut.io", Instant.now()));
        repository.save(new Bookmark(null, "JOOQ", "https://jooq.org", Instant.now()));
        repository.save(new Bookmark(null, "VladMihalcea", "https://vlamMihalcea.com", Instant.now()));
        repository.save(new Bookmark(null, "Thoughts On Java", "https://thorben-jansson.com", Instant.now()));
        repository.save(new Bookmark(null, "DZone", "https://dzone.com", Instant.now()));
        repository.save(new Bookmark(null, "DevOpsBookmarks", "https://devopsbookmarks.com", Instant.now()));
        repository.save(new Bookmark(null, "Kubernetes Docs", "https://kubernrtes.io/docs/home", Instant.now()));
        repository.save(new Bookmark(null, "Expressjs", "https://expressjs.com", Instant.now()));
        repository.save(new Bookmark(null, "Marcobehler", "https://marcobehler.com", Instant.now()));
        repository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com/", Instant.now()));
        repository.save(new Bookmark(null, "devglan", "https://www.devglan.com/", Instant.now()));
        repository.save(new Bookmark(null, "lenuxize", "https://www.lenuxize.com/", Instant.now()));

    }
}
