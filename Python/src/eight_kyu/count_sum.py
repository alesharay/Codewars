# https://www.codewars.com/kata/count-of-positives-slash-sum-of-negatives


def count_positives_sum_negatives(arr):
    countPos = 0
    negSum = 0
    if arr is None or len(arr) is 0:
        return []
    else:
        for value in arr:
            if value > 0:
                countPos += 1
            else:
                negSum += value
    return [countPos, negSum]


def main():
    print(count_positives_sum_negatives(
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]), [10, -65])

    print(count_positives_sum_negatives(
        [0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14]), [8, -50])
    print(count_positives_sum_negatives([1]), [1, 0])
    print(count_positives_sum_negatives([-1]), [0, -1])
    print(count_positives_sum_negatives(
        [0, 0, 0, 0, 0, 0, 0, 0, 0]), [0, 0])
    print(count_positives_sum_negatives([]), [])


if __name__ == "__main__":
    main()
