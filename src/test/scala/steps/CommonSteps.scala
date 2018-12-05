package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.Matchers
import pages.Page

class CommonSteps extends ScalaDsl with EN with Matchers {

  Given("""^I navigate to (.*)$"""){ (url: String) =>

  }

  Then("""^I should be on the title (.*)$"""){ (title: String) =>

  }

  Given("""I clear down the collection and add a record"""){ () =>
    Page.dropCollection()
    Page.addRecord()
  }

  And("""I close the connection"""){ () =>
    Page.closeConnection()
  }
}
