package Pract6;


class Student{
    public int idNumber[];

    public Student(){
        idNumber = new int[6];
        idNumber[0] = 79;
        idNumber[1] = 45;
        idNumber[2] = 15;
        idNumber[3] = 22;
        idNumber[4] = 1;
        idNumber[5] = 25;
    }

    public void selectionSort(){
        for (int i = 0; i < idNumber.length-1; i++){
            int min_i = i;
            for ( int j = i + 1; j < idNumber.length; j++){
                if (idNumber[j] < idNumber[min_i])
                    min_i = j;
            }
            int tmp = idNumber[min_i];
            idNumber[min_i] = idNumber[i];
            idNumber[i] = tmp;
        }
    }

    public void PrintScr(){
        for ( int aIdNumber : idNumber){
            System.out.print(aIdNumber + " ");
        }
    }
}