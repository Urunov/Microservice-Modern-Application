package com.urunov.model;

import lombok.*;

/**
 * Created by:
 * User: hamdamboy
 * Project: IntelliJ IDEA
 * Github: @urunov
 */

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String department;
    private Long salary;


}
