from src.eight_kyu.two_word_name import abbrev_name

def test_Sam_Harris_abbreviates_to_SH():
  assert abbrev_name("Sam Harris") == "S.H"

def test_patrick_feenan_abbreviates_to_PF():
  assert abbrev_name("patrick feenan") == "P.F"

def test_Evan_C_abbreviates_to_EC():
  assert abbrev_name("Evan C") == "E.C"

def test_P_Favuzzi_abbreviates_to_PF():
  assert abbrev_name("P Favuzzi") == "P.F"

def test_David_Mendieta_abbreviates_to_DM():
  assert abbrev_name("David Mendieta") == "D.M"

def test_Alesha_Monique_Ray_abbreviates_to_AMR():
  assert abbrev_name("Alesha Monique Ray") == "A.M.R"

def test_Alesha_abbreviates_to_A():
  assert abbrev_name("Alesha") == "A"