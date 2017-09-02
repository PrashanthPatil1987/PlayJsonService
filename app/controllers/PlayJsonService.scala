package controllers

import javax.inject._
import model.Person
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._ // Combinator syntax


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PlayJsonService @Inject()(cc: ControllerComponents) extends AbstractController(cc) {


  def get() = Action { request: Request[AnyContent]  =>
    Ok("Hey.. You just get started")
  }

  def postJson() = Action { request: Request[AnyContent]  =>
      val json = request.body.asJson.get
      val person = json.as[Person]
      Ok(person.name.capitalize)
  }

}


