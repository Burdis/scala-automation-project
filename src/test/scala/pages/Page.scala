package pages

import utils.Driver
import utils.MongoFactory
import utils.MongoHelpers._
import org.mongodb.scala._

object Page extends Driver with MongoFactory {

  def getTitle() = {
    driver.getTitle
  }

  def navigateToPage(url: String) = {
    driver.navigate().to(url)
  }

  def dropCollection() = {

    collection.drop().results()
  }

  def addRecord() = {

    val doc: Document = Document("name" -> "testRecord")

    collection.insertOne(doc).results()
  }

  def closeConnection() = {

    client.close()
  }
}
