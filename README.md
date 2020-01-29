# spring-retry-example
Implemented spring retry which can we checked through controller and test case too

### Important Notes:
#### Add following dependency:
```
		<dependency>
			<groupId>org.springframework.retry</groupId>
			<artifactId>spring-retry</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aspects</artifactId>
		</dependency>
```

		
#### @EnableRetry at main class 

#### No need to put enable retry for test main if using spring runner

#### @Recover and @Retryable can be used in both on interface as well as class
