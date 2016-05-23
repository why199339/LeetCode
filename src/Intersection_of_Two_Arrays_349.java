import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Intersection_of_Two_Arrays_349 {

	public static void main(String[] args) {

		int[] nums1 = {1, 2, 2, 1,3,-1};
		int[] nums2 = {2,2,3,-1};
		int[] nums3 = intersection(nums1, nums2);
		
		System.out.println(Arrays.toString(nums3));
	}

	/*
	 * own: O(n^2)
	public static int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        boolean flag = false;
        for (int i : nums1) {
        	flag = false;
			for (int j : nums2) {
				if(i == j) {
					flag = true;
					break;
				}
			}
			if(flag)
				set.add(i);
		}
        int size = set.size();
        int[] num3 = new int[size];
        for (int i = 0; i < size; i++) {
			num3[i] = set.pollFirst();
		}
        return num3;
    }*/
	
	//two HashSet: O(n)
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
	
	/*
	 * two pointers: O(nlogn)
	 public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
	 */
	
	/*
	 * binary tree: O(nlogn)
	 public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }

    public boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
	 * 
	 */
}
