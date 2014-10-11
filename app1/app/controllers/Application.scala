package controllers

import play.api._
import play.api.mvc._

import com.mariussoutier.example.model.User

object Application extends Controller {

  def index = Action {
    val user = User("Admin-User-1")
    Ok(views.html.index("Your new application is ready."))
  }

}
