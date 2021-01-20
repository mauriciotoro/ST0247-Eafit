def brute_max_subarray(array):
  maximum = 0
  for i in range(0, len(array):
    current = 0
    for j in range(i, len(array):
       current += array[j]
       if current > maximum:
         maximum = current
  return maximum