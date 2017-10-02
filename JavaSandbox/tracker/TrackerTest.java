package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by urgen on 30.08.17.
 */
public class TrackerTest {
    /**
     * Test.
     *
     * @Test add new item.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * Test.
     *
     * @Test update item.
     */
    @Test
    public void whenUpdateNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.update(next);
        assertThat(tracker.findById(previous.getId()).getName(), is("testDescription2"));
    }
    /**
     * Test.
     *
     * @Test update item.
     */
    @Test
    public void deleteTest() {
        Tracker tracker = new Tracker();
        Item forDel = new Item("test1", "testDescriptihn", 123L);
        tracker.add(forDel);
        tracker.delete(forDel);
        assertThat(tracker.findById(forDel.getId()).getName(), is("null"));
    }
    /**
     * Test.
     * @Test findById.
     */
    @Test
    public void findByIdTest() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findById(item.getId()).getName(), is("testDescription"));
    }


}
