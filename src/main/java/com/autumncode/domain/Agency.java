package com.autumncode.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Agency extends Base {
    @Column
    String name;
    @OneToOne(cascade = CascadeType.ALL)
    Backlog backlog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agency{");
        sb.append("name='").append(name).append('\'');
        sb.append(", backlog=").append(backlog);
        sb.append('}');
        return sb.toString();
    }
}
