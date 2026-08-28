public class Sorting_Eg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int searching = 3;
        int c = -1;
        for(int i=0; i< arr.length;i++){
            if(arr[i] != searching){
                System.out.println(c);
                break;
            }
            else if(arr[i] == 3){
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}
