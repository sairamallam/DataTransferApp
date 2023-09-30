package com.example.fileManager.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Setter
@Getter
public class FilesManagerTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer fileManagerId;


    @Column(length = 30)
    private String originalFilename;
    @Column(length = 20)
    private String storedFilename;
    @Column(length = 20)
    private String operationType;
    @Column(length = 10)
    private String status;
    @Column(length = 30)
    private String outputFilename;

    @Column(length = 30)
    private String fileComment;


    //    private String uploadDate;
//    @Temporal(TemporalType.TIMESTAMP)
    @Column(length = 30)
    @CreationTimestamp
    private LocalDateTime uploadDate;


}
