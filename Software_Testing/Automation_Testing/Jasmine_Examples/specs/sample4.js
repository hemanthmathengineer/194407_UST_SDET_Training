var myCustomMatchers = {
    // toBeAllowedToDrive matcher
    // Usage: expect(age).toBeAllowedToDrive();
    //        expect(age).not.toBeAllowedToDrive();
    toBeAllowedToDrive: function() {
      return {
        compare: function(age) {
          var result = {};
          result.pass = age>16;
  
          if (result.pass) {
            result.message = "Expected " + age + " to be allowed to drive";
          } else {
            result.message = "Expected " + age + " to be allowed to drive, but it was not";
          }
          return result;
        }
      };
    }
  };
  
  
  describe("Custom matcher: 'toBeAllowedToDrive'", function() {
    var John = 17,
      Mary = 16;
  
    // Custom Matchers must be added using beforeEach
    beforeEach(function() {
      jasmine.addMatchers(myCustomMatchers);
    });
  
    it("should allow John to drive", function() {
      expect(John).toBeAllowedToDrive();
      // replaces 
      expect(John).toBeGreaterThan(16);
    });
  
    it("should not allow Mary to drive", function() {
      expect(Mary).not.toBeAllowedToDrive();
      // replaces 
      expect(Mary).not.toBeGreaterThan(16);
    });
  });
  
  