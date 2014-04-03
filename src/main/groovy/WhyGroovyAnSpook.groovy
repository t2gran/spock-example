/**
 * @author Thomas Gran (tgr@capraconsulting.no)
 * @since ${VERSION_X_Y}
 */
/**
 * @author Thomas Gran (tgr@capraconsulting.no)
 */
class WhyGroovyAnSpook {
    def publisher, event, subscriber

    def text = """

    GROOVY

        o Dynamisk Språk
        o Zero learning curve for Java developers
        o Optionally types
        o Easy to read and maintain


    SPOCK
        o Inspired from JUnit, RSpec, jMock, Mockito, Groovy, Scala, Vulcans
        o Easy, simple and elegant
        o Eliminate waste
        o Detailed feadback:

    Condition not satisfied:

    max(a, b) == c
    |   |  |  |  |
    3   1  3  |  2
              false


        o You as a user is in focus
            - No static methods to remember
        o Test-first? Test-last? Unit-level? Integration-level? Test-driven? Behavior-driven?
          Many ways to create good software, and try to give you the flexibility to do it your way.

        o Fokuser på å utrykke hva som skal testes ikke hvordan:
"""

    def "subscribers receive published events at least once"() {
        when: publisher.send(event)
        then: (1.._) * subscriber.receive(event)
        where: event << ["started", "paused", "stopped"]
    }

def andMore = """

        o Extendable and integrates with other framworks like Spring
        o Lite weight (compared to Cucumber and Fitnesse)

        o https://github.com/spockframework/spock


"""

}
