
class median
{
    public static int find_median(int[] v)
    {
        // Code here
        int temp;
        for(int i=0;i<v.length-1;i++){
            for(int j=i+1;j<v.length;j++){
                if(v[i]>v[j]){
                    temp=v[i];
                    v[i]=v[j];
                    v[j]=temp;
                }
            }
        }
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
        int length=v.length;
        System.out.println(length);
        int mid=0;
        if(length%2!=0){
            mid=(length/2);
            return v[mid];
        }else{
            mid=length/2;
            return((v[mid]+v[(mid-1)])/2);
        }
    }
    public static void main(String[] args) {
        int v[]={12,14,13};
        int res=find_median(v);
        System.out.println(res);
    }
}