import pytest
import requests
@pytest.fixture
def supply_url():
	return "https://reqres.in/api"