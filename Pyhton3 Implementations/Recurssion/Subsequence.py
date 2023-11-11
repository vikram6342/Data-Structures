from typing import List

def subsequence(nums : List[int], start : int, subsequence_list : List[int] = []) -> None:
    """
    This is a function used to print the subsequence form a given list
    """
    if start >= len(nums):
        print(subsequence_list)
        return 
    
    subsequence_list.append(nums[start])
    
    subsequence(nums, start + 1, subsequence_list)
    subsequence_list.pop()
    subsequence(nums, start + 1, subsequence_list)
    
    
subsequence([1,2,3], 0)