package com.github.semouse.kuy.five;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaginationHelperTest {

    private final List<Character> collection = List.of('a', 'b', 'c', 'd', 'e', 'f');
    private final PaginationHelper<Character> helper = new PaginationHelper<>(collection, 4);

    @Test
    void testPageCount() {
        assertEquals(2, helper.pageCount(), "pageCount is returning incorrect value");
    }

    @Test
    void testItemCount() {
        assertEquals(6, helper.itemCount(), "itemCount is returning incorrect value");
    }


    @Test
    void testPageItemCount() {
        assertEquals(4, helper.pageItemCount(0),
                "pageItemCount is returning incorrect value for page 0");
        assertEquals(2, helper.pageItemCount(1),
                "pageItemCount is returning incorrect value for page 1");
        assertEquals(-1, helper.pageItemCount(2),
                "pageItemCount is returning incorrect value for page 2");
    }

    @Test
    void testPageIndex() {
        assertEquals(1, helper.pageIndex(5), "pageIndex is returning incorrect value for index 5");
        assertEquals(0, helper.pageIndex(2), "pageIndex is returning incorrect value for index 2");
        assertEquals(-1, helper.pageIndex(20), "pageIndex is returning incorrect value for index 20");
        assertEquals(-1, helper.pageIndex(-10), "pageIndex is returning incorrect value for index -10");
    }

    @Test
    void emptyCollection() {
        PaginationHelper<?> empty = new PaginationHelper<>(List.of(), 10);
        assertEquals(0, empty.itemCount(), "itemCount is returning incorrect value");
        assertEquals(0, empty.pageCount(), "pageCount is returning incorrect value");
        assertEquals(-1, empty.pageIndex(0), "pageIndex(0) called when there was an empty collection");
        assertEquals(-1, empty.pageIndex(1), "pageIndex(1) called when there was an empty collection");
        assertEquals(-1, empty.pageIndex(-1),
                "pageIndex(-1) called when there was an empty collection");
        assertEquals(-1, empty.pageItemCount(0),
                "pageItemCount is returning incorrect value for page 0");
        assertEquals(-1, empty.pageItemCount(1),
                "pageItemCount is returning incorrect value for page 1");
    }
}