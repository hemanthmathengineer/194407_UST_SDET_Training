from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time


class Test:

    def __init__(self):
        self.s = Service(r"C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe")
        browser = webdriver.Chrome(service=self.s)
        url = 'https://www.urbanladder.com/'

        browser.get(url)
        browser.maximize_window()

        browser.find_element(By.XPATH, "//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span").click()
        time.sleep(1)
        browser.find_element(By.LINK_TEXT, "Log In").click()
        time.sleep(5)
        browser.find_element(By.XPATH, "/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/input").send_keys("abc1111@gmail.com")
        time.sleep(2)
        browser.find_element(By.XPATH, "/html/body/div[6]/div/div[1]/div/div[2]/div[3]/form/div/div/div/input").send_keys("Fk#mM!wGS9jvx4Z")
        browser.find_element(By.ID, "ul_site_login").click()
        print("Login successful 1")

        browser.find_element(By.XPATH, "/html/body/div[1]/header/div[2]/div/nav/div/ul/li[2]/span").click()
        time.sleep(2)
        #browser.find_element(By.LINK_TEXT, "Sofa Set").click();
        print("Navigated to Sofa set page 1");

        browser.find_element(By.XPATH, "/html/body/div[1]/header/div[2]/div/nav/div/ul/li[2]/div/div/ul/li[1]/ul/li[1]/a/span").click()
        time.sleep(4)
        browser.find_element(By.ID, "filters_availability_In_Stock_Only").click()
        print("Check boxing availablity stock 1")
        time.sleep(10)

        browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[4]/div[1]").click()
        print("Clicking on brand 1")
        time.sleep(2)
        browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[4]/div[2]/div/div/div/ul/li[2]/label").click()
        print("Seleting brand 1")
        time.sleep(1)

        browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]").click()
        print("Clicking on price 1")
        time.sleep(2)
        browser.find_element(By.XPATH, "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[2]/div/div/ul/li[2]/div[2]/label/input").click()
        print("Seleting price filter button 1")
        time.sleep(3)

        # Test 2
        browser.get("https://www.urbanladder.com/balcony-chairs?src=g_topnav_living_balcony-outdoor_balcony-chairs")
        browser.find_element(By.ID, "filters_availability_In_Stock_Only").click()
        print("Check boxing availablity stock 2")
        time.sleep(10)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[3]/div[1]").click()
        print("Clicking on material 2")
        time.sleep(2)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[3]/div[2]/div/div/div/ul/li[1]/input").click()
        print("Seleted material 2")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]").click()
        print("clicked price 2")
        time.sleep(3)
        browser.find_element(By.ID, "price_limit_1704-27303").click()
        print("Selected a price range 2")
        time.sleep(3)
        browser.get("https://www.urbanladder.com/products/kyodo-swing-chair-with-stand?sku=FNODSW85OR30011&src=subcat")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[6]/form/div/div[2]/div[1]/div[3]/button").click()
        print("Product is added to cart 2")
        browser.find_element(By.ID, "checkout-link").click()
        print("clicked checkout 2")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[2]/div/input").send_keys("683580")
        time.sleep(3)

        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[7]/div/textarea").send_keys("aaabbbbccc")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[8]/div/input").send_keys("xxxxx")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[9]/div/input").send_keys("yyyyyy")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[10]/div/div/input").send_keys("123456790")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div/input").send_keys("gst105")
        browser.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[2]/input").click()


        # Test 3
        browser.get("https://www.urbanladder.com/bookshelf?src=g_topnav_living_storage_bookshelves")
        browser.find_element(By.ID, "filters_availability_In_Stock_Only").click()
        print("Check boxing availablity stock 3")
        time.sleep(10)
        browser.find_element(By.XPATH,
                             "/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[4]/div[1]").click()
        print("Clicking on material 3")
        time.sleep(2)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]").click()
        print("clicked price 3")
        time.sleep(3)
        browser.find_element(By.ID, "price_limit_9000-15999").click()
        print("Selected a price range 3")
        time.sleep(3)
        browser.get("https://www.urbanladder.com/products/theodore-open-display-cabinet?sku=FNSGDR33WG10001&src=subcat")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[4]/form/div/div[2]/div/div[3]/button").click()
        print("Product is added to cart 3")
        browser.find_element(By.ID, "checkout-link").click()
        print("clicked checkout 3")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[2]/div/input").send_keys("683580")
        time.sleep(3)

        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[7]/div/textarea").send_keys("aaabbbbccc")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[8]/div/input").send_keys("xxxxx")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[9]/div/input").send_keys("yyyyyy")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[10]/div/div/input").send_keys("123456790")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div/input").send_keys("gst105")
        browser.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[2]/input").click()


        #Test 4
        browser.get("https://www.urbanladder.com/coffee-table?src=g_topnav_living_tables_coffee-tables")
        browser.find_element(By.ID, "filters_availability_In_Stock_Only").click()
        print("Check boxing availablity stock 4")
        time.sleep(10)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[5]/div[1]").click()
        print("Clicking on material 4")
        time.sleep(2)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[5]/div[2]/div/div/div[1]/ul/li[5]/input").click()
        print("Selected table material 4")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]").click()
        print("clicked price 4")
        time.sleep(3)
        browser.find_element(By.ID, "price_limit_5000-8999").click()
        print("Selected a price range 4")
        time.sleep(3)
        browser.get("https://www.urbanladder.com/products/botwin-coffee-table?sku=FNTBCF11MH10131&src=subcat")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[7]/form/div/div[2]/div[1]/div[3]/button").click()
        print("Product is added to cart 4")
        browser.find_element(By.ID, "checkout-link").click()
        print("clicked checkout 4")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[2]/div/input").send_keys("683580")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[7]/div/textarea").send_keys("aaabbbbccc")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[8]/div/input").send_keys("xxxxx")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[9]/div/input").send_keys("yyyyyy")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[10]/div/div/input").send_keys("123456790")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div/input").send_keys("gst105")
        browser.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[2]/input").click()


        #Test 5
        browser.get("https://www.urbanladder.com/rocking-chairs-living?src=g_topnav_living_chairs_rocking-chairs")
        browser.find_element(By.ID, "filters_availability_In_Stock_Only").click()
        print("Check boxing availablity stock 5")
        time.sleep(10)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[2]/div[1]").click()
        print("Clicked on finish 5")
        time.sleep(2)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[2]/div[2]/div/div/div/ul/li[1]/input").click()
        print("Selected finish 5")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]").click()
        print("clicked price 5")
        time.sleep(3)
        browser.find_element(By.ID, "price_limit_32264-38631").click()
        print("Selected a price range 5")
        time.sleep(3)
        browser.get("https://www.urbanladder.com/products/michael-rocking-chair?sku=FVSTCH62BR10136&src=subcat")
        browser.find_element(By.XPATH,"/html/body/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[4]/form/div/div[2]/div/div[3]/button").click()
        print("Product is added to cart 5")
        browser.find_element(By.ID, "checkout-link").click()
        print("clicked checkout 5")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[2]/div/input").send_keys(
            "683580")
        time.sleep(3)
        browser.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[7]/div/textarea").send_keys(
            "aaabbbbccc")
        browser.find_element(By.XPATH,
                             "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[8]/div/input").send_keys(
            "xxxxx")
        browser.find_element(By.XPATH,
                             "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[9]/div/input").send_keys(
            "yyyyyy")
        browser.find_element(By.XPATH,
                             "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[1]/fieldset/ul/li[10]/div/div/input").send_keys(
            "123456790")
        browser.find_element(By.XPATH,
                             "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div/input").send_keys(
            "gst105")
        browser.find_element(By.XPATH, "/html/body/div[1]/div[1]/div[2]/div/div[3]/div[1]/form/div[2]/input").click()
        browser.close()


ob1 = Test()