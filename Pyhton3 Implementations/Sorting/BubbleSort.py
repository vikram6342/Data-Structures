from typing import List

def bubble_sort(nums : List[int]) -> List[int]:
    """
    Does a Bubble sort on the list and returns the sorted List 
    
    input:
        nums -> List of numbers of type integer
    Output:
        Sorted List -> The sorted List
    """
    rev = 1
    length = len(nums)
    for i in range(length):
        flag = 1
        for j in range(length - rev):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
                flag = 0
        if flag:
            break
        rev += 1
    return nums


            