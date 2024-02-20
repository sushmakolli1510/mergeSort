//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a={30,20,40,10,90};
        int l=a.length;
        mergeSort(a,0,l-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int[] a,int l,int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }
        public static void merge(int[] a,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int[] b=new int[a.length];
        while(i<=mid&&j<=r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
            if(i>mid){
                while(j<=r){
                    b[k]=a[j];
                    k++;
                    j++;
                }
            }else{
                while(i<=mid){
                    b[k]=a[i];
                    k++;
                    i++;
                }
            }
            for(int p=l;p<=r;p++){
                a[p]=b[p];
            }
    }
}