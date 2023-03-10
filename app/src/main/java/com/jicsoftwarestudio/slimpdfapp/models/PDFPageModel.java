package com.jicsoftwarestudio.slimpdfapp.models;

import android.net.Uri;

public class PDFPageModel {
    private int pageNumber;
    private Uri thumbnailUri;

    public PDFPageModel() {
    }

    public PDFPageModel(int i, Uri uri) {
        this.pageNumber = i;
        this.thumbnailUri = uri;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int i) {
        this.pageNumber = i;
    }

    public Uri getThumbnailUri() {
        return this.thumbnailUri;
    }

    public void setThumbnailUri(Uri uri) {
        this.thumbnailUri = uri;
    }
}
