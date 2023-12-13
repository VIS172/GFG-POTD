def isSubset( a1, a2, n, m):
    flag = "Yes"
    for i in a2:
        if i not in a1 or a1.count(i)<a2.count(i):
            flag = "No"
            break
    return flag