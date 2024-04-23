/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLIENT.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author tuanc
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyExamResult {
    private int id;
    private int amount_correct;
    private int amount_incorrect;
    private  float time_doing;
    private float point;
    private int rank;
}
