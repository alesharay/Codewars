## https://www.codewars.com/kata/is-this-my-tail

'''
Some new animals have arrived at the zoo. The zoo keeper is concerned that perhaps the animals do not have the right tails. To help her, you must correct the broken function to make sure that the second argument (tail), is the same as the last letter of the first argument (body) - otherwise the tail wouldn't fit!

If the tail is right return true, else return false.

The arguments will always be strings, and normal letters.
'''

def correct_tail(body, tail):
  return body.endswith(tail)

def main():
  print(correct_tail("Fox", "x"), True)
  print(correct_tail("Rhino", "o"), True)
  print(correct_tail("Meerkat", "t"), True)
  print(correct_tail("Emu", "t"), False)
  print(correct_tail("Badger", "s"), False)
  print(correct_tail("Giraffe", "d"), False)

if __name__ == "__main__":
  main()