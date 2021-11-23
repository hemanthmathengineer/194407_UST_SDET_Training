describe('mysuite', function()

{

it('verify the title pos', function()
{
cy.visit('https://demo.nopcommerce.com/')
cy.title().should('eq', 'nopCommerce demo store')
})
it('verify the title neg', function()
{
cy.visit('https://demo.nopcommerce.com/')
cy.title().should('eq', 'nopCommerce store')
})

})
