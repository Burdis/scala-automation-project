package pages

import utils.Driver
import utils.MongoFactory
import utils.MongoHelpers._
import org.mongodb.scala._

object Page extends Driver with MongoFactory {

  def getTitle() = {

  }

  def navigateToPage(url: String) = {

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
