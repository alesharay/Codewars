# https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

'''
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
'''


# def filter_list(currentList):
#     # a place to hold the new list
#     newList = []
#     # for each value in the given list
#     for currentValue in currentList:
#         # if the value type is not string
#         if type(currentValue) is not str:
#             # add it to the new list
#             newList.append(currentValue)
#     # return the new list
#     return newList


def filter_list(currentList):
    return list(filter(lambda value: type(value) is not str, currentList))


def main():
    print(filter_list([1, 2, 'a', 'b']), [1, 2])
    print(filter_list([1, 'a', 'b', 0, 15]), [1, 0, 15])
    print(filter_list([1, 2, 'aasf', '1', '123', 123]), [1, 2, 123])


if __name__ == "__main__":
    main()
