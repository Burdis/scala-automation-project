package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.Matchers
import pages.Page

class CommonSteps extends ScalaDsl with EN with Matchers {

  Given("""^I navigate to (.*)"""){ (url: String) =>

  }

  Then("""I should be on the title (.*)"""){ (title: String) =>

  }
}
