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
    }
}
