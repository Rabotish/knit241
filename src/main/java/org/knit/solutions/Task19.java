package org.knit.solutions;

import org.knit.TaskDescription;

import org.knit.solutions.labor2.lab5.task16.CharacterFactory;
import org.knit.solutions.labor2.Task17.LetsMakeaDeal;
import org.knit.solutions.labor2.lab6.task18.task18;
import org.knit.solutions.labor2.lab6.task19;

/**
 Условие задачи:
 Дан массив целых чисел arr фиксированной длины. Необходимо продублировать каждое вхождение нуля, сдвигая остальные элементы вправо.

 Примечание:

 Элементы, выходящие за пределы исходного массива, не записываются.
 Изменения нужно выполнить на месте (in-place), не возвращая новый массив.
 */
@TaskDescription(taskNumber = 19, taskDescription = "Задача № 19")
public class Task19 implements Solution {



    @Override
    public void execute() {
        task19 task19 = new task19();
        int[]nums1 = {1, 2, 3, 0, 0, 0};

        int[]nums2 = {2, 5, 6};
        task19.merge(nums1, 3, nums2, 3);
        for(int i=0; i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }
    }
}