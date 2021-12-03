#There will be some situations where we don’t want to execute a test, or a test case is not relevant for a particular time. In those situations, we have the option to Xfail the test or skip the tests

#The xfailed test will be executed, but it will not be counted as part failed or passed tests. There will be no traceback displayed if that test fails. We can xfail tests using

#@pytest.mark.xfail.

#Skipping a test means that the test will not be executed. We can skip tests using

#@pytest.mark.skip.

import pytest
@pytest.mark.skip
def test_add_1():
	assert 100+200 == 400,"failed"

@pytest.mark.skip
def test_add_2():
	assert 100+200 == 300,"failed"

@pytest.mark.xfail
def test_add_3():
	assert 15+13 == 28,"failed"

@pytest.mark.xfail
def test_add_4():
	assert 15+13 == 100,"failed"

def test_add_5():
	assert 3+2 == 5,"failed"

def test_add_6():
	assert 3+2 == 6,"failed"

#test_add_1 and test_add_2 are skipped and will not be executed.
#test_add_3 and test_add_4 are xfailed. These tests will be executed and will be part of xfailed(on test failure) or xpassed(on test pass) tests. There won’t be any traceback for failures.
#test_add_5 and test_add_6 will be executed and test_add_6 will report failure with traceback while the test_add_5 passes