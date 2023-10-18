from typing import List
def Linear_Search(nums : List[int], target : int) -> int:
    """
    Does a Linear search on the list and returns the index position of 
    the target if found else returns -1

    input:
        nums -> List of numbers of type integer
        target -> The value to be searched for in the list nums
    Output:
        index -> The index position in which the target is found
                If not found returns -1
    """
    
    for ind, val in enumerate(nums):
        if val == target:
            return ind
        
    return -1