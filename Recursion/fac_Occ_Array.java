public class fac_Occ_Array {
    public static void main(String[] args) {
        int[] arr = {5,89,1,8,1,76,1,7};
        System.out.println(indexOf(arr, 0, 1));
    }

    public static int indexOf(int[] arr, int idx,int item){
        if(arr[idx]==item){
            return idx;
        }

        return indexOf(arr,idx+1,item);
    }
}
