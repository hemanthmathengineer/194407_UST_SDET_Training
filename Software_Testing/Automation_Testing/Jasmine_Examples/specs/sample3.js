var currentVal = 0; 

beforeEach(function() { 
   currentVal = 5; 
});  

describe("Different Methods of Expect Block",function() { 
   it("after each function ", function() {
      expect(currentVal).toEqual(5);     
   });
});