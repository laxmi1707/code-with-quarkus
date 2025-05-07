package org.acme.repository;

import org.acme.domain.Message;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@ApplicationScoped
public class MessageRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void save(String content) {
        Message msg = new Message();
        msg.content = content;
        em.persist(msg);
    }

}
