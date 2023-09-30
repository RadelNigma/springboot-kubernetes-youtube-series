package com.sivalabs.bookmarker.api;

import com.sivalabs.bookmarker.domain.BookmarkDTO;
import com.sivalabs.bookmarker.domain.BookmarkService;
import com.sivalabs.bookmarker.domain.BookmarksDTO;
import com.sivalabs.bookmarker.domain.CreateBookmarkRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query", defaultValue = "") String query) {
        if (query == null || query.trim().isEmpty()) {
            return bookmarkService.getBookmark(page);
        }
        return bookmarkService.searchBookmarks(query, page);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDTO createBookmark(@RequestBody @Valid CreateBookmarkRequest request) {
        return bookmarkService.createBookmark(request);
    }

}
