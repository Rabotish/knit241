package org.knit.solutions;
import org.knit.TaskDescription;

import org.knit.solutions.labor2.lab5.task16.CharacterFactory;
import org.knit.solutions.labor2.Task17.LetsMakeaDeal;
import org.knit.solutions.labor2.lab6.task18.task18;
/**
 Условие задачи:
 Дан массив целых чисел arr фиксированной длины. Необходимо продублировать каждое вхождение нуля, сдвигая остальные элементы вправо.

 Примечание:

 Элементы, выходящие за пределы исходного массива, не записываются.
 Изменения нужно выполнить на месте (in-place), не возвращая новый массив.
 */
@TaskDescription(taskNumber = 18, taskDescription = "Задача № 18")
public class Task18 implements Solution {



    @Override
    public void execute() {
        task18 task18 = new task18();
        int[]arr = {1, 0, 2, 3, 0, 4, 5, 0};
        task18.duplicateZeros(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
