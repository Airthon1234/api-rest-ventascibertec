package pe.edu.cibertec.apirestventascibertec.model.dto;

import lombok.Data;

@Data
public class CategoryDto implements DtoEntity{

    private Integer categoryid;
    private String categoryname;
}
