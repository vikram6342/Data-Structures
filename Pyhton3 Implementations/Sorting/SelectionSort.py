from typing import List

def selection_sort(nums : List[int]) -> List[int]:
    """
    Does a Selection sort on the list and returns the sorted List 
    
    input:
        nums -> List of numbers of type integer
    Output:
        Sorted List -> The sorted List
    """
    length = len(nums)
    for i in range(length):
        min = i
        for j in range(i + 1, length):
            if nums[j] < nums[min]:
                min = j
        nums[i], nums[min] = nums[min], nums[i]
    return nums


print(selection_sort([2,3,212,4,43,54,5,3,42,34,65,7,5,423,345,7,524,3342,344,54]))
        