const { Builder, By, Key, until } = require('selenium-webdriver');
require('chromedriver');
const driver = new Builder()
    .forBrowser('chrome')
    .build();

jasmine.DEFAULT_TIMEOUT_INTERVAL = 20 * 1000;

describe('Selenium test case for login page', () => {
    it('Should navigate to Demo Page', async function () {
        await driver.get('https://accounts.lambdatest.com/login');
        await driver.getCurrentUrl().then((url) => {
            expect(url).toBe('https://accounts.lambdatest.com/login');
            driver.findElement(By.name("email")).sendKeys("hemanth@gmail.com");
            driver.findElement(By.name("password")).sendKeys("gmail.com");
        });
    });
    it('testcase 2', async function () {
            await driver.get('https://accounts.lambdatest.com/login');
            await driver.findElement(By.name("email")).sendKeys("hemanth@gmail.com");
            await driver.findElement(By.name("password")).sendKeys("gmail.com");        
        
    });
});