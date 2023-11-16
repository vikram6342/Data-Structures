from typing import List

ans = []
def combinations(nums : List[int], is_visited : List[int], temp_ans : List[int] = []) -> None:
    
    
    global ans
    if len(temp_ans) == len(nums):
       ans.append(temp_ans.copy())
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
print(ans) 