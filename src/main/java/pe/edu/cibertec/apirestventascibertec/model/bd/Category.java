package pe.edu.cibertec.apirestventascibertec.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="categories")
public class Category {

    private Integer categoryid;
    private String categoryname;
    private String description;
}
