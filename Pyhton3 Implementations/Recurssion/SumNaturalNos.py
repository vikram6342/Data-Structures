def parametarized_natural_sum(n : int, sum : int = 0) -> None:
    """
    This function is to print
    the sum of n natural numbers
    Arguments:
    n - an integer value used to represent
        the nth number of the n natural numbers
    
    sum - an integer argument used to represent
            the sum
    """

    if n <= 0:
        print(sum)
        return

    parametarized_natural_sum(n - 1, sum + n)


def functional_natural_sum(n : int) -> None:
    """
    This function is to return 
    the sum of n natural numbers
    Arguments:
    n - an integer value used to represent
        the nth number of the n natural numbers
    """

    if n < 1:
        return 0

    return n + functional_natural_sum(n - 1)
        
    
print(functional_natural_sum(6))