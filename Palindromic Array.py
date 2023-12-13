def PalinArray(arr ,n):
    c=0
    for i in range(n):
        rev=0
        num=arr[i]
        while num>0:
            m=num%10
            rev=rev*10+m
            num=num//10
            if (arr[i]==rev):
                c=c+1
    if c==(n):
        return 1
    else:
        return 0