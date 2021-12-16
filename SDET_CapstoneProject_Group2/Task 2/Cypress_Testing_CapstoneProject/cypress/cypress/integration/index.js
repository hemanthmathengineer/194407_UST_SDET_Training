//<reference types = "cypress"/>

describe('urbanladder_testing module living', () => {

   it('Checking webpage - Scene 0', () => {
      cy.visit('https://www.urbanladder.com/')

      cy.url().should('include', 'ladder')
      cy.title().should('contain', 'Urban Ladder');
      cy.get('.header__topBar_logo').should('be.visible');


   })


   it('Searching item in the search bar - Scene 1', () => {

      cy.get('.tt-input').type('bed')


   })

   it('Submit the searched item - Scene 2', () => {

      cy.get("#search_button > span").click()


   })

   it('Flling the poped-up Login form - Scene 3', () => {


      cy.get("#spree_user_email").type("hemanthkumar@gmail.com")


   })

   it('Handling Authentication popup - Scene 4', () => {

      cy.get("#authentication_popup > div.vert-wrapper > div > div.popup-text.text-center.vert.large-6.columns > a.close-reveal-modal.hide-mobile").click()


   })

   it('Check box item - Scene 5', () => {

      cy.get("#filters_availability_In_Stock_Only").check()


   })

   it('Check boxing multiple items - Scene 6', () => {

      cy.get('.gname').invoke('show')
      cy.contains('Brand').click()

      cy.get("#filters_brand_name_By_Wood_Edge").check()
      //cy.get("#filters_brand_name_By_Boingg_-_A_Happy_Start").check()
      //cy.get("#filters_brand_name_By_Shri_Hari_Iron_Udyog").check()



   })

   it('Hovering and clicking buttons - Scene 7', () => {

      cy.get('.gname').invoke('show')
      cy.contains('Price').click()

      cy.get("#price_limit_4199-24999").click()
      //cy.get("#filters_brand_name_By_Boingg_-_A_Happy_Start").check()
      //cy.get("#filters_brand_name_By_Shri_Hari_Iron_Udyog").check()



   })

   it('Webpage controls - Scene 8', () => {

      cy.go('back')
      cy.wait(5000)
      cy.go('forward')

   })

   it('Performing message logs - Scene 9', () => {

      cy.url().should('include', 'products')
      cy.log('Cypress logging ')
      //cy.reload()


   })

   it('Verifying the number of elements - Scene 10', () => {

      cy.visit("https://www.urbanladder.com/")
      // assertion to validate count of sub-elements and class attribute value
      cy.get("#topnav_wrapper > ul > li.topnav_item.livingunit > div > div > ul > li:nth-child(2)").find('li').should('have.length', 5)

   })

   it('Verifying the number of elements - Scene 11', () => {

      cy.visit("https://www.urbanladder.com/")
      cy.get("#topnav_wrapper > ul > li.topnav_item.livingunit > div > div > ul > li:nth-child(1) > ul").find('li').should('have.length', 9)

   })




   it('Hooks example - Scene 12', function () {
      cy.log("Second Test")
   })
   before(function () {
      // executes once prior all tests in it block
      cy.log("Before hook")
   })
   after(function () {
      // executes once post all tests in it block
      cy.log("After hook")
   })
   beforeEach(function () {
      // executes prior each test within it block
      cy.log("BeforeEach hook")
   })
   afterEach(function () {
      // executes post each test within it block
      cy.log("AfterEac hook")
   })

   it('Module -2 checking module details - Scene 13', () => {
      cy.visit("https://www.urbanladder.com/living-room-sets?src=g_topnav_living_storage_living-room-sets");
      cy.url().should('include', 'living');
      cy.contains("Vector Living Room").click()
      cy.contains("Vector Living Room")

   })

   it('Verifying page content - Scene 14', () => {
      cy.visit("https://www.urbanladder.com/tv-units?src=cat_2");
      cy.url().should('include', 'tv');
      cy.contains("TV Units")
   })

   it('Check boxing function - Scene 15', () => {
      cy.get('[id="filters_availability_In_Stock_Only"]').first().check()

   })

   // Test case for bookshelves
   it('side and bookshelves page verification - Scene 16', function () {

      cy.visit("https://www.urbanladder.com/bookshelf?src=g_topnav_living_storage_bookshelves");
      cy.url().should('include', 'bookshelves');
      cy.contains("bookshelves")



   })
   it('radiobox check - Scene 17', function () {

      cy.get('[id="filters_availability_In_Stock_Only"]').first().check()
   })



   it('showcases page verfication - Scene 18', function () {

      cy.visit("https://www.urbanladder.com/showcase?src=g_topnav_living_storage_showcases");
      cy.url().should('include', 'showcases');
      cy.contains("Showcases")



   });

   it('filters - Scene 19', function () {

      cy.contains("Price").click()
      cy.get("#price_limit_5849-12959").first().click()
      cy.url().should('include', '5849-12959')
   });

   it('Module 3 - Visting page - Scenario 20', function () {
      // test step for URL launching
      cy.visit("https://www.urbanladder.com/")

   });

   it('Feature click using class selector Scenario 21', function () {
      cy.get('*[class^="topnav_item livingunit"]').click();
   });

   it('Assertion operation Scenario 22', function () {
      cy.visit("https://www.urbanladder.com/sofa-set?src=g_topnav_living_sofa-set");
      cy.url().should('include', 'sofa-set')

   });

   it('Selection procedure Scenario 23', function () {
      cy.get("#topnav_wrapper > ul > li.topnav_item.livingunit > span").click()
      cy.get("#topnav_wrapper > ul > li.topnav_item.livingunit > div > div > ul > li:nth-child(1) > div > a").click();

   });
   it('Clicking buttons Scenario 24', function () {
      cy.visit("https://www.urbanladder.com/fabric-sofas?src=g_topnav_living_sofa-set_fabric-sofa-sets")
      cy.contains("Price").first().click({ force: true })
      cy.get("#price_limit_9870-27395").first().click({ force: true })
   });

   it('Assertions operations discounts filtering - Scene - 25', function () {
      cy.visit("https://www.urbanladder.com/sofa-cum-bed?src=cat_2")
      cy.contains("Recommended").click()
      cy.contains("Discount").click()
      cy.url().should('include', 'discount');
   });



   it('Assertion operations on tables section Scene 26', () => {
      cy.visit("https://www.urbanladder.com/nested-tables-and-stools?src=g_topnav_living_tables_nested-tables");
      cy.url().should('include', 'tables');
      cy.contains("Nested Tables")

   })

   it('Check boxing availability status', () => {
      cy.get('[id="filters_availability_In_Stock_Only"]').first().check()

   })

   it('side and end tables page verification - Scene - 28', function () {

      cy.visit("https://www.urbanladder.com/side-tables-end-tables?src=g_topnav_living_tables_side-end-tables");
      cy.url().should('include', 'tables');
      cy.contains("side")



   });
   it('radiobox check - Scene 29', function () {

      cy.get('[id="filters_availability_In_Stock_Only"]').first().check()
   });


   it('coffee table sets page verfication Scene -30', function () {

      cy.visit("https://www.urbanladder.com/coffee-table-set?src=g_topnav_living_tables_coffee-table-sets");
      cy.url().should('include', 'sets');
      cy.contains("Coffee Table Sets")



   });

   it('filters - Scene 31', function () {

      cy.contains("Price").click()
      cy.get('[id="price_limit_9538-11808"]').first().click()
      cy.url().should('include', '9538-11808')
   });

})





















