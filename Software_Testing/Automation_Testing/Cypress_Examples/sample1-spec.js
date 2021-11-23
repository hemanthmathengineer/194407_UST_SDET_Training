describe('simple Test', function () {
    // Test case
       it('Scenario 1', function (){

         cy.visit("http://127.0.0.1:5500/Project-specfile.html");
          cy.url().should('include', 'Project')

       });

       it('Scenario 2', function (){

         cy.get('[type="radio"]').first().check()
      });
      it('Scenario 3', function (){

         cy.get('[type="checkbox"]').first().check()
      });
      
      it('Scenario 4', function (){

         cy.title().should('eq', 'Angular JS Forms')
      });

      it('Scenario 5', function (){

         cy.get('[name="firstname"]').type(' kumar')
         cy.get('[name="lastname"]').type('A V')
         cy.get('[name="email"]').type('hemanth@gmail.com')
         cy.get('[name="Phone"]').type('949186559595')
        
      });

      it('Scenario 6', function (){

         cy.get('[value="Jump"]').check()
      });

      it('Scenario 7', function (){

         cy.get('[value="Spanish"]').check()
      });
      it('Scenario 8', function (){

         cy.get('#location').select('Cochin')
      });

      it('Scenario 9', function (){

         cy.get('#location').select('Trivandrum')
      });


      it('Scenario 10', function (){

         cy.visit("http://127.0.0.1:5500/Project-specfile.html")
         cy.get('#mstatus').select('Married')
         
         }); 
      });














      



