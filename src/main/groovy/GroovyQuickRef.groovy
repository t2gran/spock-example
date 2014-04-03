// Use 'def' to declare a variable or method, type is optional

def v
v = 1
assert v.class == Integer

v = 'String'
assert v.class == String

// Array
def a = ['abba', 'beatles']
assert a[0] == 'abba'
assert a[1..1] == ['beatles']

// Map
def days = [ Man:'Mandag', Tir:'Tirsdag', Ons:'Onsdag', Tor:'Torsdag', Fre:'Fredag', Lør:'Lørdag', Søn:'Søndag']

// Strings
def str = 'A "String" $days'
def gstr = "A GString can include variables $str or closures ${v + 3}."
def mline = """
    You can write
    on multiple lines
    using triple quotes: \"\"\".
"""

println """
    |Use pipes to define a margin:
    |
    |  x + y = 12
    |
""".stripMargin()

assert "Beatle".matches(/(\w|\d)+/)


// Control

if(true) println() else 1==1

for(i in 4..7) println i
3.times { println it }


// Closures
a.each( {s -> println s } )
a.each { println(it) }
a.each { println it }

assert a.find { it[0] == 'a' } == 'abba'
assert a.findAll { it[0] == 'a' } == [ 'abba' ]
assert a.any { it[0] == 'a'}
assert ! a.every { it[0] == 'a'}

days.values().collect { it.length() }.unique().sort().each { println it }
days.values().groupBy { day -> day.length() }.each { len, d -> println("$len: $d") }


assert a.inject(0) { int acc, e ->  acc + e.length() } == 11


// Class
class Person {
    int id
    String name
    @Override String toString() { properties }
}

def p = new Person(id: 12, name: "Thomas")

println p
