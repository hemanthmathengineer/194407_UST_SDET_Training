import pytest

def test_file1_method1():
	x=5
	y=6
	assert x+1 == y,"test failed"
	assert x == y,"test failed"
def test_file1_method2():
	x=5
	y=6
	assert x+1 == y,"test failed"


#Pytest Fixtures: Fixtures are used when we want to run some code before every test method. So instead of repeating the same code in every test we define fixtures. Usually, fixtures are used to initialize database connections, pass the base , etc
#a test suite will have multiple test files and hundreds of test methods which will take a considerable amount of time to execute. Pytest allows us to run tests in parallel.