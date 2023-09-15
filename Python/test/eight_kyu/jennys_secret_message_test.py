from src.eight_kyu.jennys_secret_message import greet



def test_should_greet_some_James_normally():
  assert greet("James") == "Hello, James!"

def test_should_greet_some_Jane_normally():
  assert greet("Jane") == "Hello, Jane!"

def test_should_greet_some_Jim_normally():
  assert greet("Jim") == "Hello, Jim!"

def test_should_greet_some_John_specially():
  assert greet("Johnny") == "Hello, my love!"