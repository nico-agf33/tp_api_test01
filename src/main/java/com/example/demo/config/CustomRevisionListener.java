package com.example.demo.config;

import org.hibernate.envers.RevisionListener;
import com.example.demo.entidades.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
