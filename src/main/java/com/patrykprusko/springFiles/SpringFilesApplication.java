package com.patrykprusko.springFiles;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *web application -> a tool for uploading Excel, CSV, JSON files from the disk, which then displays on the GUI the content of the uploaded data records,
 * if another file is uploaded, UPDATE is done and the list of displayed records is updated. In each record I added
 * field what file type, e.g. XLS / XLSX, CSV, JSON. If empty it will add empty content. All read records are added
 * to MySQL database -> database-> readfiledata, table -> policy.
 * 
 * Application built on the website start.spring.io:
 * 1. Web
 * 2. JPA
 * 3. MySQL
 * 4. DevTools
 * 5. Thymeleaf
 * 
 * @author Shreya
 *
 */
@SpringBootApplication
public class SpringFilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFilesApplication.class, args);
	}

}
