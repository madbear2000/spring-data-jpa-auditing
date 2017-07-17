package com.bearpawlabs.jpa.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaAuditingApplication implements CommandLineRunner {

  // See https://programmingmitra.blogspot.ie/2017/02/automatic-spring-data-jpa-auditing-saving-CreatedBy-createddate-lastmodifiedby-lastmodifieddate-automatically.html
  // And https://github.com/njnareshjoshi/articles/blob/master/spring-data-jpa-auditing/src/main/java/org/programming/mitra/SpringDataJpaAuditingApplication.java
  
    @Autowired
    private NoteRepository noteRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaAuditingApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {

        Note note = new Note();
        note.setContent("Test Note");

        noteRepository.save(note);

        noteRepository.findAll().stream().forEach(n -> System.out.println(n.toString()));

    }
}
