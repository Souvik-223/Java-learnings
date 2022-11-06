public class tut16 {
    public static void print(int arr[]) {
        //Printing the sorted array
        System.out.println("\nThe sorted array is :- ");
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,1,4,2,3,5,6,};
        
        //Bubble sort 
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = 0; j < arr.length-1-i; j++) {
        //         if (arr[j]>arr[j+1]) {
        //             //swap
        //             temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // print(arr);


        //Selection sort 
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j <arr.length; j++) {
        //         if(arr[i]>arr[j]){
        //             temp = arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }

        //     }
        // }
        // print(arr);


        //Insertion sort
        int current;
        int j; 
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            j = i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            //placement 
            arr[j+1]=current;
        }
        
        print(arr);
    }
}
