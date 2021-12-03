#The purpose of parameterizing a test is to run a test against multiple sets of arguments. We can do this by @pytest.mark.parametrize.

#Running the same test against multiple arguments

import pytest
@pytest.mark.parametrize("input1, input2, output",[(5,5,10),(3,5,8)])
def test_add(input1, input2, output):
	assert input1+input2 == output,"failed"