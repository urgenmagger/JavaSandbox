package ru.job4j.tracker;

/**
 * Item class tracker.
 *
 * @author Megger
 * @version $Id$
 * @since 0.1
 */
public class Item {
    /**
     * id - id.
     */
    private String id;
    /**
     * name - name.
     */
    private String name;
    /**
     * created - created.
     */
    private Long created;

    /**
     * users constructor.
     *
     * @param id      - specification.
     * @param name    - qualification.
     * @param created - group.
     */
    public Item(String id, String name, Long created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    /**
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id - id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return getName.
     */
    public String getName() {
        return name;
    }

    /**
     * @return getCreated.
     */
    public Long getCreated() {
        return created;
    }
}
