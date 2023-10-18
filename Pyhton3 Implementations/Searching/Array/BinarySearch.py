from typing import List

def binary_search(nums : List[int], target : int) -> int:
    """
    Does a Binary search on the list and returns the index position of 
    the target if found else returns -1
    The given list is assumed to be sorted in ascending order

    input:
        nums -> List of numbers of type integer
        target -> The value to be searched for in the list nums
    Output:
        index -> The index position in which the target is found
                If not found returns -1
    """
    
    start, end = 0, len(nums) - 1
    while start <= end:
        mid = (start + end) >> 1
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
            
    return -1

def recurssive_binary_search(nums : List[int], target : int, start : int, end : int) -> int:
    """
    Does a Binary search recursively on the list and returns the index position of 
    the target if found else returns -1
    The given list is assumed to be sorted in ascending order

    input:
        nums -> List of numbers of type integer
        target -> The value to be searched for in the list nums
        start -> starting index for the search 
        end -> ending index for the search
    Output:
        index -> The index position in which the target is found
                If not found returns -1
    """
    
    if start > end:
        return -1
    mid = (start + end) >> 1
    if nums[mid] == target:
        return mid
    elif nums[mid] < target:
        return recurssive_binary_search(nums, target, mid + 1, end)
    else:
        return recurssive_binary_search(nums, target, start, mid - 1)
    
    
