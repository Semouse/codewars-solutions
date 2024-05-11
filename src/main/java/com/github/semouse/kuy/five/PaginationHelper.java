package com.github.semouse.kuy.five;


import java.util.List;

/**
 * Task: <a href="https://www.codewars.com/kata/515bb423de843ea99400000a/train/java">source</a>
 */
public class PaginationHelper<T> {

    private final List<T> elements;
    private final int itemsPerPage;

    public PaginationHelper(List<T> elements, int itemsPerPage) {
        this.elements = elements;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return elements.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return elements.size() % itemsPerPage == 0 ?
                elements.size() / itemsPerPage : elements.size() / itemsPerPage + 1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex * itemsPerPage >= elements.size()) {
            return -1;
        }
        return pageIndex * itemsPerPage + itemsPerPage > elements.size() ?
                elements.size() - pageIndex * itemsPerPage : itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return itemIndex >= elements.size() || itemIndex < 0 ?
                -1 : itemIndex / itemsPerPage;
    }
}
