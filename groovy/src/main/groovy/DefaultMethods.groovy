interface Greetable {
    String target()

    default String salutation() {
        'Greetings'
    }

    default String greet() {
        "${salutation()}, ${target()}"
    }
}

class Friend implements Greetable {
    String name

    @Override
    String target() {
        return name
    }

    @Override
    String salutation() {
        return 'Hi'
    }
}

def friend = new Friend(name: 'Pat')
println friend.greet()