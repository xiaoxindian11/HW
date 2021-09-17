class Array{
    public static void main(String[] args) {
        
    }

    static int sum(int[] arr){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static int[] toPower(int size, int power){
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)Math.pow(i,power);
        }
        return arr;
    }

}