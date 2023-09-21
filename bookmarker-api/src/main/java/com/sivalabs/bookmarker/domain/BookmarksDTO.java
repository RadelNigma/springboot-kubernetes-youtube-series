package com.sivalabs.bookmarker.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class BookmarksDTO {
    private List<Bookmark> data;
    private int totalElements;
    private int totalPages;
    private int currentPages;
    private boolean isFirst;
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;


}
