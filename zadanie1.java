/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zamena_simvolov;
/**
 *
 * @author danil
 */
public class Zamena_simvolov {

    /**
     * @param args the command line arguments
     */
    
    // перед запуском кода, в настройках проекта необходимо указать кодировку Windows-1251
    
    public static void main(String[] args) {
        int i,size;
        byte[] nums;
        
        String s ="eat++    some/    more^%# o#f%#^ these   soft french %#bun%s ++and drink   some tea";
        
        // объявляем объект size, который содержит в себе длинну объекта s.
        size=s.length();
        // метод getBytes кодирует данную строку в последовательность байтов.
        nums=s.getBytes();
        
        /* создаем байтовые объекты, содержащие в себе индексы первой и последней
        буквы английского алфавита, а также индекс пробела и пустого значения */
        byte indexFirstLetter, indexLastLetter, indexSpace, indexZero;
        indexFirstLetter = 97;
        indexLastLetter = 122;
        indexSpace = 32;
        indexZero = 0;
        
        /* проверка на вхождение символов, не являющихся буквами латинского
           алфавита*/
        
        for (i=0;i<size;i++){
            if ((nums[i]<indexFirstLetter || nums[i]>indexLastLetter) && nums[i]!=indexSpace){
                nums[i]=indexZero;
            }
        }
        
        // проверка на вхождение на нескольких пробелов рядом
        
        for (i=0;i<size;i++){
            if (nums[i]==indexSpace && nums[i+1]==indexSpace){
                nums[i]=indexZero;
            }
        }
        
        String cleanString = new String(nums);
        System.out.println(cleanString);
    }
    
}
