/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLIENT.DTO;

import SERVER.DTO.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author tuanc
 */

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO {
    private Integer id;
    private int examID;
    private int userID;
    private float score;
}
