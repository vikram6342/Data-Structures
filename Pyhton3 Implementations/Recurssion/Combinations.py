from typing import List
def combinations(nums : List[int], is_visited : List[int], temp_ans : List[int] = []) -> None:
    
    if len(temp_ans) == len(nums):
       print(temp_ans)
       return
    
    for i in range(len(nums)):
        if is_visited[i]:
            continue
        is_visited[i] = 1
        temp_ans.append(nums[i])
        combinations(nums, is_visited, temp_ans)
        temp_ans.pop()
        is_visited[i] = 0
combinations([1,2,3], [0, 0, 0])

        