def recursive_1_to_n(n : int, start : int = 1) -> None: #Non Backtracking Approach
    """
    This is a function used to print
    N natural numbers from 1 - N
    Argument:
        n - Nth natural number
        start - integer always less 
                than n that is to be printed
    returns None
    """
    if start > n:
        return 
    print(start)
    recursive_1_to_n(n, start + 1)



def backtrack_recursive_1_to_n(n : int) -> None: #backtracking Approach
    """
    This is a function used to print
    N natural numbers from 1 - N
    Argument:
        n - Nth natural number
    
    returns None
    """
    
    if n < 1:
        return 
    
    recursive_1_to_n(n - 1)
    print(n)
    
def recursive_n_to_1(n : int) -> None: #Non - backtracking Approach
    """
    This is a function used to print
    N natural numbers from N - 1
    Argument:
        n - Nth natural number
    
    returns None
    """
    
    if n < 1:
        return 
    
    print(n)
    recursive_n_to_1(n - 1)
    

        
def backtrack_recursive_n_to_1(n : int, start : int = 1) -> None: #Backtracking Approach
    """
    This is a function used to print
    N natural numbers from N - 1
    Argument:
        n - Nth natural number
        start - integer always less 
                than n that is to be printed
    returns None
    """
    if start > n:
        return 
    backtrack_recursive_n_to_1(n, start + 1)
    
    print(start)
    


    
    
recursive_1_to_n(21) #Note tc -> O(n) sc ->O(n){recursive stack space}


