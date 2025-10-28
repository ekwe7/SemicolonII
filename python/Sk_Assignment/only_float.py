
def check_float(a, b):
    a_is_float = is_float(a)
    b_is_float = is_float(b)

    if a_is_float and b_is_float:
        return 2
    elif a_is_float or b_is_float:
        return 1
    else:
        return 0
        
        
        