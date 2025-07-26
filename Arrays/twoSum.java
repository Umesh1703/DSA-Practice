//Brute Approach (Boolean Type)

// class twoSum{
//     public static void main(String[] args){
//         int arr[] = {2,6,5,8,11};
//         int n = arr.length;
//         int target = 14;
//         boolean ans = false;

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i == j){
//                     continue;
//                 }

//                 if(arr[i] + arr[j] == target){
//                     ans = true;
//                 }
//             }
//         }
//         System.out.println(ans);
//     }
// }



//Brute Approach (Indices Type)

// import java.util.*;
// class twoSum{
//     public static void main(String[] args){
//         List<Integer> ans = new ArrayList<>();
//         int arr[] = {2,6,5,8,11};
//         int n = arr.length;
//         int target = 14;  

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i == j){
//                     continue;
//                 }

//                 if(arr[i] + arr[j] == target){
//                     ans.add(i);
//                     ans.add(j);
//                     break;
//                 }
//             }
//             if (!ans.isEmpty()){
//                 break;
//             }
//         }
//         System.out.println(ans);
//     }
// }



//Better Appraoch (Boolean Type)

// import java.util.*;
// class twoSum{
//     public static void main(String[] args){
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         int arr[] = {2,6,5,8,11};
//         int n = arr.length;
//         int target = 14;  

//         for(int i=0;i<n;i++){
//             int moreNeeded = target - arr[i];

//             if(hm.containsKey(moreNeeded)){
//                 System.out.println("Yes");
//             }

//             hm.put(arr[i],i);
//         }

//         System.out.println("No");
//     }
// }


//Better Approach (Indices Type)

// import java.util.*;
// class twoSum{
//     public static void main(String[] args){
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         int arr[] = {2,6,5,8,11};
//         int n = arr.length;
//         int target = 14;

//         int[] ans = new int[2];
//         ans[0] = ans[1] = -1;

//         for(int i=0;i<n;i++){
//             int moreNeeded = target - arr[i];

//             if(hm.containsKey(moreNeeded)){
//                 ans[0] = hm.get(moreNeeded);
//                 ans[1] = i;
//             }

//             hm.put(arr[i],i);
//         }

//         System.out.println(Arrays.toString(ans));
//     }
// }



//Optimal Approach (Boolean Type)

import java.util.*;
class twoSum{
    public static void main(String[] args){
        int arr[] = {2,6,5,8,11};
        int n = arr.length;
        Arrays.sort(arr);
        int target = 14;
        int left = 0;
        int right = n-1;
        int sum = 0;
        boolean ans = false;

        while(left < right){
            sum = arr[left] + arr[right];
            if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
            else{
                ans = true;
                break;
            }
        }

        System.out.println(ans);
    }
}