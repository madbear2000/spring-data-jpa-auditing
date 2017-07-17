package com.bearpawlabs.jpa.audit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@EntityListeners(FileEntityListener.class)
public class Note extends Auditable<String> {
 
    @Id
    @GeneratedValue
    private Integer id;
    
    private String content;

    public Note() {
      
    }
    
    public Note(Integer id, String content) {
      this.id = id;
      this.content = content;
    }

    
    public Integer getId() {
      return id;
    }

    
    public void setId(Integer id) {
      this.id = id;
    }

    
    public String getContent() {
      return content;
    }

    
    public void setContent(String content) {
      this.content = content;
    }

    @Override
    public String toString() {
      return "Note [id=" + id + ", content=" + content + ", createdBy=" + createdBy + ", creationDate=" + creationDate
          + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
    }


   
    
}
