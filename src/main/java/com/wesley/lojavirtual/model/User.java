package com.wesley.lojavirtual.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_event",joinColumns = @JoinColumn(name="users_id" , referencedColumnName="id"),
	inverseJoinColumns = @JoinColumn(name= "events_id" , referencedColumnName = "id"))
	
    private List <Event> event = new ArrayList<>();
	
	@Column(name="nikename", length = 100, nullable = false)
	private String nikename;
	
	@Column(name="registration", length = 80, nullable = false)
	private String registration;
	
	@Column(name="date",length = 8,  nullable = false)
	private String date;
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", nikename=" + nikename + ", registration=" + registration + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id);
	}
}
