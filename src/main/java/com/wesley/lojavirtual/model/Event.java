package com.wesley.lojavirtual.model;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity 
@Table(name="events")
public class Event {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
		
	
	@Column(name="eventType" , length = 100, nullable = false)
	private String eventType;
	
	@Column(name="eventDateTime" , length = 100, nullable = false)
	private String eventDateTime;
	
	
		
	@Override
	public int hashCode() {
		return Objects.hash(eventDateTime, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return Objects.equals(eventDateTime, other.eventDateTime) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventType=" + eventType + ", eventDateTime=" + eventDateTime + "]";
	}

	
	

}
