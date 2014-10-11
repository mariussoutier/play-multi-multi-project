package controllers

import com.mariussoutier.example.model.User
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val user = User("Admin-User-2")
    Ok(views.html.index("Your new application is ready."))
  }

}
