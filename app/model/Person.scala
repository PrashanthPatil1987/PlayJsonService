package model
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._



  case class Person(name: String, age: Int)

  object Person {
    implicit val PersonFormat = {
      val jsonDes =
        (__ \ "name").format[String] and (__ \ "age").format[Int]
      jsonDes(Person.apply _, unlift(Person.unapply))
    }
  }


