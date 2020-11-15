def length_conversion():
    while True:
        try:
            feet = int(input("How many feet?"))
            inches = int(input("How many inches?"))
            assert feet > 0
            assert 0 <= inches <= 12
        except (ValueError, AssertionError):
            print("Feet must be a positive integer, try again.")
            print("Inches must be a positive number between 0 and 12, try again.")
            length_conversion()
        finally:
            answer = (feet * 0.3048) + (inches * 0.0254)
            return answer

def mass_conversion():
    while True:
        try:
            pounds = float(input("How many pounds?"))
            assert pounds > 0
        except (ValueError, AssertionError):
            print("Pounds must be a positive integer, try again.")
            mass_conversion()
        finally:
            answer = (pounds * 0.453592)
            return answer
        
def temp_conversion():
    while True:
        try:
            kelvin = float(input("What kelvin?"))
            assert kelvin >= 0
        except (ValueError, AssertionError):
            print("Kelvin must be a float above 0, try again.")
            temp_conversion()
        finally:
            answer = kelvin - 273.15
            return answer
        
def time_conversion():
    while True:
        try:
            hours = int(input("What hours?"))
            minutes = float(input("What minutes?"))
            assert hours >= 0
            assert 0 <= minutes <= 60
        except (ValueError):
            print("Kelvin must be a float, try again.")
            temp_conversion()
        finally:
            answer = int((hours * 60 * 60) + (minutes * 60))
            return answer
        
