package Questions.Recursion;

public class MinArraySearch {
    public int MinArraySearch(int[] arr, int index){
        if(index == arr.length - 1) return arr[index];
        int minEle = MinArraySearch(arr, index + 1);
        return Math.min(minEle, arr[index]);
    }
    public static void main(String[] args) {
        MinArraySearch mas = new MinArraySearch();
        System.out.println(mas.MinArraySearch(new int[]{9, 2, 5, 1, 2, 0, 5}, 0));
    }
}
