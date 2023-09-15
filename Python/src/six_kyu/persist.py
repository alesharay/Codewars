
def multiply(val, counter):

  split_num = list(str(val))
  if len(split_num) < 2:
    return counter
  else:
    counter += 1

  num = 1
  # do math here
  for s in split_num:
    num = num * int(s)

  #evaluate if single digit
  if len(str(num)) > 1:
    counter = multiply(str(num), counter)

  return counter

def persistence(n):
    # your code
    result = multiply(n, 0)
    return result

print("\nexpected: 0\nreceived: ", persistence(0))
print("\nexpected: 3\nreceived: ", persistence(39))
print("\nexpected: 0\nreceived: ", persistence(4))
print("\nexpected: 2\nreceived: ", persistence(25))
print("\nexpected: 4\nreceived: ", persistence(999))