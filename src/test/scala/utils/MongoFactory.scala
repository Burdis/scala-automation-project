package utils

import org.mongodb.scala._

trait MongoFactory {

  val client: MongoClient = MongoClient()
  val db: MongoDatabase = client.getDatabase("testDb")
  val collection: MongoCollection[Document] = db.getCollection("testCollection")

}
