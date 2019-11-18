package com.example.demo.entity;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "A")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ToDo {

	private ObjectId _id;
	
	private String title;
	
	private String description;
	
	public String get_id() {
		return _id.toHexString();
	}
}
