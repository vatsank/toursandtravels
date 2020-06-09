package com.example.demo.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@NoArgsConstructor
@Slf4j
public  class MyRefinedSingleton {

		private int id;
		
		
		@Autowired
		MyPrototype proto;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		@Lookup
		public MyPrototype getProto() {
			log.info("Lookup Called");
			return proto;
		}


		public void setProto(MyPrototype proto) {
			this.proto = proto;
		}
		
		
		
	}


