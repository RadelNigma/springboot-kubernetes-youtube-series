import React from "react";
import {BookmarksResponse} from "@/services/models";

interface BookmarksProps {
    bookmarks: BookmarksResponse
}

const Bookmarks: React.FC<BookmarksProps> = ({bookmarks})=> (
    <div>
        {bookmarks.data.map(bookmark => <h2>{bookmark.title}</h2>)}
    </div>
);

export default Bookmarks