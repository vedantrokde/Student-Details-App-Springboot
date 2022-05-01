package com.code.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner runner(StudentRepo repo, MongoTemplate template) {
		return args -> {
			Address address = new Address("India", "Madhurai", "600127");

			String email = "ram@gmail.com";
			Student student = new Student("Ram", "G", email, Gender.MALE, address, List.of("Java", "Python", "Computer Science"), BigDecimal.TEN, LocalDateTime.now());

			// usingMongoTemplateAndQuery(repo, template, email, student);

			repo.findStudentByEmail(email).ifPresentOrElse(s -> {
				System.out.println(s + " already exits.");
			}, () -> {
				System.out.println("Inserting: " + student);
				repo.insert(student);
			});
		};
	}*/

	/*
	private void usingMongoTemplateAndQuery(StudentRepo repo, MongoTemplate template, String email, Student student) {
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));

		List<Student> students =  template.find(query, Student.class);
		if (students.size()>1) {
			throw new IllegalStateException("Found many students with email " + email);
		}

		if(students.isEmpty()){
			System.out.println("Inserting: " + student);
			repo.insert(student);
		} else {
			System.out.println(student + " already exits.");
		}
	}
	*/
}
