package org.acme.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.*;


/**
 * Example JPA entity defined as a Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         entity1.persist();
 *
 *         List<MyEntity> entities = MyEntity.listAll();
 *     }
 * }
 */
@Entity
@Table(name="message")
public class Message extends PanacheEntity {
    @Column(length = 255, nullable = false)
    public String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

  
}
