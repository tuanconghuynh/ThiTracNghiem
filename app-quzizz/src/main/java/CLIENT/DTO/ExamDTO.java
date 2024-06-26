/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLIENT.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import lombok.AllArgsConstructor;

/**
 *
 * @author tuanc
 */

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class ExamDTO extends Object {
    private Integer id;
    private int userID;
    private String subject;
    private String class_room;
    private Integer quantity;
    private int status;
    private Integer total_time;
}
