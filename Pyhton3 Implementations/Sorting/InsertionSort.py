from typing import List

def bubble_sort(nums : List[int]) -> List[int]:
    """
    Does a Insertion sort on the list and returns the sorted List 
    
    input:
        nums -> List of numbers of type integer
    Output:
        Sorted List -> The sorted List
    """
    length = len(nums)
    for i in range(1, length):
        target = nums[i]
        j = i - 1
        while j >= 0 and nums[j] > target:
            nums[j + 1] = nums[j]
            j -= 1
        nums[j + 1] = target
    
    return nums

            