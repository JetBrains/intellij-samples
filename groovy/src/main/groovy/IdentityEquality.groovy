

class Creature { String type }

def houseCat = new Creature(type: 'cat')
def copyHouseCat = houseCat
def lion = new Creature(type: 'cat')

assert !houseCat.equals(lion) // Java logical equality
assert houseCat != lion       // Groovy shorthand operator

assert houseCat.is(copyHouseCat)  // Groovy identity
assert houseCat === copyHouseCat  // operator shorthand
assert houseCat !== lion          // negated operator shorthand

