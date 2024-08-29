package com.kafkaConsumer.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private Integer empId;
	private String empName;
	private String org;
	
}
