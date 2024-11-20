package springsecurityst4.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor 
@Entity 
@Table(name = "Products") 
public class Product implements Serializable{ 
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	@Column(columnDefinition = "nvarchar(255)") 
	private String name; 
	@Column(columnDefinition = "nvarchar(255)") 
	private String brand; 
	@Column(columnDefinition = "nvarchar(255)") 
	private String madein; 
	private float price;
}
