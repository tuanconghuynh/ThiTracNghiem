/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVER.DTO;

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
public class QuestionDTO {
    private Integer id;
    private Integer examID;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;
}
