def rotate( arr, n):
    last = arr[n-1]
    for index in range(n-1, -1, -1):
        arr[index] = arr[index - 1]
    arr[0] = last
    return arr