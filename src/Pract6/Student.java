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
        int n = idNumber.length;
        for (int i = 1; i < n; ++i) {
            int key = idNumber[i];
            int j = i - 1;
            while (j >= 0 && idNumber[j] > key) {
                idNumber[j + 1] = idNumber[j];
                j = j - 1;
            }
            idNumber[j + 1] = key;
        }
    }

    public void PrintScr(){
        for ( int aIdNumber : idNumber){
            System.out.print(aIdNumber + " ");
        }
    }
}