from src.eight_kyu.count_sum import count_positives_sum_negatives

def test_pos_count_is_1_and_neg_sum_is_0():
  assert count_positives_sum_negatives([1]) == [1,0]