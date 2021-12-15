from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time
import unittest


class Test(unittest.TestCase):
    browser = webdriver.Chrome \
        (r"C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe")

    def setUp(self):
        url = 'https://www.urbanladder.com/'
        time.sleep(5)
        self.browser.get(url)
        time.sleep(2)
        self.browser.maximize_window()
        time.sleep(2)

    def test_login(self):
        self.browser.find_element(By.XPATH, "//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span").click()
        time.sleep(1)
        self.browser.find_element(By.LINK_TEXT, "Log In").click()
        time.sleep(5)
        self.browser.find_element(By.XPATH, "/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input").send_keys(
            "abc1111@gmail.com")
        time.sleep(2)
        self.browser.find_element(By.XPATH, "/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input"). \
            send_keys("Fk#mM!wGS9jvx4Z")
        self.browser.find_element(By.ID, "ul_site_login").click()
        print("Login successful")

    def test_Navigate_module(self):
        self.browser.find_element(By.XPATH, "/html/body/div[1]/header/div[2]/div/nav/div/ul/li[2]/span").click()
        time.sleep(5)
        self.browser.find_element(By.XPATH, "/html/body/div[1]/header/div[2]/div/nav/div/ul/li[2]/div/div/ul/li[1]/ul/li[1]/a/span").click();
        time.sleep(2)
        print("Navigated to Sofa set");

    def test_Sorting_checkbox(self):
        self.browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[2]/div/input").click()
        time.sleep(10)
        print("Checkboxing done")
        time.sleep(6)

    def test_Sorting_radiobutton(self):
        self.browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]").click()
        time.sleep(2)
        self.browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[2]/div/div/ul/li[2]/div[5]/label/input").click()
        print("Radiobutton for prices selected")
        time.sleep(1)

    def tearDown(self):
        time.sleep(4)
        #self.browser.close()


if __name__ == "__main__":
    unittest.main()
